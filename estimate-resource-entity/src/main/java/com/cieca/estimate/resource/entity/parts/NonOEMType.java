package com.cieca.estimate.resource.entity.parts;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeEnum"/>
 *         &lt;element name="NonOEMPartNum" type="{http://www.cieca.com/BMS}PartNumType"/>
 *         &lt;element name="NonOEMPartPrice" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *         &lt;element name="NonOEMPartDesc" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="SupplierRefNum" type="{http://www.cieca.com/BMS}SupplierRefNumType"/>
 *         &lt;element name="PartSelectedInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOEMType", propOrder = { "partType", "nonOEMPartNum", "nonOEMPartPrice", "nonOEMPartDesc", "supplierRefNum",
                "partSelectedInd" })
public class NonOEMType implements Serializable {
    private static final long serialVersionUID = 1990679841273807823L;

    @XmlElement(name = "PartType", required = true)
    public PartTypeEnum partType;

    @XmlElement(name = "NonOEMPartNum", required = true)
    public String nonOEMPartNum;

    @XmlElement(name = "NonOEMPartPrice")
    public BigDecimal nonOEMPartPrice;

    @XmlElement(name = "NonOEMPartDesc")
    public String nonOEMPartDesc;

    @XmlElement(name = "SupplierRefNum", required = true)
    public String supplierRefNum;

    @XmlElement(name = "PartSelectedInd")
    public Boolean partSelectedInd;

    /**
     * Gets the value of the partType property.
     * 
     * @return possible object is {@link PartTypeEnum }
     * 
     */
    public PartTypeEnum getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value allowed object is {@link PartTypeEnum }
     * 
     */
    public void setPartType(PartTypeEnum value) {
        partType = value;
    }

    /**
     * Gets the value of the nonOEMPartNum property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNonOEMPartNum() {
        return nonOEMPartNum;
    }

    /**
     * Sets the value of the nonOEMPartNum property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNonOEMPartNum(String value) {
        nonOEMPartNum = value;
    }

    /**
     * Gets the value of the nonOEMPartPrice property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getNonOEMPartPrice() {
        return nonOEMPartPrice;
    }

    /**
     * Sets the value of the nonOEMPartPrice property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setNonOEMPartPrice(BigDecimal value) {
        nonOEMPartPrice = value;
    }

    /**
     * Gets the value of the nonOEMPartDesc property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNonOEMPartDesc() {
        return nonOEMPartDesc;
    }

    /**
     * Sets the value of the nonOEMPartDesc property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNonOEMPartDesc(String value) {
        nonOEMPartDesc = value;
    }

    /**
     * Gets the value of the supplierRefNum property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSupplierRefNum() {
        return supplierRefNum;
    }

    /**
     * Sets the value of the supplierRefNum property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSupplierRefNum(String value) {
        supplierRefNum = value;
    }

    /**
     * Gets the value of the partSelectedInd property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean getPartSelectedInd() {
        return partSelectedInd;
    }

    /**
     * Sets the value of the partSelectedInd property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setPartSelectedInd(Boolean value) {
        partSelectedInd = value;
    }
}
