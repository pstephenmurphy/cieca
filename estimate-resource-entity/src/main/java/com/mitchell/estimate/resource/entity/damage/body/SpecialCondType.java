package com.mitchell.estimate.resource.entity.damage.body;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="SpecialCondDesc" type="{http://www.cieca.com/BMS}SpecialCondDescType"/>
 *           &lt;element name="SpecialCondType" type="{http://www.cieca.com/BMS}SpecialConditionTypeEnum"/>
 *         &lt;/choice>
 *         &lt;element name="SpecialCondAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialCondType", propOrder = { "specialCondDesc", "specialCondType", "specialCondAmt" })
public class SpecialCondType implements Serializable {

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "SpecialCondDesc")
    protected String specialCondDesc;
    @XmlElement(name = "SpecialCondType")
    protected SpecialConditionTypeEnum specialCondType;
    @XmlElement(name = "SpecialCondAmt")
    protected BigDecimal specialCondAmt;

    /**
     * Gets the value of the specialCondDesc property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSpecialCondDesc() {
        return specialCondDesc;
    }

    /**
     * Sets the value of the specialCondDesc property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSpecialCondDesc(String value) {
        this.specialCondDesc = value;
    }

    /**
     * Gets the value of the specialCondType property.
     * 
     * @return possible object is {@link SpecialConditionTypeEnum }
     * 
     */
    public SpecialConditionTypeEnum getSpecialCondType() {
        return specialCondType;
    }

    /**
     * Sets the value of the specialCondType property.
     * 
     * @param value allowed object is {@link SpecialConditionTypeEnum }
     * 
     */
    public void setSpecialCondType(SpecialConditionTypeEnum value) {
        this.specialCondType = value;
    }

    /**
     * Gets the value of the specialCondAmt property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getSpecialCondAmt() {
        return specialCondAmt;
    }

    /**
     * Sets the value of the specialCondAmt property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setSpecialCondAmt(BigDecimal value) {
        this.specialCondAmt = value;
    }

}
