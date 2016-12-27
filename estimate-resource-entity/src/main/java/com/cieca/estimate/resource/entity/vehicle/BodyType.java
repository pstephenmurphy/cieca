package com.cieca.estimate.resource.entity.vehicle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BodyStyleNum" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BodyStyle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DoorQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}Integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Trim" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TrimColor" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TrimCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MoldingCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.cieca.com/BMS}C">
 *                         &lt;maxLength value="20"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "BodyType", propOrder = {
    "bodyStyleNum",
    "bodyStyle",
    "doorQuantity",
    "trim"
})
public class BodyType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "BodyStyleNum")
    protected String bodyStyleNum;
    @XmlElement(name = "BodyStyle")
    protected String bodyStyle;
    @XmlElement(name = "DoorQuantity")
    protected Integer doorQuantity;
    @XmlElement(name = "Trim")
    protected List<TrimType> trim;

    /**
     * Gets the value of the bodyStyleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyleNum() {
        return bodyStyleNum;
    }

    /**
     * Sets the value of the bodyStyleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyleNum(String value) {
        this.bodyStyleNum = value;
    }

    /**
     * Gets the value of the bodyStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    /**
     * Sets the value of the bodyStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyle(String value) {
        this.bodyStyle = value;
    }

    /**
     * Gets the value of the doorQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoorQuantity() {
        return doorQuantity;
    }

    /**
     * Sets the value of the doorQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoorQuantity(Integer value) {
        this.doorQuantity = value;
    }

    /**
     * Gets the value of the trim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrimType }
     * 
     * 
     */
    public List<TrimType> getTrim() {
        if (trim == null) {
            trim = new ArrayList<TrimType>();
        }
        return this.trim;
    }
}
