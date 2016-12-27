package com.cieca.estimate.resource.entity.damage;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.adjustment.AdjustmentTypeEnum;

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
 *         &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeEnum" minOccurs="0"/>
 *         &lt;element name="AdjustmentPct" type="{http://www.cieca.com/BMS}PctType" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adjustmentType",
    "adjustmentPct",
    "adjustmentAmt",
    "taxableInd"
})
public class LineAdjustmentType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "AdjustmentType")
    protected AdjustmentTypeEnum adjustmentType;
    @XmlElement(name = "AdjustmentPct")
    protected BigDecimal adjustmentPct;
    @XmlElement(name = "AdjustmentAmt")
    protected BigDecimal adjustmentAmt;
    @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;

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
     * Gets the value of the adjustmentPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentPct() {
        return adjustmentPct;
    }

    /**
     * Sets the value of the adjustmentPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentPct(BigDecimal value) {
        this.adjustmentPct = value;
    }

    /**
     * Gets the value of the adjustmentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Sets the value of the adjustmentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmt(BigDecimal value) {
        this.adjustmentAmt = value;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

}
