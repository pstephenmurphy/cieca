package com.mitchell.estimate.resource.entity.party;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SalvageCancellationReasonCode and SalvageCancellationReasonMemo aggregates appeared in this type before BMS 2.6.0. These two aggregrates were marked for deletion as of BMS 2.5.0. The reference BMS Section for this common type is 3.1.13
 * 
 * <p>Java class for CancellationPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="CancellationReasonCode" type="{http://www.cieca.com/BMS}CancellationReasonEnum" minOccurs="0"/>
 *         &lt;element name="CancellationReasonMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationPartyType", propOrder = {
    "party",
    "cancellationReasonCode",
    "cancellationReasonMemo"
})
public class CancellationPartyType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "CancellationReasonCode")
    protected CancellationReasonEnum cancellationReasonCode;
    @XmlElement(name = "CancellationReasonMemo")
    protected String cancellationReasonMemo;

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
     * Gets the value of the cancellationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReasonEnum }
     *     
     */
    public CancellationReasonEnum getCancellationReasonCode() {
        return cancellationReasonCode;
    }

    /**
     * Sets the value of the cancellationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReasonEnum }
     *     
     */
    public void setCancellationReasonCode(CancellationReasonEnum value) {
        this.cancellationReasonCode = value;
    }

    /**
     * Gets the value of the cancellationReasonMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReasonMemo() {
        return cancellationReasonMemo;
    }

    /**
     * Sets the value of the cancellationReasonMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReasonMemo(String value) {
        this.cancellationReasonMemo = value;
    }

}
