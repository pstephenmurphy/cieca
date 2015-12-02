package com.mitchell.estimate.resource.entity.parts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Part" type="{http://www.cieca.com/BMS}LineItemCategoryClosedEnumType" maxOccurs="unbounded"/>
 *         &lt;element name="PartInfo" type="{http://www.cieca.com/BMS}PartInfoType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartsType", propOrder = {
    "part",
    "partInfo"
})
public class PartsType
    implements Serializable
{

    private final static long serialVersionUID = 20120730L;
    @XmlElement(name = "Part")
    protected List<String> part;
    @XmlElement(name = "PartInfo")
    protected List<PartInfoType> partInfo;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPart() {
        if (part == null) {
            part = new ArrayList<String>();
        }
        return this.part;
    }

    /**
     * Gets the value of the partInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInfoType }
     * 
     * 
     */
    public List<PartInfoType> getPartInfo() {
        if (partInfo == null) {
            partInfo = new ArrayList<PartInfoType>();
        }
        return this.partInfo;
    }

}
