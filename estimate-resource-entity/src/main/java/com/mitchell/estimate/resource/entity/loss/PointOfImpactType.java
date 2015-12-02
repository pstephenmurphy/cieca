package com.mitchell.estimate.resource.entity.loss;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointOfImpactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfImpactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POICode" type="{http://www.cieca.com/BMS}PointOfImpactClosedEnumType" minOccurs="0"/>
 *         &lt;element name="POIDesc" type="{http://www.cieca.com/BMS}PointofImpactDescClosedEnumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfImpactType", propOrder = {
    "poiCode",
    "poiDesc"
})
public class PointOfImpactType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "POICode")
    protected String poiCode;
    @XmlElement(name = "POIDesc")
    protected PointofImpactDescEnum poiDesc;

    /**
     * Gets the value of the poiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOICode() {
        return poiCode;
    }

    /**
     * Sets the value of the poiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOICode(String value) {
        this.poiCode = value;
    }

    /**
     * Gets the value of the poiDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PointofImpactDescEnum }
     *     
     */
    public PointofImpactDescEnum getPOIDesc() {
        return poiDesc;
    }

    /**
     * Sets the value of the poiDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointofImpactDescEnum }
     *     
     */
    public void setPOIDesc(PointofImpactDescEnum value) {
        this.poiDesc = value;
    }

}
