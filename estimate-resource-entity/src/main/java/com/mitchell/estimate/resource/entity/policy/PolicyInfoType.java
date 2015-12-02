package com.mitchell.estimate.resource.entity.policy;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.mitchell.estimate.resource.entity.address.StateProvinceEnum;


/**
 * <p>Java class for PolicyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyNum" type="{http://www.cieca.com/BMS}PolicyNumType" minOccurs="0"/>
 *         &lt;element name="PolicyType" type="{http://www.cieca.com/BMS}PolicyTypeEnum" minOccurs="0"/>
 *         &lt;element name="PolicyStateProvince" type="{http://www.cieca.com/BMS}StateProvinceEnum" minOccurs="0"/>
 *         &lt;element name="PolicyEffectiveDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="PolicyExpirationDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CoverageInfo" type="{http://www.cieca.com/BMS}CoverageInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyInfoType", propOrder = {
    "policyNum",
    "policyType",
    "policyStateProvince",
    "policyEffectiveDateTime",
    "policyExpirationDateTime",
    "coverageInfo"
})
public class PolicyInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "PolicyNum")
    protected String policyNum;
    
    @XmlElement(name = "PolicyType")
    protected PolicyTypeEnum policyType;
    
    @XmlElement(name = "PolicyStateProvince")
    protected StateProvinceEnum policyStateProvince;
    
    @XmlElement(name = "PolicyEffectiveDateTime")
    protected XMLGregorianCalendar policyEffectiveDateTime;
    
    @XmlElement(name = "PolicyExpirationDateTime")
    protected XMLGregorianCalendar policyExpirationDateTime;
    
    @XmlElement(name = "CoverageInfo")
    protected CoverageInfoType coverageInfo;

    /**
     * Gets the value of the policyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNum() {
        return policyNum;
    }

    /**
     * Sets the value of the policyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNum(String value) {
        this.policyNum = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyTypeEnum }
     *     
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyTypeEnum }
     *     
     */
    public void setPolicyType(PolicyTypeEnum value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the policyStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceEnum }
     *     
     */
    public StateProvinceEnum getPolicyStateProvince() {
        return policyStateProvince;
    }

    /**
     * Sets the value of the policyStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceEnum }
     *     
     */
    public void setPolicyStateProvince(StateProvinceEnum value) {
        this.policyStateProvince = value;
    }

    /**
     * Gets the value of the policyEffectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyEffectiveDateTime() {
        return policyEffectiveDateTime;
    }

    /**
     * Sets the value of the policyEffectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyEffectiveDateTime(XMLGregorianCalendar value) {
        this.policyEffectiveDateTime = value;
    }

    /**
     * Gets the value of the policyExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyExpirationDateTime() {
        return policyExpirationDateTime;
    }

    /**
     * Sets the value of the policyExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyExpirationDateTime(XMLGregorianCalendar value) {
        this.policyExpirationDateTime = value;
    }

    /**
     * Gets the value of the coverageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageInfoType }
     *     
     */
    public CoverageInfoType getCoverageInfo() {
        return coverageInfo;
    }

    /**
     * Sets the value of the coverageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageInfoType }
     *     
     */
    public void setCoverageInfo(CoverageInfoType value) {
        this.coverageInfo = value;
    }

}
