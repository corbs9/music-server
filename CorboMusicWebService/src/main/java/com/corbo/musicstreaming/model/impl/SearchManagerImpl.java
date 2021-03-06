package com.corbo.musicstreaming.model.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.corbo.musicstreaming.entity.Artist;
import com.corbo.musicstreaming.entity.Track;
import com.corbo.musicstreaming.factory.ObjectFactory;
import com.corbo.musicstreaming.model.CallResult;
import com.corbo.musicstreaming.model.SearchManager;
import com.corbo.musicstreaming.model.jaxb.MusicList;
import com.corbo.musicstreaming.repository.ArtistRepository;
import com.corbo.musicstreaming.repository.TrackRepository;
import com.corbo.musicstreaming.util.AppUtils;

@Controller
public class SearchManagerImpl implements SearchManager {

	@Autowired
	private TrackRepository trackRepository;
	
	@Autowired
	private ArtistRepository artistRepository;
	
	public CallResult<MusicList> searchForTracksByArtist(String artist) {
		artist = AppUtils.formatTextStringForCassandra(artist);
		Collection<Track> trackCollection = trackRepository.findByArtistName(artist);
		if (!trackCollection.isEmpty()) {
			return new CallResult<MusicList>(200, ObjectFactory.createMusicListFromTrackList(trackCollection));
		}
		return new CallResult<MusicList>(404, null);
	}
	
	public CallResult<MusicList> getArtistsByFirstLetter(String firstLetter) {
		Collection<Artist> artists = artistRepository.findByFirstLetterIgnoreCase(firstLetter);
		if (!artists.isEmpty()) {
			return new CallResult<MusicList>(200, ObjectFactory.createMusicListArtists(artists));
		}
		return new CallResult<MusicList>(404, null);
	}
}
