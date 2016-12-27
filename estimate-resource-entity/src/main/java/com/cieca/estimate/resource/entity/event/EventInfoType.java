package com.cieca.estimate.resource.entity.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.admin.AdminInfoType;


/**
 * <p>Java class for EventInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssignmentEvent" type="{http://www.cieca.com/BMS}AssignmentEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EstimateEvent" type="{http://www.cieca.com/BMS}EstimateEventType" minOccurs="0"/>
 *         &lt;element name="RepairEvent" type="{http://www.cieca.com/BMS}RepairEventType" minOccurs="0"/>
 *         &lt;element name="OtherEvent" type="{http://www.cieca.com/BMS}OtherEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RentalEvent" type="{http://www.cieca.com/BMS}RentalEventType" minOccurs="0"/>
 *         &lt;element name="SalvageEvent" type="{http://www.cieca.com/BMS}SalvageEventType" minOccurs="0"/>
 *         &lt;element name="AdminInfo" type="{http://www.cieca.com/BMS}AdminInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventInfoType", propOrder = {
    "assignmentEvent",
    "estimateEvent",
    "repairEvent",
    "otherEvent",
    "rentalEvent",
    "salvageEvent",
    "adminInfo"
})
public class EventInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "AssignmentEvent")
    protected List<AssignmentEventType> assignmentEvent;
    @XmlElement(name = "EstimateEvent")
    protected EstimateEventType estimateEvent;
    @XmlElement(name = "RepairEvent")
    protected RepairEventType repairEvent;
    @XmlElement(name = "OtherEvent")
    protected List<OtherEventType> otherEvent;
    @XmlElement(name = "RentalEvent")
    protected RentalEventType rentalEvent;
    @XmlElement(name = "SalvageEvent")
    protected SalvageEventType salvageEvent;
    @XmlElement(name = "AdminInfo")
    protected AdminInfoType adminInfo;

    /**
     * Gets the value of the assignmentEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignmentEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignmentEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignmentEventType }
     * 
     * 
     */
    public List<AssignmentEventType> getAssignmentEvent() {
        if (assignmentEvent == null) {
            assignmentEvent = new ArrayList<AssignmentEventType>();
        }
        return this.assignmentEvent;
    }

    /**
     * Gets the value of the estimateEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EstimateEventType }
     *     
     */
    public EstimateEventType getEstimateEvent() {
        return estimateEvent;
    }

    /**
     * Sets the value of the estimateEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimateEventType }
     *     
     */
    public void setEstimateEvent(EstimateEventType value) {
        this.estimateEvent = value;
    }

    /**
     * Gets the value of the repairEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RepairEventType }
     *     
     */
    public RepairEventType getRepairEvent() {
        return repairEvent;
    }

    /**
     * Sets the value of the repairEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairEventType }
     *     
     */
    public void setRepairEvent(RepairEventType value) {
        this.repairEvent = value;
    }

    /**
     * Gets the value of the otherEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherEventType }
     * 
     * 
     */
    public List<OtherEventType> getOtherEvent() {
        if (otherEvent == null) {
            otherEvent = new ArrayList<OtherEventType>();
        }
        return this.otherEvent;
    }

    /**
     * Gets the value of the rentalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RentalEventType }
     *     
     */
    public RentalEventType getRentalEvent() {
        return rentalEvent;
    }

    /**
     * Sets the value of the rentalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalEventType }
     *     
     */
    public void setRentalEvent(RentalEventType value) {
        this.rentalEvent = value;
    }

    /**
     * Gets the value of the salvageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SalvageEventType }
     *     
     */
    public SalvageEventType getSalvageEvent() {
        return salvageEvent;
    }

    /**
     * Sets the value of the salvageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalvageEventType }
     *     
     */
    public void setSalvageEvent(SalvageEventType value) {
        this.salvageEvent = value;
    }

    /**
     * Gets the value of the adminInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdminInfoType }
     *     
     */
    public AdminInfoType getAdminInfo() {
        return adminInfo;
    }

    /**
     * Sets the value of the adminInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminInfoType }
     *     
     */
    public void setAdminInfo(AdminInfoType value) {
        this.adminInfo = value;
    }

}
