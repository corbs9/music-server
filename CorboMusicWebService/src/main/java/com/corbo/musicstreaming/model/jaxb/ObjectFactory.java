//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.06 at 03:56:57 PM GMT 
//


package com.corbo.musicstreaming.model.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.corbo.musicstreaming.model.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.corbo.musicstreaming.model.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MusicList }
     * 
     */
    public MusicList createMusicList() {
        return new MusicList();
    }

    /**
     * Create an instance of {@link ArtistList }
     * 
     */
    public ArtistList createArtistList() {
        return new ArtistList();
    }

    /**
     * Create an instance of {@link TrackCplxType }
     * 
     */
    public TrackCplxType createTrackCplxType() {
        return new TrackCplxType();
    }

    /**
     * Create an instance of {@link TrackList }
     * 
     */
    public TrackList createTrackList() {
        return new TrackList();
    }

    /**
     * Create an instance of {@link AlbumList }
     * 
     */
    public AlbumList createAlbumList() {
        return new AlbumList();
    }

    /**
     * Create an instance of {@link AlbumCplxType }
     * 
     */
    public AlbumCplxType createAlbumCplxType() {
        return new AlbumCplxType();
    }

    /**
     * Create an instance of {@link ArtistCplxType }
     * 
     */
    public ArtistCplxType createArtistCplxType() {
        return new ArtistCplxType();
    }

}
