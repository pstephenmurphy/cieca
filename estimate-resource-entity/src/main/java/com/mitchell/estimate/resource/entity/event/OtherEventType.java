package com.mitchell.estimate.resource.entity.event;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.mitchell.estimate.resource.entity.party.PartyType;


/**
 * <p>Java class for OtherEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherEventType" type="{http://www.cieca.com/BMS}OtherEventTypeType"/>
 *         &lt;element name="OtherEventDateTime" type="{http://www.cieca.com/BMS}DateTime"/>
 *         &lt;element name="OtherEventMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="OtherEventContact" type="{http://www.cieca.com/BMS}PartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherEventType", propOrder = {
    "otherEventType",
    "otherEventDateTime",
    "otherEventMemo",
    "otherEventContact"
})
public class OtherEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "OtherEventType", required = true)
    protected String otherEventType;
    @XmlElement(name = "OtherEventDateTime", required = true)
    protected XMLGregorianCalendar otherEventDateTime;
    @XmlElement(name = "OtherEventMemo")
    protected String otherEventMemo;
    @XmlElement(name = "OtherEventContact")
    protected PartyType otherEventContact;

    /**
     * Gets the value of the otherEventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEventType() {
        return otherEventType;
    }

    /**
     * Sets the value of the otherEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEventType(String value) {
        this.otherEventType = value;
    }

    /**
     * Gets the value of the otherEventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOtherEventDateTime() {
        return otherEventDateTime;
    }

    /**
     * Sets the value of the otherEventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOtherEventDateTime(XMLGregorianCalendar value) {
        this.otherEventDateTime = value;
    }

    /**
     * Gets the value of the otherEventMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEventMemo() {
        return otherEventMemo;
    }

    /**
     * Sets the value of the otherEventMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEventMemo(String value) {
        this.otherEventMemo = value;
    }

    /**
     * Gets the value of the otherEventContact property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOtherEventContact() {
        return otherEventContact;
    }

    /**
     * Sets the value of the otherEventContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOtherEventContact(PartyType value) {
        this.otherEventContact = value;
    }

}
