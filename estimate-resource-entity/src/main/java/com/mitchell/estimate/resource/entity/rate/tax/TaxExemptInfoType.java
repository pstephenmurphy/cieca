package com.mitchell.estimate.resource.entity.rate.tax;

import java.io.Serializable;

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
 *         &lt;element name="TaxType" type="{http://www.cieca.com/BMS}TaxTypeEnum"/>
 *         &lt;element name="TaxExemptInd" type="{http://www.cieca.com/BMS}Boolean"/>
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
    "taxType",
    "taxExemptInd"
})
public class TaxExemptInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "TaxType", required = true)
    protected TaxTypeEnum taxType;
    @XmlElement(name = "TaxExemptInd")
    protected boolean taxExemptInd;

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeEnum }
     *     
     */
    public TaxTypeEnum getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeEnum }
     *     
     */
    public void setTaxType(TaxTypeEnum value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the taxExemptInd property.
     * 
     */
    public boolean isTaxExemptInd() {
        return taxExemptInd;
    }

    /**
     * Sets the value of the taxExemptInd property.
     * 
     */
    public void setTaxExemptInd(boolean value) {
        this.taxExemptInd = value;
    }

}
