package com.mitchell.estimate.resource.entity.totals;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.entity.adjustment.TotalAdjustmentInfoType;


/**
 * <p>Java class for TotalsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalType" type="{http://www.cieca.com/BMS}TotalTypeEnum"/>
 *         &lt;element name="TotalSubType" type="{http://www.cieca.com/BMS}TotalSubTypeEnum" minOccurs="0"/>
 *         &lt;element name="TotalTypeDesc" type="{http://www.cieca.com/BMS}TotalTypeDescType"/>
 *         &lt;element name="NonTaxableHours" type="{http://www.cieca.com/BMS}TotalHoursType" minOccurs="0"/>
 *         &lt;element name="TaxableHours" type="{http://www.cieca.com/BMS}TotalHoursType" minOccurs="0"/>
 *         &lt;element name="TotalHours" type="{http://www.cieca.com/BMS}TotalHoursType" minOccurs="0"/>
 *         &lt;element name="TotalTaxInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxType" type="{http://www.cieca.com/BMS}TaxTypeEnum"/>
 *                   &lt;element name="TierNum" type="{http://www.cieca.com/BMS}TierNumType"/>
 *                   &lt;element name="TaxAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *                   &lt;element name="SurchargeAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="TaxBaseAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalAdjustmentInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeEnum"/>
 *                   &lt;element name="NonTaxAdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="TaxAdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="TotalAdjustmentAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NonTaxableAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TaxableAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TaxTotalAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="OtherChargesNonTaxableAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="OtherChargesTaxableAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalsInfoType", propOrder = {
    "totalType",
    "totalSubType",
    "totalTypeDesc",
    "nonTaxableHours",
    "taxableHours",
    "totalHours",
    "totalTaxInfo",
    "totalAdjustmentInfo",
    "nonTaxableAmt",
    "taxableAmt",
    "taxTotalAmt",
    "otherChargesNonTaxableAmt",
    "otherChargesTaxableAmt",
    "totalAmt"
})
public class TotalsInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "TotalType", required = true)
    protected String totalType;
    @XmlElement(name = "TotalSubType")
    protected TotalSubTypeEnum totalSubType;
    @XmlElement(name = "TotalTypeDesc", required = true)
    protected String totalTypeDesc;
    @XmlElement(name = "NonTaxableHours")
    protected BigDecimal nonTaxableHours;
    @XmlElement(name = "TaxableHours")
    protected BigDecimal taxableHours;
    @XmlElement(name = "TotalHours")
    protected BigDecimal totalHours;
    @XmlElement(name = "TotalTaxInfo")
    protected List<TotalTaxInfoType> totalTaxInfo;
    @XmlElement(name = "TotalAdjustmentInfo")
    protected List<TotalAdjustmentInfoType> totalAdjustmentInfo;
    @XmlElement(name = "NonTaxableAmt")
    protected BigDecimal nonTaxableAmt;
    @XmlElement(name = "TaxableAmt")
    protected BigDecimal taxableAmt;
    @XmlElement(name = "TaxTotalAmt")
    protected BigDecimal taxTotalAmt;
    @XmlElement(name = "OtherChargesNonTaxableAmt")
    protected BigDecimal otherChargesNonTaxableAmt;
    @XmlElement(name = "OtherChargesTaxableAmt")
    protected BigDecimal otherChargesTaxableAmt;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;

    /**
     * Gets the value of the totalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalType() {
        return totalType;
    }

    /**
     * Sets the value of the totalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalType(String value) {
        this.totalType = value;
    }

    /**
     * Gets the value of the totalSubType property.
     * 
     * @return
     *     possible object is
     *     {@link TotalSubTypeEnum }
     *     
     */
    public TotalSubTypeEnum getTotalSubType() {
        return totalSubType;
    }

    /**
     * Sets the value of the totalSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalSubTypeEnum }
     *     
     */
    public void setTotalSubType(TotalSubTypeEnum value) {
        this.totalSubType = value;
    }

    /**
     * Gets the value of the totalTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTypeDesc() {
        return totalTypeDesc;
    }

    /**
     * Sets the value of the totalTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTypeDesc(String value) {
        this.totalTypeDesc = value;
    }

    /**
     * Gets the value of the nonTaxableHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonTaxableHours() {
        return nonTaxableHours;
    }

    /**
     * Sets the value of the nonTaxableHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonTaxableHours(BigDecimal value) {
        this.nonTaxableHours = value;
    }

    /**
     * Gets the value of the taxableHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableHours() {
        return taxableHours;
    }

    /**
     * Sets the value of the taxableHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableHours(BigDecimal value) {
        this.taxableHours = value;
    }

    /**
     * Gets the value of the totalHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalHours() {
        return totalHours;
    }

    /**
     * Sets the value of the totalHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalHours(BigDecimal value) {
        this.totalHours = value;
    }

    /**
     * Gets the value of the totalTaxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalTaxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalTaxInfoType }
     * 
     * 
     */
    public List<TotalTaxInfoType> getTotalTaxInfo() {
        if (totalTaxInfo == null) {
            totalTaxInfo = new ArrayList<TotalTaxInfoType>();
        }
        return this.totalTaxInfo;
    }

    /**
     * Gets the value of the totalAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalsInfoType.TotalAdjustmentInfo }
     * 
     * 
     */
    public List<TotalAdjustmentInfoType> getTotalAdjustmentInfo() {
        if (totalAdjustmentInfo == null) {
            totalAdjustmentInfo = new ArrayList<TotalAdjustmentInfoType>();
        }
        return this.totalAdjustmentInfo;
    }

    /**
     * Gets the value of the nonTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonTaxableAmt() {
        return nonTaxableAmt;
    }

    /**
     * Sets the value of the nonTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonTaxableAmt(BigDecimal value) {
        this.nonTaxableAmt = value;
    }

    /**
     * Gets the value of the taxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxableAmt() {
        return taxableAmt;
    }

    /**
     * Sets the value of the taxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxableAmt(BigDecimal value) {
        this.taxableAmt = value;
    }

    /**
     * Gets the value of the taxTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxTotalAmt() {
        return taxTotalAmt;
    }

    /**
     * Sets the value of the taxTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxTotalAmt(BigDecimal value) {
        this.taxTotalAmt = value;
    }

    /**
     * Gets the value of the otherChargesNonTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherChargesNonTaxableAmt() {
        return otherChargesNonTaxableAmt;
    }

    /**
     * Sets the value of the otherChargesNonTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherChargesNonTaxableAmt(BigDecimal value) {
        this.otherChargesNonTaxableAmt = value;
    }

    /**
     * Gets the value of the otherChargesTaxableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherChargesTaxableAmt() {
        return otherChargesTaxableAmt;
    }

    /**
     * Sets the value of the otherChargesTaxableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherChargesTaxableAmt(BigDecimal value) {
        this.otherChargesTaxableAmt = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

}
