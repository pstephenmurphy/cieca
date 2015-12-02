package com.mitchell.estimate.resource.entity.policy;

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
 *         &lt;element name="DeductiblePercentageOfRepairs" type="{http://www.cieca.com/BMS}DeductiblePercentageOfRepairsType"/>
 *         &lt;element name="DeductibleMaxAmt" type="{http://www.cieca.com/BMS}Currency"/>
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
    "deductiblePercentageOfRepairs",
    "deductibleMaxAmt"
})
public class DeductibleBasedOnPercentageMethodType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "DeductiblePercentageOfRepairs", required = true)
    protected BigDecimal deductiblePercentageOfRepairs;
    
    @XmlElement(name = "DeductibleMaxAmt", required = true)
    protected BigDecimal deductibleMaxAmt;

    /**
     * Gets the value of the deductiblePercentageOfRepairs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductiblePercentageOfRepairs() {
        return deductiblePercentageOfRepairs;
    }

    /**
     * Sets the value of the deductiblePercentageOfRepairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductiblePercentageOfRepairs(BigDecimal value) {
        this.deductiblePercentageOfRepairs = value;
    }

    /**
     * Gets the value of the deductibleMaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductibleMaxAmt() {
        return deductibleMaxAmt;
    }

    /**
     * Sets the value of the deductibleMaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductibleMaxAmt(BigDecimal value) {
        this.deductibleMaxAmt = value;
    }

}

