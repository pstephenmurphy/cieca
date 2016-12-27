package com.cieca.estimate.resource.entity.person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cieca.estimate.resource.entity.communication.CommunicationsType;
import com.cieca.estimate.resource.entity.idinfo.IDInfoType;


/**
 * <p>Java class for PersonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.cieca.com/BMS}PersonNameType"/>
 *         &lt;element name="IDInfo" type="{http://www.cieca.com/BMS}IDInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Communications" type="{http://www.cieca.com/BMS}CommunicationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.cieca.com/BMS}JobTitleType" minOccurs="0"/>
 *         &lt;element name="AdditionalName" type="{http://www.cieca.com/BMS}PersonNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.cieca.com/BMS}Date" minOccurs="0"/>
 *         &lt;element name="Employer" type="{http://www.cieca.com/BMS}EmployerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfoType", propOrder = {
    "personName",
    "idInfo",
    "communications",
    "jobTitle",
    "additionalName",
    "birthDate",
    "employer"
})
public class PersonInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "PersonName", required = true)
    protected PersonNameType personName;
    @XmlElement(name = "IDInfo")
    protected List<IDInfoType> idInfo;
    @XmlElement(name = "Communications")
    protected List<CommunicationsType> communications;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "AdditionalName")
    protected List<PersonNameType> additionalName;
    @XmlElement(name = "BirthDate")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Employer")
    protected String employer;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDInfoType }
     * 
     * 
     */
    public List<IDInfoType> getIDInfo() {
        if (idInfo == null) {
            idInfo = new ArrayList<IDInfoType>();
        }
        return this.idInfo;
    }

    /**
     * Gets the value of the communications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationsType }
     * 
     * 
     */
    public List<CommunicationsType> getCommunications() {
        if (communications == null) {
            communications = new ArrayList<CommunicationsType>();
        }
        return this.communications;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the additionalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getAdditionalName() {
        if (additionalName == null) {
            additionalName = new ArrayList<PersonNameType>();
        }
        return this.additionalName;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployer(String value) {
        this.employer = value;
    }

}
