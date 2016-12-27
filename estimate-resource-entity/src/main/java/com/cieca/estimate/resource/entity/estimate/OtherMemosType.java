package com.cieca.estimate.resource.entity.estimate;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherMemosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherMemosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherMemoRef" type="{http://www.cieca.com/BMS}OtherMemoReferenceOpenEnumType"/>
 *         &lt;element name="OtherMemo" type="{http://www.cieca.com/BMS}C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherMemosType", propOrder = {
    "otherMemoRef",
    "otherMemo"
})
public class OtherMemosType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "OtherMemoRef", required = true)
    protected OtherMemoReferenceEnum otherMemoRef;
    @XmlElement(name = "OtherMemo", required = true)
    protected String otherMemo;

    /**
     * Gets the value of the otherMemoRef property.
     * 
     * @return
     *     possible object is
     *     {@link OtherMemoReferenceEnum }
     *     
     */
    public OtherMemoReferenceEnum getOtherMemoRef() {
        return otherMemoRef;
    }

    /**
     * Sets the value of the otherMemoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherMemoReferenceEnum }
     *     
     */
    public void setOtherMemoRef(OtherMemoReferenceEnum value) {
        this.otherMemoRef = value;
    }

    /**
     * Gets the value of the otherMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherMemo() {
        return otherMemo;
    }

    /**
     * Sets the value of the otherMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherMemo(String value) {
        this.otherMemo = value;
    }

}
