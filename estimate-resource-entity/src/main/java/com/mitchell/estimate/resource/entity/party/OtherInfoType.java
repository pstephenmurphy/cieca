package com.mitchell.estimate.resource.entity.party;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherInfoCode" type="{http://www.cieca.com/BMS}Char_80"/>
 *         &lt;element name="OtherInfoData" type="{http://www.cieca.com/BMS}Char_80"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherInfoType", propOrder = {
    "otherInfoCode",
    "otherInfoData"
})
public class OtherInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "OtherInfoCode", required = true)
    protected String otherInfoCode;
    @XmlElement(name = "OtherInfoData", required = true)
    protected String otherInfoData;

    /**
     * Gets the value of the otherInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfoCode() {
        return otherInfoCode;
    }

    /**
     * Sets the value of the otherInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfoCode(String value) {
        this.otherInfoCode = value;
    }

    /**
     * Gets the value of the otherInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfoData() {
        return otherInfoData;
    }

    /**
     * Sets the value of the otherInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfoData(String value) {
        this.otherInfoData = value;
    }

}
