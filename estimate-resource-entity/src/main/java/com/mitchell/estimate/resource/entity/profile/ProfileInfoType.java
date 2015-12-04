package com.mitchell.estimate.resource.entity.profile;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.entity.parts.AlternatePartInfoType;
import com.mitchell.estimate.resource.entity.parts.PartCertificationType;
import com.mitchell.estimate.resource.entity.rate.RateInfoType;
import com.mitchell.estimate.resource.entity.rate.tax.CanadianTaxType;
import com.mitchell.estimate.resource.entity.rate.tax.TaxExemptInfoType;


/**
 * <p>Java class for ProfileInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileName" type="{http://www.cieca.com/BMS}ProfileNameType" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://www.cieca.com/BMS}RateInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="AlternatePartInfoType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeEnum"/>
 *                   &lt;element name="SearchCode" type="{http://www.cieca.com/BMS}SearchCodeEnum" minOccurs="0"/>
 *                   &lt;element name="DisclosureStateProvince" type="{http://www.cieca.com/BMS}StateProvinceEnum" minOccurs="0"/>
 *                   &lt;element name="BeginSearchPostalCode" type="{http://www.cieca.com/BMS}PostalCodeType" minOccurs="0"/>
 *                   &lt;element name="EndSearchPostalCode" type="{http://www.cieca.com/BMS}PostalCodeType" minOccurs="0"/>
 *                   &lt;element name="SupplierLimit" type="{http://www.cieca.com/BMS}Integer" minOccurs="0"/>
 *                   &lt;element name="MatrixName" type="{http://www.cieca.com/BMS}MatrixNameType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PartCertification" type="{http://www.cieca.com/BMS}PartCertificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CostPlusBasisInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="DrillTimeInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="EdgingTimeInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="UndersideTimeInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="VIRCompletedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="BettermentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="PreTaxDiscountRate" type="{http://www.cieca.com/BMS}TaxRateType" minOccurs="0"/>
 *         &lt;element name="PreTaxDiscountHistory" type="{http://www.cieca.com/BMS}AdjustmentHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxExemptInfoType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxType" type="{http://www.cieca.com/BMS}TaxTypeEnum"/>
 *                   &lt;element name="TaxExemptInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CanadianTax" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="GoodsServicesTaxRate" type="{http://www.cieca.com/BMS}TaxRateType"/>
 *                     &lt;element name="HarmonizedTaxRate" type="{http://www.cieca.com/BMS}TaxRateType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileInfoType", propOrder = {
    "profileName",
    "rateInfo",
    "alternatePartInfo",
    "partCertification",
    "costPlusBasisInd",
    "drillTimeInd",
    "edgingTimeInd",
    "undersideTimeInd",
    "virCompletedInd",
    "bettermentInd",
    "preTaxDiscountRate",
    "taxExemptInfo",
    "canadianTax"
})
public class ProfileInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "ProfileName")
    protected String profileName;
    
    @XmlElement(name = "RateInfo", required = true)
    protected List<RateInfoType> rateInfo;
    
    @XmlElement(name = "AlternatePartInfoType")
    protected List<AlternatePartInfoType> alternatePartInfo;
    
    @XmlElement(name = "PartCertification")
    protected List<PartCertificationType> partCertification;
    
    @XmlElement(name = "CostPlusBasisInd")
    protected Boolean costPlusBasisInd;
    
    @XmlElement(name = "DrillTimeInd")
    protected Boolean drillTimeInd;
    
    @XmlElement(name = "EdgingTimeInd")
    protected Boolean edgingTimeInd;
    
    @XmlElement(name = "UndersideTimeInd")
    protected Boolean undersideTimeInd;
    
    @XmlElement(name = "VIRCompletedInd")
    protected Boolean virCompletedInd;
    
    @XmlElement(name = "BettermentInd")
    protected Boolean bettermentInd;
    
    @XmlElement(name = "PreTaxDiscountRate")
    protected BigDecimal preTaxDiscountRate;
    
    @XmlElement(name = "TaxExemptInfoType")
    protected List<TaxExemptInfoType> taxExemptInfo;
    
    @XmlElement(name = "CanadianTax")
    protected CanadianTaxType canadianTax;

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateInfoType }
     * 
     * 
     */
    public List<RateInfoType> getRateInfo() {
        if (rateInfo == null) {
            rateInfo = new ArrayList<RateInfoType>();
        }
        return this.rateInfo;
    }

    /**
     * Gets the value of the alternatePartInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternatePartInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternatePartInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileInfoType.AlternatePartInfoType }
     * 
     * 
     */
    public List<AlternatePartInfoType> getAlternatePartInfo() {
        if (alternatePartInfo == null) {
            alternatePartInfo = new ArrayList<AlternatePartInfoType>();
        }
        return this.alternatePartInfo;
    }

    /**
     * Gets the value of the partCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartCertificationType }
     * 
     * 
     */
    public List<PartCertificationType> getPartCertification() {
        if (partCertification == null) {
            partCertification = new ArrayList<PartCertificationType>();
        }
        return this.partCertification;
    }

    /**
     * Gets the value of the costPlusBasisInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCostPlusBasisInd() {
        return costPlusBasisInd;
    }

    /**
     * Sets the value of the costPlusBasisInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostPlusBasisInd(Boolean value) {
        this.costPlusBasisInd = value;
    }

    /**
     * Gets the value of the drillTimeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDrillTimeInd() {
        return drillTimeInd;
    }

    /**
     * Sets the value of the drillTimeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrillTimeInd(Boolean value) {
        this.drillTimeInd = value;
    }

    /**
     * Gets the value of the edgingTimeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEdgingTimeInd() {
        return edgingTimeInd;
    }

    /**
     * Sets the value of the edgingTimeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEdgingTimeInd(Boolean value) {
        this.edgingTimeInd = value;
    }

    /**
     * Gets the value of the undersideTimeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUndersideTimeInd() {
        return undersideTimeInd;
    }

    /**
     * Sets the value of the undersideTimeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndersideTimeInd(Boolean value) {
        this.undersideTimeInd = value;
    }

    /**
     * Gets the value of the virCompletedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVIRCompletedInd() {
        return virCompletedInd;
    }

    /**
     * Sets the value of the virCompletedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIRCompletedInd(Boolean value) {
        this.virCompletedInd = value;
    }

    /**
     * Gets the value of the bettermentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBettermentInd() {
        return bettermentInd;
    }

    /**
     * Sets the value of the bettermentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBettermentInd(Boolean value) {
        this.bettermentInd = value;
    }

    /**
     * Gets the value of the preTaxDiscountRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxDiscountRate() {
        return preTaxDiscountRate;
    }

    /**
     * Sets the value of the preTaxDiscountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxDiscountRate(BigDecimal value) {
        this.preTaxDiscountRate = value;
    }

    /**
     * Gets the value of the taxExemptInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileInfoType.TaxExemptInfoType }
     * 
     * 
     */
    public List<TaxExemptInfoType> getTaxExemptInfo() {
        if (taxExemptInfo == null) {
            taxExemptInfo = new ArrayList<TaxExemptInfoType>();
        }
        return this.taxExemptInfo;
    }

    /**
     * Gets the value of the canadianTax property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileInfoType.CanadianTax }
     *     
     */
    public CanadianTaxType getCanadianTax() {
        return canadianTax;
    }

    /**
     * Sets the value of the canadianTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileInfoType.CanadianTax }
     *     
     */
    public void setCanadianTax(CanadianTaxType value) {
        this.canadianTax = value;
    }
}
