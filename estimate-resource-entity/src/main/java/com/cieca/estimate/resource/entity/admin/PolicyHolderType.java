package com.cieca.estimate.resource.entity.admin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.party.PartyType;


/**
 * <p>Java class for PolicyHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="PolicyNum" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *         &lt;element name="OwnerInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyHolderType", propOrder = {
    "party",
    "policyNum",
    "ownerInd"
})
public class PolicyHolderType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "PolicyNum")
    protected String policyNum;
    @XmlElement(name = "OwnerInd")
    protected Boolean ownerInd;

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
     * Gets the value of the ownerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerInd() {
        return ownerInd;
    }

    /**
     * Sets the value of the ownerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerInd(Boolean value) {
        this.ownerInd = value;
    }

}
