package com.cieca.estimate.resource.entity.rate.tax;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TaxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxType" type="{http://www.cieca.com/BMS}TaxTypeClosedEnumType"/>
 *         &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean"/>
 *         &lt;element name="TaxTierInfo" type="{http://www.cieca.com/BMS}TierInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfoType", propOrder = {
    "taxType",
    "taxableInd",
    "taxTierInfo"
})
public class TaxInfoType implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    
    @XmlElement(name = "TaxType", required = true)
    protected TaxTypeEnum taxType;
    
    @XmlElement(name = "TaxableInd")
    protected boolean taxableInd;
    
    @XmlElement(name = "TaxTierInfo")
    protected List<RateTierInfoType> taxTierInfo;

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
     * Gets the value of the taxableInd property.
     * 
     */
    public boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     */
    public void setTaxableInd(boolean value) {
        this.taxableInd = value;
    }

    /**
     * Gets the value of the taxTierInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTierInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTierInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTierInfoType }
     * 
     * 
     */
    public List<RateTierInfoType> getTaxTierInfo() {
        if (taxTierInfo == null) {
            taxTierInfo = new ArrayList<RateTierInfoType>();
        }
        return this.taxTierInfo;
    }

}
