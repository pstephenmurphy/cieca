package com.mitchell.estimate.resource.entity.adjustment;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeEnum"/>
 *         &lt;element name="NonTaxAdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TaxAdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TotalAdjustmentAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalAdjustmentInfoType", propOrder = {
    "adjustmentType",
    "nonTaxAdjustmentAmt",
    "taxAdjustmentAmt",
    "totalAdjustmentAmt"
})
public class TotalAdjustmentInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "AdjustmentType", required = true)
    protected AdjustmentTypeEnum adjustmentType;
    @XmlElement(name = "NonTaxAdjustmentAmt")
    protected BigDecimal nonTaxAdjustmentAmt;
    @XmlElement(name = "TaxAdjustmentAmt")
    protected BigDecimal taxAdjustmentAmt;
    @XmlElement(name = "TotalAdjustmentAmt", required = true)
    protected BigDecimal totalAdjustmentAmt;

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentTypeEnum }
     *     
     */
    public AdjustmentTypeEnum getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentTypeEnum }
     *     
     */
    public void setAdjustmentType(AdjustmentTypeEnum value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the nonTaxAdjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonTaxAdjustmentAmt() {
        return nonTaxAdjustmentAmt;
    }

    /**
     * Sets the value of the nonTaxAdjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonTaxAdjustmentAmt(BigDecimal value) {
        this.nonTaxAdjustmentAmt = value;
    }

    /**
     * Gets the value of the taxAdjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAdjustmentAmt() {
        return taxAdjustmentAmt;
    }

    /**
     * Sets the value of the taxAdjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAdjustmentAmt(BigDecimal value) {
        this.taxAdjustmentAmt = value;
    }

    /**
     * Gets the value of the totalAdjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAdjustmentAmt() {
        return totalAdjustmentAmt;
    }

    /**
     * Sets the value of the totalAdjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAdjustmentAmt(BigDecimal value) {
        this.totalAdjustmentAmt = value;
    }

}
