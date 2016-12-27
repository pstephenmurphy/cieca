package com.cieca.estimate.resource.entity.damage;

import java.io.Serializable;

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
 *         &lt;element name="PartSubletInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LaborSubletInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="OtherChargesSubletInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
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
    "partSubletInd",
    "laborSubletInd",
    "otherChargesSubletInd"
})
public class SubletInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "PartSubletInd")
    protected Boolean partSubletInd;
    
    @XmlElement(name = "LaborSubletInd")
    protected Boolean laborSubletInd;
    
    @XmlElement(name = "OtherChargesSubletInd")
    protected Boolean otherChargesSubletInd;

    /**
     * Gets the value of the partSubletInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPartSubletInd() {
        return partSubletInd;
    }

    /**
     * Sets the value of the partSubletInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartSubletInd(Boolean value) {
        this.partSubletInd = value;
    }

    /**
     * Gets the value of the laborSubletInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLaborSubletInd() {
        return laborSubletInd;
    }

    /**
     * Sets the value of the laborSubletInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborSubletInd(Boolean value) {
        this.laborSubletInd = value;
    }

    /**
     * Gets the value of the otherChargesSubletInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOtherChargesSubletInd() {
        return otherChargesSubletInd;
    }

    /**
     * Sets the value of the otherChargesSubletInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherChargesSubletInd(Boolean value) {
        this.otherChargesSubletInd = value;
    }

}
