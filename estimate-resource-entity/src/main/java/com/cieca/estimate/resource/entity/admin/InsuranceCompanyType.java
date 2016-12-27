package com.cieca.estimate.resource.entity.admin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.party.PartyType;


/**
 * <p>Java class for InsuranceCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceCompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Party" type="{http://www.cieca.com/BMS}PartyType"/>
 *         &lt;element name="ParentCompanyName" type="{http://www.cieca.com/BMS}Char_80" minOccurs="0"/>
 *         &lt;element name="SubsidiaryCompanyName" type="{http://www.cieca.com/BMS}Char_80" minOccurs="0"/>
 *         &lt;element name="RepairProgram" type="{http://www.cieca.com/BMS}Char_80" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceCompanyType", propOrder = {
    "party",
    "parentCompanyName",
    "subsidiaryCompanyName",
    "repairProgram"
})
public class InsuranceCompanyType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "ParentCompanyName")
    protected String parentCompanyName;
    @XmlElement(name = "SubsidiaryCompanyName")
    protected String subsidiaryCompanyName;
    @XmlElement(name = "RepairProgram")
    protected String repairProgram;

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
     * Gets the value of the parentCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCompanyName() {
        return parentCompanyName;
    }

    /**
     * Sets the value of the parentCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCompanyName(String value) {
        this.parentCompanyName = value;
    }

    /**
     * Gets the value of the subsidiaryCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidiaryCompanyName() {
        return subsidiaryCompanyName;
    }

    /**
     * Sets the value of the subsidiaryCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidiaryCompanyName(String value) {
        this.subsidiaryCompanyName = value;
    }

    /**
     * Gets the value of the repairProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepairProgram() {
        return repairProgram;
    }

    /**
     * Sets the value of the repairProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepairProgram(String value) {
        this.repairProgram = value;
    }

}
