package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EstimateEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimateEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CommitDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="UploadDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="PrintDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="ReferralSourceType" type="{http://www.cieca.com/BMS}ReferralSourceTypeEnum" minOccurs="0"/>
 *         &lt;element name="ReferralSourceName" type="{http://www.cieca.com/BMS}ReferralSourceNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateEventType", propOrder = {
    "createDateTime",
    "commitDateTime",
    "uploadDateTime",
    "printDateTime",
    "referralSourceType",
    "referralSourceName"
})
public class EstimateEventType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "CreateDateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(name = "CommitDateTime")
    protected XMLGregorianCalendar commitDateTime;
    @XmlElement(name = "UploadDateTime")
    protected XMLGregorianCalendar uploadDateTime;
    @XmlElement(name = "PrintDateTime")
    protected XMLGregorianCalendar printDateTime;
    @XmlElement(name = "ReferralSourceType")
    protected ReferralSourceTypeEnum referralSourceType;
    @XmlElement(name = "ReferralSourceName")
    protected String referralSourceName;

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the commitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitDateTime() {
        return commitDateTime;
    }

    /**
     * Sets the value of the commitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitDateTime(XMLGregorianCalendar value) {
        this.commitDateTime = value;
    }

    /**
     * Gets the value of the uploadDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUploadDateTime() {
        return uploadDateTime;
    }

    /**
     * Sets the value of the uploadDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUploadDateTime(XMLGregorianCalendar value) {
        this.uploadDateTime = value;
    }

    /**
     * Gets the value of the printDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDateTime() {
        return printDateTime;
    }

    /**
     * Sets the value of the printDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDateTime(XMLGregorianCalendar value) {
        this.printDateTime = value;
    }

    /**
     * Gets the value of the referralSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferralSourceTypeEnum }
     *     
     */
    public ReferralSourceTypeEnum getReferralSourceType() {
        return referralSourceType;
    }

    /**
     * Sets the value of the referralSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferralSourceTypeEnum }
     *     
     */
    public void setReferralSourceType(ReferralSourceTypeEnum value) {
        this.referralSourceType = value;
    }

    /**
     * Gets the value of the referralSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralSourceName() {
        return referralSourceName;
    }

    /**
     * Sets the value of the referralSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralSourceName(String value) {
        this.referralSourceName = value;
    }

}
