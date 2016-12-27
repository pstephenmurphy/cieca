package com.cieca.estimate.resource.entity.admin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.party.PartyType;


/**
 * <p>Java class for ProcessDelayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessDelayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="EstimatedNumDaysForDelay" type="{http://www.cieca.com/BMS}EstimatedNumDaysForDelayType" minOccurs="0"/>
 *         &lt;element name="ProcessDelayReasonCode" type="{http://www.cieca.com/BMS}ProcessDelayReasonEnum" minOccurs="0"/>
 *         &lt;element name="ProcessDelayMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessDelayType", propOrder = {
    "party",
    "estimatedNumDaysForDelay",
    "processDelayReasonCode",
    "processDelayMemo"
})
public class ProcessDelayType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "EstimatedNumDaysForDelay")
    protected Integer estimatedNumDaysForDelay;
    @XmlElement(name = "ProcessDelayReasonCode")
    protected ProcessDelayReasonEnum processDelayReasonCode;
    @XmlElement(name = "ProcessDelayMemo")
    protected String processDelayMemo;

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
     * Gets the value of the estimatedNumDaysForDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedNumDaysForDelay() {
        return estimatedNumDaysForDelay;
    }

    /**
     * Sets the value of the estimatedNumDaysForDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedNumDaysForDelay(Integer value) {
        this.estimatedNumDaysForDelay = value;
    }

    /**
     * Gets the value of the processDelayReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessDelayReasonEnum }
     *     
     */
    public ProcessDelayReasonEnum getProcessDelayReasonCode() {
        return processDelayReasonCode;
    }

    /**
     * Sets the value of the processDelayReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessDelayReasonEnum }
     *     
     */
    public void setProcessDelayReasonCode(ProcessDelayReasonEnum value) {
        this.processDelayReasonCode = value;
    }

    /**
     * Gets the value of the processDelayMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDelayMemo() {
        return processDelayMemo;
    }

    /**
     * Sets the value of the processDelayMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDelayMemo(String value) {
        this.processDelayMemo = value;
    }

}
