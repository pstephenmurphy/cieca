package com.mitchell.estimate.resource.dto.totals;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.dto.rate.tax.TaxTypeEnum;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxType" type="{http://www.cieca.com/BMS}TaxTypeEnum"/>
 *         &lt;element name="TierNum" type="{http://www.cieca.com/BMS}TierNumType"/>
 *         &lt;element name="TaxAmt" type="{http://www.cieca.com/BMS}Currency"/>
 *         &lt;element name="SurchargeAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalTaxInfoType", propOrder = { "taxType", "tierNum", "taxAmt", "surchargeAmt", "taxBaseAmt" })
public class TotalTaxInfoType implements Serializable {

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "TaxType", required = true)
    protected TaxTypeEnum taxType;
    @XmlElement(name = "TierNum")
    protected int tierNum;
    @XmlElement(name = "TaxAmt", required = true)
    protected BigDecimal taxAmt;
    @XmlElement(name = "SurchargeAmt")
    protected BigDecimal surchargeAmt;
    @XmlElement(name = "TaxBaseAmt")
    protected BigDecimal taxBaseAmt;

    /**
     * Gets the value of the taxType property.
     * 
     * @return possible object is {@link TaxTypeEnum }
     * 
     */
    public TaxTypeEnum getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value allowed object is {@link TaxTypeEnum }
     * 
     */
    public void setTaxType(TaxTypeEnum value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the tierNum property.
     * 
     */
    public int getTierNum() {
        return tierNum;
    }

    /**
     * Sets the value of the tierNum property.
     * 
     */
    public void setTierNum(int value) {
        this.tierNum = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setTaxAmt(BigDecimal value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the surchargeAmt property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getSurchargeAmt() {
        return surchargeAmt;
    }

    /**
     * Sets the value of the surchargeAmt property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setSurchargeAmt(BigDecimal value) {
        this.surchargeAmt = value;
    }

    /**
     * Gets the value of the taxBaseAmt property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTaxBaseAmt() {
        return taxBaseAmt;
    }

    /**
     * Sets the value of the taxBaseAmt property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setTaxBaseAmt(BigDecimal value) {
        this.taxBaseAmt = value;
    }

}
