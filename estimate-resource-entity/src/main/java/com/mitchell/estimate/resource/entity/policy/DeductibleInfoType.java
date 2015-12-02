package com.mitchell.estimate.resource.entity.policy;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeductibleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeductibleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeductibleStatus" type="{http://www.cieca.com/BMS}DeductibleStatusEnum"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="DeductibleAmt" type="{http://www.cieca.com/BMS}MitchellDeductibleAmtType"/>
 *           &lt;element name="DeductibleBasedOnPercentageMethodType">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="DeductiblePercentageOfRepairs" type="{http://www.cieca.com/BMS}DeductiblePercentageOfRepairsType"/>
 *                     &lt;element name="DeductibleMaxAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="DeductiblePreviouslyPaidAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeductibleInfoType", propOrder = {
    "deductibleStatus",
    "deductibleAmt",
    "deductibleBasedOnPercentageMethod",
    "deductiblePreviouslyPaidAmt"
})
public class DeductibleInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "DeductibleStatus", required = true)
    protected DeductibleStatusEnum deductibleStatus;
    
    @XmlElement(name = "DeductibleAmt")
    protected BigDecimal deductibleAmt;
    
    @XmlElement(name = "DeductibleBasedOnPercentageMethodType")
    protected DeductibleBasedOnPercentageMethodType deductibleBasedOnPercentageMethod;
    
    @XmlElement(name = "DeductiblePreviouslyPaidAmt")
    protected BigDecimal deductiblePreviouslyPaidAmt;

    /**
     * Gets the value of the deductibleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleStatusEnum }
     *     
     */
    public DeductibleStatusEnum getDeductibleStatus() {
        return deductibleStatus;
    }

    /**
     * Sets the value of the deductibleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleStatusEnum }
     *     
     */
    public void setDeductibleStatus(DeductibleStatusEnum value) {
        this.deductibleStatus = value;
    }

    /**
     * Gets the value of the deductibleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductibleAmt() {
        return deductibleAmt;
    }

    /**
     * Sets the value of the deductibleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductibleAmt(BigDecimal value) {
        this.deductibleAmt = value;
    }

    /**
     * Gets the value of the deductibleBasedOnPercentageMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleInfoType.DeductibleBasedOnPercentageMethodType }
     *     
     */
    public DeductibleBasedOnPercentageMethodType getDeductibleBasedOnPercentageMethod() {
        return deductibleBasedOnPercentageMethod;
    }

    /**
     * Sets the value of the deductibleBasedOnPercentageMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleInfoType.DeductibleBasedOnPercentageMethodType }
     *     
     */
    public void setDeductibleBasedOnPercentageMethod(DeductibleBasedOnPercentageMethodType value) {
        this.deductibleBasedOnPercentageMethod = value;
    }

    /**
     * Gets the value of the deductiblePreviouslyPaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductiblePreviouslyPaidAmt() {
        return deductiblePreviouslyPaidAmt;
    }

    /**
     * Sets the value of the deductiblePreviouslyPaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductiblePreviouslyPaidAmt(BigDecimal value) {
        this.deductiblePreviouslyPaidAmt = value;
    }

}
