package com.mitchell.estimate.resource.entity.parts;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlassKitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlassKitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartNum" type="{http://www.cieca.com/BMS}PartNumType"/>
 *         &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeEnum"/>
 *         &lt;element name="GlassKitPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="GlassKitQuantity" type="{http://www.cieca.com/BMS}GlassKitQuantityType"/>
 *         &lt;element name="GlassKitTotal" type="{http://www.cieca.com/BMS}Currency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlassKitType", propOrder = {
    "partNum",
    "partType",
    "glassKitPrice",
    "glassKitQuantity",
    "glassKitTotal"
})
public class GlassKitType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PartNum", required = true)
    protected String partNum;
    @XmlElement(name = "PartType", required = true)
    protected PartTypeEnum partType;
    @XmlElement(name = "GlassKitPrice")
    protected BigDecimal glassKitPrice;
    @XmlElement(name = "GlassKitQuantity", required = true)
    protected String glassKitQuantity;
    @XmlElement(name = "GlassKitTotal", required = true)
    protected BigDecimal glassKitTotal;

    /**
     * Gets the value of the partNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNum() {
        return partNum;
    }

    /**
     * Sets the value of the partNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNum(String value) {
        this.partNum = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link PartTypeEnum }
     *     
     */
    public PartTypeEnum getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartTypeEnum }
     *     
     */
    public void setPartType(PartTypeEnum value) {
        this.partType = value;
    }

    /**
     * Gets the value of the glassKitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlassKitPrice() {
        return glassKitPrice;
    }

    /**
     * Sets the value of the glassKitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlassKitPrice(BigDecimal value) {
        this.glassKitPrice = value;
    }

    /**
     * Gets the value of the glassKitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlassKitQuantity() {
        return glassKitQuantity;
    }

    /**
     * Sets the value of the glassKitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlassKitQuantity(String value) {
        this.glassKitQuantity = value;
    }

    /**
     * Gets the value of the glassKitTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGlassKitTotal() {
        return glassKitTotal;
    }

    /**
     * Sets the value of the glassKitTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGlassKitTotal(BigDecimal value) {
        this.glassKitTotal = value;
    }

}
