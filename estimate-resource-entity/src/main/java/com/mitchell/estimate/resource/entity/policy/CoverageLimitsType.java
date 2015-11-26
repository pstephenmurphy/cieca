package com.mitchell.estimate.resource.entity.policy;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="PerPersonLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PerOccurrenceLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PerDayRentalLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
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
    "perPersonLimit",
    "perOccurrenceLimit",
    "perDayRentalLimit"
})
public class CoverageLimitsType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "PerPersonLimit")
    protected BigDecimal perPersonLimit;
    
    @XmlElement(name = "PerOccurrenceLimit")
    protected BigDecimal perOccurrenceLimit;
    
    @XmlElement(name = "PerDayRentalLimit")
    protected BigDecimal perDayRentalLimit;

    /**
     * Gets the value of the perPersonLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerPersonLimit() {
        return perPersonLimit;
    }

    /**
     * Sets the value of the perPersonLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerPersonLimit(BigDecimal value) {
        this.perPersonLimit = value;
    }

    /**
     * Gets the value of the perOccurrenceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerOccurrenceLimit() {
        return perOccurrenceLimit;
    }

    /**
     * Sets the value of the perOccurrenceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerOccurrenceLimit(BigDecimal value) {
        this.perOccurrenceLimit = value;
    }

    /**
     * Gets the value of the perDayRentalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerDayRentalLimit() {
        return perDayRentalLimit;
    }

    /**
     * Sets the value of the perDayRentalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerDayRentalLimit(BigDecimal value) {
        this.perDayRentalLimit = value;
    }

}