package com.cieca.estimate.resource.entity.policy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="CoverageCategory" type="{http://www.cieca.com/BMS}CoverageCategoryEnum"/>
 *                       &lt;element name="CoverageCode" type="{http://www.cieca.com/BMS}CoverageEnum" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;element name="CoverageCode" type="{http://www.cieca.com/BMS}CoverageEnum"/>
 *                   &lt;/choice>
 *                   &lt;element name="CoverageLimits" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PerPersonLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                             &lt;element name="PerOccurrenceLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                             &lt;element name="PerDayRentalLimit" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CoverageTransferableInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                   &lt;element name="DeductibleInfo" type="{http://www.cieca.com/BMS}DeductibleInfoType" minOccurs="0"/>
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
@XmlType(name = "CoverageInfoType", propOrder = {
    "coverage"
})
public class CoverageInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "Coverage", required = true)
    protected List<CoverageType> coverage;

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<CoverageType>();
        }
        return this.coverage;
    }
}
