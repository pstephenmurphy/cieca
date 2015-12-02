package com.mitchell.estimate.resource.entity.document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMSObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMSObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UUID" type="{http://www.cieca.com/BMS}UUID"/>
 *         &lt;element name="RefUUID" type="{http://www.cieca.com/BMS}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMSObjectType", propOrder = {
    "uuid",
    "refUUID"
})
public class BMSObjectType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "RefUUID")
    protected String refUUID;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the refUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefUUID() {
        return refUUID;
    }

    /**
     * Sets the value of the refUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefUUID(String value) {
        this.refUUID = value;
    }

}
