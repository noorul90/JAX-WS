
package com.bcci.cricket.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="inning-no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="batting-team" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bowling-team" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="running-score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bowling-over" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="wicket" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "inningNo",
    "battingTeam",
    "bowlingTeam",
    "runningScore",
    "bowlingOver",
    "wicket"
})
@XmlRootElement(name = "score")
public class Score {

    @XmlElement(name = "inning-no")
    protected int inningNo;
    @XmlElement(name = "batting-team", required = true)
    protected String battingTeam;
    @XmlElement(name = "bowling-team", required = true)
    protected String bowlingTeam;
    @XmlElement(name = "running-score")
    protected int runningScore;
    @XmlElement(name = "bowling-over")
    protected float bowlingOver;
    protected int wicket;

    /**
     * Gets the value of the inningNo property.
     * 
     */
    public int getInningNo() {
        return inningNo;
    }

    /**
     * Sets the value of the inningNo property.
     * 
     */
    public void setInningNo(int value) {
        this.inningNo = value;
    }

    /**
     * Gets the value of the battingTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBattingTeam() {
        return battingTeam;
    }

    /**
     * Sets the value of the battingTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBattingTeam(String value) {
        this.battingTeam = value;
    }

    /**
     * Gets the value of the bowlingTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBowlingTeam() {
        return bowlingTeam;
    }

    /**
     * Sets the value of the bowlingTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBowlingTeam(String value) {
        this.bowlingTeam = value;
    }

    /**
     * Gets the value of the runningScore property.
     * 
     */
    public int getRunningScore() {
        return runningScore;
    }

    /**
     * Sets the value of the runningScore property.
     * 
     */
    public void setRunningScore(int value) {
        this.runningScore = value;
    }

    /**
     * Gets the value of the bowlingOver property.
     * 
     */
    public float getBowlingOver() {
        return bowlingOver;
    }

    /**
     * Sets the value of the bowlingOver property.
     * 
     */
    public void setBowlingOver(float value) {
        this.bowlingOver = value;
    }

    /**
     * Gets the value of the wicket property.
     * 
     */
    public int getWicket() {
        return wicket;
    }

    /**
     * Sets the value of the wicket property.
     * 
     */
    public void setWicket(int value) {
        this.wicket = value;
    }

}
