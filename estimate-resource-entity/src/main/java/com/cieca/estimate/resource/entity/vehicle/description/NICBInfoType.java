package com.cieca.estimate.resource.entity.vehicle.description;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NICBInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NICBInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NICBMake" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *         &lt;element name="NICBModel" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *         &lt;element name="NICBBodyStyle" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NICBInfoType", propOrder = {
    "nicbMake",
    "nicbModel",
    "nicbBodyStyle"
})
public class NICBInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "NICBMake")
    protected String nicbMake;
    @XmlElement(name = "NICBModel")
    protected String nicbModel;
    @XmlElement(name = "NICBBodyStyle")
    protected String nicbBodyStyle;

    /**
     * Gets the value of the nicbMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICBMake() {
        return nicbMake;
    }

    /**
     * Sets the value of the nicbMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICBMake(String value) {
        this.nicbMake = value;
    }

    /**
     * Gets the value of the nicbModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICBModel() {
        return nicbModel;
    }

    /**
     * Sets the value of the nicbModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICBModel(String value) {
        this.nicbModel = value;
    }

    /**
     * Gets the value of the nicbBodyStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICBBodyStyle() {
        return nicbBodyStyle;
    }

    /**
     * Sets the value of the nicbBodyStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICBBodyStyle(String value) {
        this.nicbBodyStyle = value;
    }

}
