package com.cieca.estimate.resource.entity.idinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstimatorIDsTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatorIDsTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalEstimatorID" type="{http://www.cieca.com/BMS}EstimatorIDType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CurrentEstimatorID" type="{http://www.cieca.com/BMS}EstimatorIDType"/>
 *             &lt;element name="RoutingIDInfo" type="{http://www.cieca.com/BMS}IDInfoType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="RoutingIDInfo" type="{http://www.cieca.com/BMS}IDInfoType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatorIDsTypeType", propOrder = {
    "originalEstimatorID",
    "currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo",
})
public class EstimatorIDsTypeType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "OriginalEstimatorID")
    protected String originalEstimatorID;
    @XmlElements({
        @XmlElement(name = "CurrentEstimatorID", type = String.class),
        @XmlElement(name = "RoutingIDInfo", type = IDInfoType.class)
    })
    protected List<Serializable> currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo;

    /**
     * Gets the value of the originalEstimatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalEstimatorID() {
        return originalEstimatorID;
    }

    /**
     * Sets the value of the originalEstimatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalEstimatorID(String value) {
        this.originalEstimatorID = value;
    }

    /**
     * Gets the value of the currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link IDInfoType }
     * 
     * 
     */
    public List<Serializable> getCurrentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo() {
        if (currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo == null) {
            currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo = new ArrayList<Serializable>();
        }
        return this.currentEstimatorIDAndRoutingIDInfoOrRoutingIDInfo;
    }
}
