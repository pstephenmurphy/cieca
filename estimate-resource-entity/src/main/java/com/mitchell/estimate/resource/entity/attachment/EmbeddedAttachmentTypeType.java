package com.mitchell.estimate.resource.entity.attachment;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbeddedAttachmentTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbeddedAttachmentTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmbeddedAttachment" type="{http://www.cieca.com/BMS}Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbeddedAttachmentTypeType", propOrder = {
    "embeddedAttachment"
})
public class EmbeddedAttachmentTypeType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "EmbeddedAttachment", required = true)
    protected byte[] embeddedAttachment;

    /**
     * Gets the value of the embeddedAttachment property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEmbeddedAttachment() {
        return embeddedAttachment;
    }

    /**
     * Sets the value of the embeddedAttachment property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEmbeddedAttachment(byte[] value) {
        this.embeddedAttachment = ((byte[]) value);
    }

}
