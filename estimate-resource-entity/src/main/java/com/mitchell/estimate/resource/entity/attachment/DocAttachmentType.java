package com.mitchell.estimate.resource.entity.attachment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Allows the transmission of attachment files in several ways.  There is flexibility to transmit the attachments in either a legacy, or more modern transport model, including the flexibility of base 64 binary, and MIME for future growth
 * 
 * <p>Java class for DocAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentType" type="{http://www.cieca.com/BMS}AttachmentTypeEnum"/>
 *         &lt;choice>
 *           &lt;element name="AttachmentTitle" type="{http://www.cieca.com/BMS}AttachmentTitleType"/>
 *           &lt;element name="AttachmentMemo" type="{http://www.cieca.com/BMS}C"/>
 *         &lt;/choice>
 *         &lt;element name="CreateDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="CaptureDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *         &lt;element name="AttachmentFileType" type="{http://www.cieca.com/BMS}AttachmentFileTypeEnum"/>
 *         &lt;element name="AttachmentFileName" type="{http://www.cieca.com/BMS}FileNameType"/>
 *         &lt;element name="AttachmentLength" type="{http://www.cieca.com/BMS}AttachmentLengthType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="AttachmentURI" type="{http://www.cieca.com/BMS}anyURI"/>
 *           &lt;element name="EmbeddedAttachmentType" type="{http://www.cieca.com/BMS}EmbeddedAttachmentTypeType"/>
 *         &lt;/choice>
 *         &lt;element name="AttachmentIntegrity" type="{http://www.cieca.com/BMS}AttachmentIntegrityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocAttachmentType", propOrder = {
    "attachmentType",
    "attachmentTitle",
    "attachmentMemo",
    "createDateTime",
    "captureDateTime",
    "attachmentFileType",
    "attachmentFileName",
    "attachmentLength",
    "attachmentURI",
    "embeddedAttachmentType",
    "attachmentIntegrity"
})
public class DocAttachmentType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "AttachmentType", required = true)
    protected AttachmentTypeEnum attachmentType;
    @XmlElement(name = "AttachmentTitle")
    protected String attachmentTitle;
    @XmlElement(name = "AttachmentMemo")
    protected String attachmentMemo;
    @XmlElement(name = "CreateDateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(name = "CaptureDateTime")
    protected XMLGregorianCalendar captureDateTime;
    @XmlElement(name = "AttachmentFileType", required = true)
    protected AttachmentFileTypeEnum attachmentFileType;
    @XmlElement(name = "AttachmentFileName", required = true)
    protected String attachmentFileName;
    @XmlElement(name = "AttachmentLength")
    protected Integer attachmentLength;
    @XmlElement(name = "AttachmentURI")
    protected String attachmentURI;
    @XmlElement(name = "EmbeddedAttachmentType")
    protected EmbeddedAttachmentTypeType embeddedAttachmentType;
    @XmlElement(name = "AttachmentIntegrity")
    protected List<AttachmentIntegrityType> attachmentIntegrity;

    /**
     * Gets the value of the attachmentType property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentTypeEnum }
     *     
     */
    public AttachmentTypeEnum getAttachmentType() {
        return attachmentType;
    }

    /**
     * Sets the value of the attachmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentTypeEnum }
     *     
     */
    public void setAttachmentType(AttachmentTypeEnum value) {
        this.attachmentType = value;
    }

    /**
     * Gets the value of the attachmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentTitle() {
        return attachmentTitle;
    }

    /**
     * Sets the value of the attachmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentTitle(String value) {
        this.attachmentTitle = value;
    }

    /**
     * Gets the value of the attachmentMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentMemo() {
        return attachmentMemo;
    }

    /**
     * Sets the value of the attachmentMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentMemo(String value) {
        this.attachmentMemo = value;
    }

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
     * Gets the value of the captureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaptureDateTime() {
        return captureDateTime;
    }

    /**
     * Sets the value of the captureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaptureDateTime(XMLGregorianCalendar value) {
        this.captureDateTime = value;
    }

    /**
     * Gets the value of the attachmentFileType property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentFileTypeEnum }
     *     
     */
    public AttachmentFileTypeEnum getAttachmentFileType() {
        return attachmentFileType;
    }

    /**
     * Sets the value of the attachmentFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentFileTypeEnum }
     *     
     */
    public void setAttachmentFileType(AttachmentFileTypeEnum value) {
        this.attachmentFileType = value;
    }

    /**
     * Gets the value of the attachmentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    /**
     * Sets the value of the attachmentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFileName(String value) {
        this.attachmentFileName = value;
    }

    /**
     * Gets the value of the attachmentLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttachmentLength() {
        return attachmentLength;
    }

    /**
     * Sets the value of the attachmentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttachmentLength(Integer value) {
        this.attachmentLength = value;
    }

    /**
     * Gets the value of the attachmentURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentURI() {
        return attachmentURI;
    }

    /**
     * Sets the value of the attachmentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentURI(String value) {
        this.attachmentURI = value;
    }

    /**
     * Gets the value of the embeddedAttachmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedAttachmentTypeType }
     *     
     */
    public EmbeddedAttachmentTypeType getEmbeddedAttachmentType() {
        return embeddedAttachmentType;
    }

    /**
     * Sets the value of the embeddedAttachmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedAttachmentTypeType }
     *     
     */
    public void setEmbeddedAttachmentType(EmbeddedAttachmentTypeType value) {
        this.embeddedAttachmentType = value;
    }

    /**
     * Gets the value of the attachmentIntegrity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentIntegrity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentIntegrity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentIntegrityType }
     * 
     * 
     */
    public List<AttachmentIntegrityType> getAttachmentIntegrity() {
        if (attachmentIntegrity == null) {
            attachmentIntegrity = new ArrayList<AttachmentIntegrityType>();
        }
        return this.attachmentIntegrity;
    }

}
