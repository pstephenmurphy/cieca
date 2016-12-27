package com.cieca.estimate.resource.entity.parts;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartCertificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartCertificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificationType" type="{http://www.cieca.com/BMS}CertificationTypeEnum"/>
 *         &lt;element name="CertifiedOnlyInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="CertifiedPreferredInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="CertificationNum" type="{http://www.cieca.com/BMS}Integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartCertificationType", propOrder = {
    "certificationType",
    "certifiedOnlyInd",
    "certifiedPreferredInd",
    "certificationNum"
})
public class PartCertificationType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "CertificationType", required = true)
    protected CertificationTypeEnum certificationType;
    @XmlElement(name = "CertifiedOnlyInd")
    protected Boolean certifiedOnlyInd;
    @XmlElement(name = "CertifiedPreferredInd")
    protected Boolean certifiedPreferredInd;
    @XmlElement(name = "CertificationNum")
    protected BigInteger certificationNum;

    /**
     * Gets the value of the certificationType property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationTypeEnum }
     *     
     */
    public CertificationTypeEnum getCertificationType() {
        return certificationType;
    }

    /**
     * Sets the value of the certificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationTypeEnum }
     *     
     */
    public void setCertificationType(CertificationTypeEnum value) {
        this.certificationType = value;
    }

    /**
     * Gets the value of the certifiedOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCertifiedOnlyInd() {
        return certifiedOnlyInd;
    }

    /**
     * Sets the value of the certifiedOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifiedOnlyInd(Boolean value) {
        this.certifiedOnlyInd = value;
    }

    /**
     * Gets the value of the certifiedPreferredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCertifiedPreferredInd() {
        return certifiedPreferredInd;
    }

    /**
     * Sets the value of the certifiedPreferredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifiedPreferredInd(Boolean value) {
        this.certifiedPreferredInd = value;
    }

    /**
     * Gets the value of the certificationNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCertificationNum() {
        return certificationNum;
    }

    /**
     * Sets the value of the certificationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCertificationNum(BigInteger value) {
        this.certificationNum = value;
    }

}
