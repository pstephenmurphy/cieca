package com.mitchell.estimate.resource.entity.adjustment;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for AdjustmentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeClosedEnumType"/>
 *         &lt;element name="AdjustmentPct" type="{http://www.cieca.com/BMS}Decimal_Range_-100.00-100.00"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentInfoType", propOrder = {
    "adjustmentType",
    "adjustmentPct",
})
public class AdjustmentInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    
    @XmlElement(name = "AdjustmentType", required = true)
    protected AdjustmentTypeEnum adjustmentType;
    
    @XmlElement(name = "AdjustmentPct", required = true)
    protected BigDecimal adjustmentPct;

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

}
