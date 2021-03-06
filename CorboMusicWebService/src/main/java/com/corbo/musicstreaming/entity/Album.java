package com.corbo.musicstreaming.entity;

import java.util.UUID;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("album")
public class Album {

	@PrimaryKey(value = "id")
	private UUID albumId;

	@Column(value = "name")
	private String albumName;

	@Column(value = "artist_name")
	private String artistName;

	/**
	 * @return the albumId
	 */
	public UUID getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId
	 *            the albumId to set
	 */
	public void setAlbumId(UUID albumId) {
		this.albumId = albumId;
	}

	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}

	/**
	 * @param albumName
	 *            the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * @param artistName
	 *            the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
