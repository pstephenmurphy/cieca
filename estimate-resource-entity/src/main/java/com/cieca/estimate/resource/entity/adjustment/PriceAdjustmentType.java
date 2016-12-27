package com.cieca.estimate.resource.entity.adjustment;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeEnum"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="AdjustmentPct" type="{http://www.cieca.com/BMS}PctType"/>
 *             &lt;element name="AdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="AdjustmentAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAdjustmentType", propOrder = {
    "adjustmentType",
    "adjustmentPct",
    "adjustmentAmt"
})
public class PriceAdjustmentType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "AdjustmentType", required = true)
    protected AdjustmentTypeEnum adjustmentType;

    @XmlElement(name = "AdjustmentPct")
    protected BigDecimal adjustmentPct;
    
    @XmlElement(name = "AdjustmentAmt")
    protected BigDecimal adjustmentAmt;
    
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
     * Gets the adjustment pct.
     *
     * @return the adjustment pct
     */
    protected BigDecimal getAdjustmentPct() {
        return adjustmentPct;
    }

    /**
     * Sets the adjustment pct.
     *
     * @param adjustmentPct the new adjustment pct
     */
    protected void setAdjustmentPct(BigDecimal adjustmentPct) {
        this.adjustmentPct = adjustmentPct;
    }

    /**
     * Gets the adjustment amt.
     *
     * @return the adjustment amt
     */
    protected BigDecimal getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Sets the adjustment amt.
     *
     * @param adjustmentAmt the new adjustment amt
     */
    protected void setAdjustmentAmt(BigDecimal adjustmentAmt) {
        this.adjustmentAmt = adjustmentAmt;
    }

}

