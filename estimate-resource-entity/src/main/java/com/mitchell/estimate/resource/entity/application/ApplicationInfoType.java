package com.mitchell.estimate.resource.entity.application;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApplicationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationType" type="{http://www.cieca.com/BMS}ApplicationTypeEnum"/>
 *         &lt;element name="ApplicationName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApplicationVer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;maxLength value="12"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatabaseVer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.cieca.com/BMS}C">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DatabaseDateTime" type="{http://www.cieca.com/BMS}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationInfoType", propOrder = {
    "applicationType",
    "applicationName",
    "applicationVer",
    "databaseVer",
    "databaseDateTime"
})
public class ApplicationInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "ApplicationType", required = true)
    protected ApplicationTypeEnum applicationType;
    @XmlElement(name = "ApplicationName", required = true)
    protected String applicationName;
    @XmlElement(name = "ApplicationVer", required = true)
    protected String applicationVer;
    @XmlElement(name = "DatabaseVer")
    protected String databaseVer;
    @XmlElement(name = "DatabaseDateTime")
    protected XMLGregorianCalendar databaseDateTime;

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeEnum }
     *     
     */
    public ApplicationTypeEnum getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeEnum }
     *     
     */
    public void setApplicationType(ApplicationTypeEnum value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the applicationVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationVer() {
        return applicationVer;
    }

    /**
     * Sets the value of the applicationVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationVer(String value) {
        this.applicationVer = value;
    }

    /**
     * Gets the value of the databaseVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseVer() {
        return databaseVer;
    }

    /**
     * Sets the value of the databaseVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseVer(String value) {
        this.databaseVer = value;
    }

    /**
     * Gets the value of the databaseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatabaseDateTime() {
        return databaseDateTime;
    }

    /**
     * Sets the value of the databaseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatabaseDateTime(XMLGregorianCalendar value) {
        this.databaseDateTime = value;
    }

}
