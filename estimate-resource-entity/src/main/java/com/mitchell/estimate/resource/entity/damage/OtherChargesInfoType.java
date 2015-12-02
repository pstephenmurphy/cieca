package com.mitchell.estimate.resource.entity.damage;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.entity.adjustment.PriceAdjustmentType;
import com.mitchell.estimate.resource.entity.vehicle.UnitofMeasureOpenEnum;


/**
 * <p>Java class for OtherChargesInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherChargesInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherChargesType" type="{http://www.cieca.com/BMS}OtherChargesClosedEnumType"/>
 *         &lt;element name="Price" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="PriceJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="UnitOfMeasure" type="{http://www.cieca.com/BMS}UnitOfMeasureOpenEnumType"/>
 *           &lt;element name="Quantity" type="{http://www.cieca.com/BMS}Decimal_Range_0-9999999999.99"/>
 *         &lt;/sequence>
 *         &lt;element name="PriceAdjustment" type="{http://www.cieca.com/BMS}PriceAdjustmentType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *           &lt;element name="AppliedTaxes" type="{http://www.cieca.com/BMS}RateTypeClosedEnumType"/>
 *         &lt;/choice>
 *         &lt;element name="PriceInclInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherChargesInfoType", propOrder = {
    "otherChargesType",
    "price",
    "unitPrice",
    "totalPrice",
    "priceJudgmentInd",
    "unitOfMeasure",
    "quantity",
    "priceAdjustment",
    "taxableInd",
    "appliedTaxes",
    "priceInclInd",
    "cost"
})
public class OtherChargesInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "OtherChargesType", required = true)
    protected OtherChargesEnum otherChargesType;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;
    @XmlElement(name = "TotalPrice")
    protected BigDecimal totalPrice;
    @XmlElement(name = "PriceJudgmentInd")
    protected Boolean priceJudgmentInd;
    @XmlElement(name = "UnitOfMeasure")
    protected UnitofMeasureOpenEnum unitOfMeasure;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "PriceAdjustment")
    protected PriceAdjustmentType priceAdjustment;
    @XmlElement(name = "TaxableInd")
    protected Boolean taxableInd;
    @XmlElement(name = "AppliedTaxes")
    protected String appliedTaxes;
    @XmlElement(name = "PriceInclInd")
    protected Boolean priceInclInd;
    @XmlElement(name = "Cost")
    protected BigDecimal cost;

    /**
     * Gets the value of the otherChargesType property.
     * 
     * @return
     *     possible object is
     *     {@link OtherChargesEnum }
     *     
     */
    public OtherChargesEnum getOtherChargesType() {
        return otherChargesType;
    }

    /**
     * Sets the value of the otherChargesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherChargesEnum }
     *     
     */
    public void setOtherChargesType(OtherChargesEnum value) {
        this.otherChargesType = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the priceJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceJudgmentInd() {
        return priceJudgmentInd;
    }

    /**
     * Sets the value of the priceJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceJudgmentInd(Boolean value) {
        this.priceJudgmentInd = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitofMeasureOpenEnum }
     *     
     */
    public UnitofMeasureOpenEnum getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitofMeasureOpenEnum }
     *     
     */
    public void setUnitOfMeasure(UnitofMeasureOpenEnum value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the priceAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAdjustmentType }
     *     
     */
    public PriceAdjustmentType getPriceAdjustment() {
        return priceAdjustment;
    }

    /**
     * Sets the value of the priceAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAdjustmentType }
     *     
     */
    public void setPriceAdjustment(PriceAdjustmentType value) {
        this.priceAdjustment = value;
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
     * Gets the value of the appliedTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedTaxes() {
        return appliedTaxes;
    }

    /**
     * Sets the value of the appliedTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedTaxes(String value) {
        this.appliedTaxes = value;
    }

    /**
     * Gets the value of the priceInclInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceInclInd() {
        return priceInclInd;
    }

    /**
     * Sets the value of the priceInclInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceInclInd(Boolean value) {
        this.priceInclInd = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

}
