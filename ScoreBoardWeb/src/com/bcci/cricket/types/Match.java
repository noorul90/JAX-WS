
package com.bcci.cricket.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="series-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="series-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="team1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="team2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="match-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesName",
    "seriesType",
    "team1",
    "team2",
    "matchDate",
    "location"
})
@XmlRootElement(name = "match")
public class Match {

    @XmlElement(name = "series-name", required = true)
    protected String seriesName;
    @XmlElement(name = "series-type", required = true)
    protected String seriesType;
    @XmlElement(required = true)
    protected String team1;
    @XmlElement(required = true)
    protected String team2;
    @XmlElement(name = "match-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar matchDate;
    @XmlElement(required = true)
    protected String location;

    /**
     * Gets the value of the seriesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * Sets the value of the seriesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesName(String value) {
        this.seriesName = value;
    }

    /**
     * Gets the value of the seriesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesType() {
        return seriesType;
    }

    /**
     * Sets the value of the seriesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesType(String value) {
        this.seriesType = value;
    }

    /**
     * Gets the value of the team1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * Sets the value of the team1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam1(String value) {
        this.team1 = value;
    }

    /**
     * Gets the value of the team2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * Sets the value of the team2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam2(String value) {
        this.team2 = value;
    }

    /**
     * Gets the value of the matchDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatchDate() {
        return matchDate;
    }

    /**
     * Sets the value of the matchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatchDate(XMLGregorianCalendar value) {
        this.matchDate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
