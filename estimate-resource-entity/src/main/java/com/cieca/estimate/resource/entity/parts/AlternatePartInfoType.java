package com.cieca.estimate.resource.entity.parts;

import java.io.Serializable;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.address.StateProvinceEnum;

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
 *         &lt;element name="PartType" type="{http://www.cieca.com/BMS}PartTypeEnum"/>
 *         &lt;element name="SearchCode" type="{http://www.cieca.com/BMS}SearchCodeEnum" minOccurs="0"/>
 *         &lt;element name="DisclosureStateProvince" type="{http://www.cieca.com/BMS}StateProvinceEnum" minOccurs="0"/>
 *         &lt;element name="BeginSearchPostalCode" type="{http://www.cieca.com/BMS}PostalCodeType" minOccurs="0"/>
 *         &lt;element name="EndSearchPostalCode" type="{http://www.cieca.com/BMS}PostalCodeType" minOccurs="0"/>
 *         &lt;element name="SupplierLimit" type="{http://www.cieca.com/BMS}Integer" minOccurs="0"/>
 *         &lt;element name="MatrixName" type="{http://www.cieca.com/BMS}MatrixNameType" minOccurs="0"/>
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
    "partType",
    "searchCode",
    "disclosureStateProvince",
    "beginSearchPostalCode",
    "endSearchPostalCode",
    "supplierLimit",
    "matrixName"
})
public class AlternatePartInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PartType", required = true)
    protected PartTypeEnum partType;
    @XmlElement(name = "SearchCode")
    protected SearchCodeEnum searchCode;
    @XmlElement(name = "DisclosureStateProvince")
    protected StateProvinceEnum disclosureStateProvince;
    @XmlElement(name = "BeginSearchPostalCode")
    protected String beginSearchPostalCode;
    @XmlElement(name = "EndSearchPostalCode")
    protected String endSearchPostalCode;
    @XmlElement(name = "SupplierLimit")
    protected BigInteger supplierLimit;
    @XmlElement(name = "MatrixName")
    protected String matrixName;

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
     * Gets the value of the searchCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCodeEnum }
     *     
     */
    public SearchCodeEnum getSearchCode() {
        return searchCode;
    }

    /**
     * Sets the value of the searchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCodeEnum }
     *     
     */
    public void setSearchCode(SearchCodeEnum value) {
        this.searchCode = value;
    }

    /**
     * Gets the value of the disclosureStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceEnum }
     *     
     */
    public StateProvinceEnum getDisclosureStateProvince() {
        return disclosureStateProvince;
    }

    /**
     * Sets the value of the disclosureStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceEnum }
     *     
     */
    public void setDisclosureStateProvince(StateProvinceEnum value) {
        this.disclosureStateProvince = value;
    }

    /**
     * Gets the value of the beginSearchPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginSearchPostalCode() {
        return beginSearchPostalCode;
    }

    /**
     * Sets the value of the beginSearchPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginSearchPostalCode(String value) {
        this.beginSearchPostalCode = value;
    }

    /**
     * Gets the value of the endSearchPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndSearchPostalCode() {
        return endSearchPostalCode;
    }

    /**
     * Sets the value of the endSearchPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSearchPostalCode(String value) {
        this.endSearchPostalCode = value;
    }

    /**
     * Gets the value of the supplierLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplierLimit() {
        return supplierLimit;
    }

    /**
     * Sets the value of the supplierLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplierLimit(BigInteger value) {
        this.supplierLimit = value;
    }

    /**
     * Gets the value of the matrixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixName() {
        return matrixName;
    }

    /**
     * Sets the value of the matrixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixName(String value) {
        this.matrixName = value;
    }

}
