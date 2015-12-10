package com.mitchell.estimate.resource.entity.rate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.entity.adjustment.AdjustmentInfoType;
import com.mitchell.estimate.resource.entity.rate.material.MaterialCalcSettingsType;
import com.mitchell.estimate.resource.entity.rate.tax.RateTierInfoType;
import com.mitchell.estimate.resource.entity.rate.tax.TaxInfoType;

/**
 * <p>Java class for RateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateType" type="{http://www.cieca.com/BMS}RateTypeClosedEnumType"/>
 *         &lt;element name="RateDesc" type="{http://www.cieca.com/BMS}Char_50" minOccurs="0"/>
 *         &lt;element name="RateTierInfo" type="{http://www.cieca.com/BMS}TierInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.cieca.com/BMS}Decimal_Range_0-100.00" minOccurs="0"/>
 *         &lt;element name="AdjustmentInfo" type="{http://www.cieca.com/BMS}AdjustmentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxInfo" type="{http://www.cieca.com/BMS}TaxInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialCalcSettings" type="{http://www.cieca.com/BMS}MaterialCalcSettingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInfoType", propOrder = {
    "rateType",
    "rateDesc",
    "rateTierInfo",
    "taxableInd",
    "taxRate",
    "adjustmentInfo",
    "taxInfo",
    "materialCalcSettings"
})
@XmlRootElement(name = "RateInfoType")
public class RateInfoType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    
    @XmlElement(name = "RateType", required = true)
    protected RateTypeEnum rateType;
    
    @XmlElement(name = "RateDesc")
    protected String rateDesc;
    
    @XmlElement(name = "RateTierInfo")
    protected List<RateTierInfoType> rateTierInfo;
    
   @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;
   
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    
    @XmlElement(name = "AdjustmentInfo")
    protected List<AdjustmentInfoType> adjustmentInfo;
    
    @XmlElement(name = "TaxInfo")
    protected List<TaxInfoType> taxInfo;
    
    @XmlElement(name = "MaterialCalcSettings")
    protected MaterialCalcSettingsType materialCalcSettings;

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public RateTypeEnum getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(RateTypeEnum value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the rateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDesc() {
        return rateDesc;
    }

    /**
     * Sets the value of the rateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDesc(String value) {
        this.rateDesc = value;
    }

    /**
     * Gets the value of the rateTierInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateTierInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateTierInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTierInfoType }
     * 
     * 
     */
    public List<RateTierInfoType> getRateTierInfo() {
        if (rateTierInfo == null) {
            rateTierInfo = new ArrayList<RateTierInfoType>();
        }
        return this.rateTierInfo;
    }

    /**
     * Gets the value of the taxableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
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

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the adjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustmentInfoType }
     * 
     * 
     */
    public List<AdjustmentInfoType> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<AdjustmentInfoType>();
        }
        return this.adjustmentInfo;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInfoType }
     * 
     * 
     */
    public List<TaxInfoType> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TaxInfoType>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the materialCalcSettings property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialCalcSettingsType }
     *     
     */
    public MaterialCalcSettingsType getMaterialCalcSettings() {
        return materialCalcSettings;
    }

    /**
     * Sets the value of the materialCalcSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialCalcSettingsType }
     *     
     */
    public void setMaterialCalcSettings(MaterialCalcSettingsType value) {
        this.materialCalcSettings = value;
    }

}
