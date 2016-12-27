package com.cieca.estimate.resource.entity.communication;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.address.AddressType;


/**
 * <p>Java class for CommunicationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommQualifier" type="{http://www.cieca.com/BMS}CommunicationsQualifierEnum"/>
 *         &lt;choice>
 *           &lt;element name="CommPhone" type="{http://www.cieca.com/BMS}PhoneNumber"/>
 *           &lt;element name="CommEmail" type="{http://www.cieca.com/BMS}URI"/>
 *           &lt;element name="Address" type="{http://www.cieca.com/BMS}AddressType"/>
 *           &lt;element name="CommInstantMessaging" type="{http://www.cieca.com/BMS}CommInstantMessagingType"/>
 *         &lt;/choice>
 *         &lt;element name="PreferredInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationsType", propOrder = {
    "commQualifier",
    "commPhone",
    "commEmail",
    "address",
    "commInstantMessaging",
    "preferredInd"
})
public class CommunicationsType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "CommQualifier", required = true)
    protected CommunicationsQualifierEnum commQualifier;
    @XmlElement(name = "CommPhone")
    protected String commPhone;
    @XmlElement(name = "CommEmail")
    protected String commEmail;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "CommInstantMessaging")
    protected CommInstantMessagingType commInstantMessaging;
    @XmlElement(name = "PreferredInd")
    protected Boolean preferredInd;

    /**
     * Gets the value of the commQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsQualifierEnum }
     *     
     */
    public CommunicationsQualifierEnum getCommQualifier() {
        return commQualifier;
    }

    /**
     * Sets the value of the commQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsQualifierEnum }
     *     
     */
    public void setCommQualifier(CommunicationsQualifierEnum value) {
        this.commQualifier = value;
    }

    /**
     * Gets the value of the commPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommPhone() {
        return commPhone;
    }

    /**
     * Sets the value of the commPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommPhone(String value) {
        this.commPhone = value;
    }

    /**
     * Gets the value of the commEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommEmail() {
        return commEmail;
    }

    /**
     * Sets the value of the commEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommEmail(String value) {
        this.commEmail = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the commInstantMessaging property.
     * 
     * @return
     *     possible object is
     *     {@link CommInstantMessagingType }
     *     
     */
    public CommInstantMessagingType getCommInstantMessaging() {
        return commInstantMessaging;
    }

    /**
     * Sets the value of the commInstantMessaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommInstantMessagingType }
     *     
     */
    public void setCommInstantMessaging(CommInstantMessagingType value) {
        this.commInstantMessaging = value;
    }

    /**
     * Gets the value of the preferredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPreferredInd() {
        return preferredInd;
    }

    /**
     * Sets the value of the preferredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferredInd(Boolean value) {
        this.preferredInd = value;
    }

}
