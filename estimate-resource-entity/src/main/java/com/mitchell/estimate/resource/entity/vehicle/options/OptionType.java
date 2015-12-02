package com.mitchell.estimate.resource.entity.vehicle.options;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionCode" type="{http://www.cieca.com/BMS}OptionsOpenEnumType"/>
 *         &lt;element name="OptionDesc" type="{http://www.cieca.com/BMS}Char_80"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionType", propOrder = {
    "optionCode",
    "optionDesc"
})
public class OptionType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "OptionCode", required = true)
    protected String optionCode;
    @XmlElement(name = "OptionDesc", required = true)
    protected String optionDesc;

    /**
     * Gets the value of the optionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * Sets the value of the optionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionCode(String value) {
        this.optionCode = value;
    }

    /**
     * Gets the value of the optionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionDesc() {
        return optionDesc;
    }

    /**
     * Sets the value of the optionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionDesc(String value) {
        this.optionDesc = value;
    }

}
