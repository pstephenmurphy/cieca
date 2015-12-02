package com.mitchell.estimate.resource.entity.admin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.entity.party.PartyType;


/**
 * <p>Java class for RenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="DeliveryPhoneNum" type="{http://www.cieca.com/BMS}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="RenterTypeCode" type="{http://www.cieca.com/BMS}RenterTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenterType", propOrder = {
    "party",
    "deliveryPhoneNum",
    "renterTypeCode"
})
public class RenterType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "DeliveryPhoneNum")
    protected String deliveryPhoneNum;
    @XmlElement(name = "RenterTypeCode")
    protected RenterTypeEnum renterTypeCode;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the deliveryPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPhoneNum() {
        return deliveryPhoneNum;
    }

    /**
     * Sets the value of the deliveryPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPhoneNum(String value) {
        this.deliveryPhoneNum = value;
    }

    /**
     * Gets the value of the renterTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RenterTypeEnum }
     *     
     */
    public RenterTypeEnum getRenterTypeCode() {
        return renterTypeCode;
    }

    /**
     * Sets the value of the renterTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenterTypeEnum }
     *     
     */
    public void setRenterTypeCode(RenterTypeEnum value) {
        this.renterTypeCode = value;
    }

}
