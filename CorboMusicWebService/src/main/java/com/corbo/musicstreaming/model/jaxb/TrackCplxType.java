//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.06 at 03:56:57 PM GMT 
//


package com.corbo.musicstreaming.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trackCplxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackCplxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="albumName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="artistName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackCplxType", propOrder = {
    "trackName",
    "trackId",
    "albumName",
    "artistName",
    "trackNumber"
})
public class TrackCplxType {

    @XmlElement(required = true)
    protected String trackName;
    @XmlElement(required = true)
    protected String trackId;
    @XmlElement(required = true)
    protected String albumName;
    @XmlElement(required = true)
    protected String artistName;
    @XmlElement(required = true)
    protected String trackNumber;

    /**
     * Gets the value of the trackName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * Sets the value of the trackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackName(String value) {
        this.trackName = value;
    }

    /**
     * Gets the value of the trackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackId(String value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the albumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * Sets the value of the albumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlbumName(String value) {
        this.albumName = value;
    }

    /**
     * Gets the value of the artistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Sets the value of the artistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistName(String value) {
        this.artistName = value;
    }

    /**
     * Gets the value of the trackNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackNumber() {
        return trackNumber;
    }

    /**
     * Sets the value of the trackNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackNumber(String value) {
        this.trackNumber = value;
    }

}
