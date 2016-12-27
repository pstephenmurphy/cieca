package com.cieca.estimate.resource.entity.document;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherReferenceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherReferenceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherReferenceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="50"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OtherRefNum">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="15"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "OtherReferenceInfoType", propOrder = {
    "otherReferenceName",
    "otherRefNum"
})
public class OtherReferenceInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "OtherReferenceName", required = true)
    protected String otherReferenceName;
    @XmlElement(name = "OtherRefNum", required = true)
    protected String otherRefNum;

    /**
     * Gets the value of the otherReferenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherReferenceName() {
        return otherReferenceName;
    }

    /**
     * Sets the value of the otherReferenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherReferenceName(String value) {
        this.otherReferenceName = value;
    }

    /**
     * Gets the value of the otherRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRefNum() {
        return otherRefNum;
    }

    /**
     * Sets the value of the otherRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRefNum(String value) {
        this.otherRefNum = value;
    }

}
