package com.cieca.estimate.resource.entity.policy;

import java.io.Serializable;

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
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CoverageCategory" type="{http://www.cieca.com/BMS}CoverageCategoryEnum"/>
 *             &lt;element name="CoverageCode" type="{http://www.cieca.com/BMS}CoverageEnum" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="CoverageCode" type="{http://www.cieca.com/BMS}CoverageEnum"/>
 *         &lt;/choice>
 *         &lt;element name="CoverageLimits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PerPersonLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="PerOccurrenceLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="PerDayRentalLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CoverageTransferableInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="DeductibleInfo" type="{http://www.cieca.com/BMS}DeductibleInfoType" minOccurs="0"/>
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
    "coverageLimits", 
    "coverageCode", 
    "coverageTransferableInd", 
    "deductibleInfo", 
    "coverageCategory"

})
public class CoverageType implements Serializable {

    private final static long serialVersionUID = 20120208L;

    @XmlElement(name = "CoverageLimits")
    protected CoverageLimitsType coverageLimits;

    @XmlElement(name = "CoverageCode")
    protected CoverageEnum coverageCode;

    @XmlElement(name = "CoverageTransferableInd")
    protected Boolean coverageTransferableInd;

    @XmlElement(name = "DeductibleInfo")
    protected DeductibleInfoType deductibleInfo;

    @XmlElement(name = "CoverageCategory")
    protected CoverageCategoryEnum coverageCategory;

    public CoverageLimitsType getCoverageLimits() {
        return coverageLimits;
    }

    /**
     * Sets the coverage limits.
     *
     * @param coverageLimits the new coverage limits
     */
    public void setCoverageLimits(CoverageLimitsType coverageLimits) {
        this.coverageLimits = coverageLimits;
    }

    /**
     * Gets the coverage code.
     *
     * @return the coverage code
     */
    public CoverageEnum getCoverageCode() {
        return coverageCode;
    }

    /**
     * Sets the coverage code.
     *
     * @param coverageCode the new coverage code
     */
    public void setCoverageCode(CoverageEnum coverageCode) {
        this.coverageCode = coverageCode;
    }

    /**
     * Gets the coverage transferable ind.
     *
     * @return the coverage transferable ind
     */
    public Boolean getCoverageTransferableInd() {
        return coverageTransferableInd;
    }

    /**
     * Sets the coverage transferable ind.
     *
     * @param coverageTransferableInd the new coverage transferable ind
     */
    public void setCoverageTransferableInd(Boolean coverageTransferableInd) {
        this.coverageTransferableInd = coverageTransferableInd;
    }

    /**
     * Gets the deductible info.
     *
     * @return the deductible info
     */
    public DeductibleInfoType getDeductibleInfo() {
        return deductibleInfo;
    }

    /**
     * Sets the deductible info.
     *
     * @param deductibleInfo the new deductible info
     */
    public void setDeductibleInfo(DeductibleInfoType deductibleInfo) {
        this.deductibleInfo = deductibleInfo;
    }

    /**
     * Gets the coverage category.
     *
     * @return the coverage category
     */
    public CoverageCategoryEnum getCoverageCategory() {
        return coverageCategory;
    }

    /**
     * Sets the coverage category.
     *
     * @param coverageCategory the new coverage category
     */
    public void setCoverageCategory(CoverageCategoryEnum coverageCategory) {
        this.coverageCategory = coverageCategory;
    }

}