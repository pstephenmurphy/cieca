package com.mitchell.estimate.resource.entity.parts;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartsTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartsTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MissingParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *         &lt;element name="AdditionalParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *         &lt;element name="NonStandardParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *         &lt;element name="DamagedParts" type="{http://www.cieca.com/BMS}PartsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartsTypeType", propOrder = {
    "missingParts",
    "additionalParts",
    "nonStandardParts",
    "damagedParts"
})
public class PartsTypeType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "MissingParts")
    protected PartsType missingParts;
    @XmlElement(name = "AdditionalParts")
    protected PartsType additionalParts;
    @XmlElement(name = "NonStandardParts")
    protected PartsType nonStandardParts;
    @XmlElement(name = "DamagedParts")
    protected PartsType damagedParts;

    /**
     * Gets the value of the missingParts property.
     * 
     * @return
     *     possible object is
     *     {@link PartsType }
     *     
     */
    public PartsType getMissingParts() {
        return missingParts;
    }

    /**
     * Sets the value of the missingParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartsType }
     *     
     */
    public void setMissingParts(PartsType value) {
        this.missingParts = value;
    }

    /**
     * Gets the value of the additionalParts property.
     * 
     * @return
     *     possible object is
     *     {@link PartsType }
     *     
     */
    public PartsType getAdditionalParts() {
        return additionalParts;
    }

    /**
     * Sets the value of the additionalParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartsType }
     *     
     */
    public void setAdditionalParts(PartsType value) {
        this.additionalParts = value;
    }

    /**
     * Gets the value of the nonStandardParts property.
     * 
     * @return
     *     possible object is
     *     {@link PartsType }
     *     
     */
    public PartsType getNonStandardParts() {
        return nonStandardParts;
    }

    /**
     * Sets the value of the nonStandardParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartsType }
     *     
     */
    public void setNonStandardParts(PartsType value) {
        this.nonStandardParts = value;
    }

    /**
     * Gets the value of the damagedParts property.
     * 
     * @return
     *     possible object is
     *     {@link PartsType }
     *     
     */
    public PartsType getDamagedParts() {
        return damagedParts;
    }

    /**
     * Sets the value of the damagedParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartsType }
     *     
     */
    public void setDamagedParts(PartsType value) {
        this.damagedParts = value;
    }

}
