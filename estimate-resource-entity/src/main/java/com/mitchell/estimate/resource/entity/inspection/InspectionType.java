package com.mitchell.estimate.resource.entity.inspection;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InspectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InspectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="InspectionCode" type="{http://www.cieca.com/BMS}InspectionCodeEnum"/>
 *             &lt;element name="InspectionSiteCode" type="{http://www.cieca.com/BMS}InspectionSiteEnum" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="InspectionSiteCode" type="{http://www.cieca.com/BMS}InspectionSiteEnum"/>
 *         &lt;/choice>
 *         &lt;element name="InspectionDesc" type="{http://www.cieca.com/BMS}OpenEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionType", propOrder = {
                "inspectionCode",
                "inspectionDesc",
                "inspectionSiteCode"
            })
public class InspectionType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "InspectionCode")
    protected InspectionCodeEnum inspectionCode;
    @XmlElement(name = "InspectionDesc")
    protected String inspectionDesc;
    @XmlElement(name = "InspectionSiteCode")
    protected InspectionSiteEnum inspectionSiteCode;


}
