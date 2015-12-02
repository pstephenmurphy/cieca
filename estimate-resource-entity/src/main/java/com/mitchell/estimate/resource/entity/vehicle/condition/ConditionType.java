package com.mitchell.estimate.resource.entity.vehicle.condition;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionCode" type="{http://www.cieca.com/BMS}ConditionEnum" minOccurs="0"/>
 *         &lt;element name="DrivableInd" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="AlterationInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="PriorDamageInd" type="{http://www.cieca.com/BMS}Indicator" minOccurs="0"/>
 *         &lt;element name="PriorDamageAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PriorDamageMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="TowCondition" type="{http://www.cieca.com/BMS}TowConditionEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
    "conditionCode",
    "drivableInd",
    "alterationInd",
    "priorDamageInd",
    "priorDamageAmt",
    "priorDamageMemo",
    "towCondition"
})
public class ConditionType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "ConditionCode")
    protected ConditionEnum conditionCode;
    @XmlElement(name = "DrivableInd")
    protected String drivableInd;
    @XmlElement(name = "AlterationInd")
    protected Boolean alterationInd;
    @XmlElement(name = "PriorDamageInd")
    protected String priorDamageInd;
    @XmlElement(name = "PriorDamageAmt")
    protected BigDecimal priorDamageAmt;
    @XmlElement(name = "PriorDamageMemo")
    protected String priorDamageMemo;
    @XmlElement(name = "TowCondition")
    protected TowConditionEnum towCondition;

    /**
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnum }
     *     
     */
    public ConditionEnum getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnum }
     *     
     */
    public void setConditionCode(ConditionEnum value) {
        this.conditionCode = value;
    }

    /**
     * Gets the value of the drivableInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivableInd() {
        return drivableInd;
    }

    /**
     * Sets the value of the drivableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivableInd(String value) {
        this.drivableInd = value;
    }

    /**
     * Gets the value of the alterationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAlterationInd() {
        return alterationInd;
    }

    /**
     * Sets the value of the alterationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlterationInd(Boolean value) {
        this.alterationInd = value;
    }

    /**
     * Gets the value of the priorDamageInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorDamageInd() {
        return priorDamageInd;
    }

    /**
     * Sets the value of the priorDamageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorDamageInd(String value) {
        this.priorDamageInd = value;
    }

    /**
     * Gets the value of the priorDamageAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriorDamageAmt() {
        return priorDamageAmt;
    }

    /**
     * Sets the value of the priorDamageAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriorDamageAmt(BigDecimal value) {
        this.priorDamageAmt = value;
    }

    /**
     * Gets the value of the priorDamageMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorDamageMemo() {
        return priorDamageMemo;
    }

    /**
     * Sets the value of the priorDamageMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorDamageMemo(String value) {
        this.priorDamageMemo = value;
    }

    /**
     * Gets the value of the towCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TowConditionEnum }
     *     
     */
    public TowConditionEnum getTowCondition() {
        return towCondition;
    }

    /**
     * Sets the value of the towCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TowConditionEnum }
     *     
     */
    public void setTowCondition(TowConditionEnum value) {
        this.towCondition = value;
    }

}
