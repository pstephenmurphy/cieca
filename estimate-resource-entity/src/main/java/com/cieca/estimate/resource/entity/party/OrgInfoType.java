package com.cieca.estimate.resource.entity.party;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.communication.CommunicationsType;
import com.cieca.estimate.resource.entity.idinfo.IDInfoType;

/**
 * <p>Java class for OrgInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CompanyName" type="{http://www.cieca.com/BMS}Char_80"/>
 *             &lt;element name="IDInfo" type="{http://www.cieca.com/BMS}IDInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="IDInfo" type="{http://www.cieca.com/BMS}IDInfoType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="Communications" type="{http://www.cieca.com/BMS}CommunicationsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgInfoType", propOrder = {
    "communications",
    "idInfo",
    "companyName"
})
public class OrgInfoType
    implements Serializable
{
    private final static long serialVersionUID = 20120730L;

    @XmlElement(name = "Communications")
    protected CommunicationsType communications;
    @XmlElement(name = "IDInfo")
    protected IDInfoType idInfo;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    
    public CommunicationsType getCommunications() {
        return communications;
    }
    
    public void setCommunications(CommunicationsType communications) {
        this.communications = communications;
    }
    
    public IDInfoType getIdInfo() {
        return idInfo;
    }
    
    public void setIdInfo(IDInfoType idInfo) {
        this.idInfo = idInfo;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
