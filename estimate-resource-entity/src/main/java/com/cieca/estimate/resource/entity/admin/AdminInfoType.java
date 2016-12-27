package com.cieca.estimate.resource.entity.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.cieca.estimate.resource.entity.party.AccompanyingPartyType;
import com.cieca.estimate.resource.entity.party.CancellationPartyType;
import com.cieca.estimate.resource.entity.party.DemandingPartyType;
import com.cieca.estimate.resource.entity.party.GenericPartyType;
import com.cieca.estimate.resource.entity.party.OtherPartyType;
import com.cieca.estimate.resource.entity.party.RepresentativePartyType;
import com.cieca.estimate.resource.entity.party.ResponsiblePartyType;


/**
 * <p>Java class for AdminInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceCompany" type="{http://www.cieca.com/BMS}InsuranceCompanyType" minOccurs="0"/>
 *         &lt;element name="ClaimOffice" type="{http://www.cieca.com/BMS}EstimatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsuranceAgent" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="PolicyHolder" type="{http://www.cieca.com/BMS}PolicyHolderType" minOccurs="0"/>
 *         &lt;element name="Insured" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Claimant" type="{http://www.cieca.com/BMS}ClaimantType" minOccurs="0"/>
 *         &lt;element name="Estimator" type="{http://www.cieca.com/BMS}EstimatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InspectionSite" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="RepairFacility" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="VehicleLocationSite" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="LossLocationSite" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="InitialPickUpLocationSite" type="{http://www.cieca.com/BMS}LocationSiteType" minOccurs="0"/>
 *         &lt;element name="DestinationLocationSite" type="{http://www.cieca.com/BMS}LocationSiteType" minOccurs="0"/>
 *         &lt;element name="Consolidator" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Adjuster" type="{http://www.cieca.com/BMS}AdjusterType" minOccurs="0"/>
 *         &lt;element name="Supplier" type="{http://www.cieca.com/BMS}GenericPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAdministrator" type="{http://www.cieca.com/BMS}ThirdPartyAdministratorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Renter" type="{http://www.cieca.com/BMS}RenterType" minOccurs="0"/>
 *         &lt;element name="AlternateInsurer" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Forwarder" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Sender" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Submitter" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="RentalCarCompany" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="RentalOffice" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="GovernmentAgency" type="{http://www.cieca.com/BMS}LocationSiteType" minOccurs="0"/>
 *         &lt;element name="ProcessDelay" type="{http://www.cieca.com/BMS}ProcessDelayType" minOccurs="0"/>
 *         &lt;element name="CancellationParty" type="{http://www.cieca.com/BMS}CancellationPartyType" minOccurs="0"/>
 *         &lt;element name="FleetCompany" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="Driver" type="{http://www.cieca.com/BMS}GenericPartyType" minOccurs="0"/>
 *         &lt;element name="OtherParty" type="{http://www.cieca.com/BMS}OtherPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DemandingParty" type="{http://www.cieca.com/BMS}DemandingPartyType" minOccurs="0"/>
 *         &lt;element name="ResponsibleParty" type="{http://www.cieca.com/BMS}ResponsiblePartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RepresentativeParty" type="{http://www.cieca.com/BMS}RepresentativePartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccompanyingParty" type="{http://www.cieca.com/BMS}AccompanyingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminInfoType", propOrder = {
    "insuranceCompany",
    "claimOffice",
    "insuranceAgent",
    "policyHolder",
    "insured",
    "owner",
    "claimant",
    "estimator",
    "inspectionSite",
    "repairFacility",
    "vehicleLocationSite",
    "lossLocationSite",
    "initialPickUpLocationSite",
    "destinationLocationSite",
    "consolidator",
    "adjuster",
    "supplier",
    "thirdPartyAdministrator",
    "renter",
    "alternateInsurer",
    "receiver",
    "forwarder",
    "sender",
    "submitter",
    "rentalCarCompany",
    "rentalOffice",
    "governmentAgency",
    "processDelay",
    "cancellationParty",
    "fleetCompany",
    "driver",
    "otherParty",
    "demandingParty",
    "responsibleParty",
    "representativeParty",
    "accompanyingParty"
})
@XmlRootElement(name = "AdminInfoType")
public class AdminInfoType implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    @XmlElement(name = "InsuranceCompany")
    protected InsuranceCompanyType insuranceCompany;
    @XmlElement(name = "ClaimOffice")
    protected List<EstimatorType> claimOffice;
    @XmlElement(name = "InsuranceAgent")
    protected GenericPartyType insuranceAgent;
    @XmlElement(name = "PolicyHolder")
    protected PolicyHolderType policyHolder;
    @XmlElement(name = "Insured")
    protected GenericPartyType insured;
    @XmlElement(name = "Owner")
    protected GenericPartyType owner;
    @XmlElement(name = "Claimant")
    protected ClaimantType claimant;
    @XmlElement(name = "Estimator")
    protected List<EstimatorType> estimator;
    @XmlElement(name = "InspectionSite")
    protected GenericPartyType inspectionSite;
    @XmlElement(name = "RepairFacility")
    protected GenericPartyType repairFacility;
    @XmlElement(name = "VehicleLocationSite")
    protected GenericPartyType vehicleLocationSite;
    @XmlElement(name = "LossLocationSite")
    protected GenericPartyType lossLocationSite;
    @XmlElement(name = "InitialPickUpLocationSite")
    protected LocationSiteType initialPickUpLocationSite;
    @XmlElement(name = "DestinationLocationSite")
    protected LocationSiteType destinationLocationSite;
    @XmlElement(name = "Consolidator")
    protected GenericPartyType consolidator;
    @XmlElement(name = "Adjuster")
    protected AdjusterType adjuster;
    @XmlElement(name = "Supplier")
    protected List<GenericPartyType> supplier;
    @XmlElement(name = "ThirdPartyAdministrator")
    protected List<ThirdPartyAdministratorType> thirdPartyAdministrator;
    @XmlElement(name = "Renter")
    protected RenterType renter;
    @XmlElement(name = "AlternateInsurer")
    protected GenericPartyType alternateInsurer;
    @XmlElement(name = "Receiver")
    protected GenericPartyType receiver;
    @XmlElement(name = "Forwarder")
    protected GenericPartyType forwarder;
    @XmlElement(name = "Sender")
    protected GenericPartyType sender;
    @XmlElement(name = "Submitter")
    protected GenericPartyType submitter;
    @XmlElement(name = "RentalCarCompany")
    protected GenericPartyType rentalCarCompany;
    @XmlElement(name = "RentalOffice")
    protected GenericPartyType rentalOffice;
    @XmlElement(name = "GovernmentAgency")
    protected LocationSiteType governmentAgency;
    @XmlElement(name = "ProcessDelay")
    protected ProcessDelayType processDelay;
    @XmlElement(name = "CancellationParty")
    protected CancellationPartyType cancellationParty;
    @XmlElement(name = "FleetCompany")
    protected GenericPartyType fleetCompany;
    @XmlElement(name = "Driver")
    protected GenericPartyType driver;
    @XmlElement(name = "OtherParty")
    protected List<OtherPartyType> otherParty;
    @XmlElement(name = "DemandingParty")
    protected DemandingPartyType demandingParty;
    @XmlElement(name = "ResponsibleParty")
    protected List<ResponsiblePartyType> responsibleParty;
    @XmlElement(name = "RepresentativeParty")
    protected List<RepresentativePartyType> representativeParty;
    @XmlElement(name = "AccompanyingParty")
    protected List<AccompanyingPartyType> accompanyingParty;

    /**
     * Gets the value of the insuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCompanyType }
     *     
     */
    public InsuranceCompanyType getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * Sets the value of the insuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCompanyType }
     *     
     */
    public void setInsuranceCompany(InsuranceCompanyType value) {
        this.insuranceCompany = value;
    }

    /**
     * Gets the value of the claimOffice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimOffice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimOffice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatorType }
     * 
     * 
     */
    public List<EstimatorType> getClaimOffice() {
        if (claimOffice == null) {
            claimOffice = new ArrayList<EstimatorType>();
        }
        return this.claimOffice;
    }

    /**
     * Gets the value of the insuranceAgent property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getInsuranceAgent() {
        return insuranceAgent;
    }

    /**
     * Sets the value of the insuranceAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setInsuranceAgent(GenericPartyType value) {
        this.insuranceAgent = value;
    }

    /**
     * Gets the value of the policyHolder property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyHolderType }
     *     
     */
    public PolicyHolderType getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the value of the policyHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyHolderType }
     *     
     */
    public void setPolicyHolder(PolicyHolderType value) {
        this.policyHolder = value;
    }

    /**
     * Gets the value of the insured property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getInsured() {
        return insured;
    }

    /**
     * Sets the value of the insured property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setInsured(GenericPartyType value) {
        this.insured = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setOwner(GenericPartyType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the claimant property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimantType }
     *     
     */
    public ClaimantType getClaimant() {
        return claimant;
    }

    /**
     * Sets the value of the claimant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimantType }
     *     
     */
    public void setClaimant(ClaimantType value) {
        this.claimant = value;
    }

    /**
     * Gets the value of the estimator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatorType }
     * 
     * 
     */
    public List<EstimatorType> getEstimator() {
        if (estimator == null) {
            estimator = new ArrayList<EstimatorType>();
        }
        return this.estimator;
    }

    /**
     * Gets the value of the inspectionSite property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getInspectionSite() {
        return inspectionSite;
    }

    /**
     * Sets the value of the inspectionSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setInspectionSite(GenericPartyType value) {
        this.inspectionSite = value;
    }

    /**
     * Gets the value of the repairFacility property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getRepairFacility() {
        return repairFacility;
    }

    /**
     * Sets the value of the repairFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setRepairFacility(GenericPartyType value) {
        this.repairFacility = value;
    }

    /**
     * Gets the value of the vehicleLocationSite property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getVehicleLocationSite() {
        return vehicleLocationSite;
    }

    /**
     * Sets the value of the vehicleLocationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setVehicleLocationSite(GenericPartyType value) {
        this.vehicleLocationSite = value;
    }

    /**
     * Gets the value of the lossLocationSite property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getLossLocationSite() {
        return lossLocationSite;
    }

    /**
     * Sets the value of the lossLocationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setLossLocationSite(GenericPartyType value) {
        this.lossLocationSite = value;
    }

    /**
     * Gets the value of the initialPickUpLocationSite property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSiteType }
     *     
     */
    public LocationSiteType getInitialPickUpLocationSite() {
        return initialPickUpLocationSite;
    }

    /**
     * Sets the value of the initialPickUpLocationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSiteType }
     *     
     */
    public void setInitialPickUpLocationSite(LocationSiteType value) {
        this.initialPickUpLocationSite = value;
    }

    /**
     * Gets the value of the destinationLocationSite property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSiteType }
     *     
     */
    public LocationSiteType getDestinationLocationSite() {
        return destinationLocationSite;
    }

    /**
     * Sets the value of the destinationLocationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSiteType }
     *     
     */
    public void setDestinationLocationSite(LocationSiteType value) {
        this.destinationLocationSite = value;
    }

    /**
     * Gets the value of the consolidator property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getConsolidator() {
        return consolidator;
    }

    /**
     * Sets the value of the consolidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setConsolidator(GenericPartyType value) {
        this.consolidator = value;
    }

    /**
     * Gets the value of the adjuster property.
     * 
     * @return
     *     possible object is
     *     {@link AdjusterType }
     *     
     */
    public AdjusterType getAdjuster() {
        return adjuster;
    }

    /**
     * Sets the value of the adjuster property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjusterType }
     *     
     */
    public void setAdjuster(AdjusterType value) {
        this.adjuster = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericPartyType }
     * 
     * 
     */
    public List<GenericPartyType> getSupplier() {
        if (supplier == null) {
            supplier = new ArrayList<GenericPartyType>();
        }
        return this.supplier;
    }

    /**
     * Gets the value of the thirdPartyAdministrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyAdministrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyAdministrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyAdministratorType }
     * 
     * 
     */
    public List<ThirdPartyAdministratorType> getThirdPartyAdministrator() {
        if (thirdPartyAdministrator == null) {
            thirdPartyAdministrator = new ArrayList<ThirdPartyAdministratorType>();
        }
        return this.thirdPartyAdministrator;
    }

    /**
     * Gets the value of the renter property.
     * 
     * @return
     *     possible object is
     *     {@link RenterType }
     *     
     */
    public RenterType getRenter() {
        return renter;
    }

    /**
     * Sets the value of the renter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenterType }
     *     
     */
    public void setRenter(RenterType value) {
        this.renter = value;
    }

    /**
     * Gets the value of the alternateInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getAlternateInsurer() {
        return alternateInsurer;
    }

    /**
     * Sets the value of the alternateInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setAlternateInsurer(GenericPartyType value) {
        this.alternateInsurer = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setReceiver(GenericPartyType value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the forwarder property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getForwarder() {
        return forwarder;
    }

    /**
     * Sets the value of the forwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setForwarder(GenericPartyType value) {
        this.forwarder = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setSender(GenericPartyType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setSubmitter(GenericPartyType value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the rentalCarCompany property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getRentalCarCompany() {
        return rentalCarCompany;
    }

    /**
     * Sets the value of the rentalCarCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setRentalCarCompany(GenericPartyType value) {
        this.rentalCarCompany = value;
    }

    /**
     * Gets the value of the rentalOffice property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getRentalOffice() {
        return rentalOffice;
    }

    /**
     * Sets the value of the rentalOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setRentalOffice(GenericPartyType value) {
        this.rentalOffice = value;
    }

    /**
     * Gets the value of the governmentAgency property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSiteType }
     *     
     */
    public LocationSiteType getGovernmentAgency() {
        return governmentAgency;
    }

    /**
     * Sets the value of the governmentAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSiteType }
     *     
     */
    public void setGovernmentAgency(LocationSiteType value) {
        this.governmentAgency = value;
    }

    /**
     * Gets the value of the processDelay property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessDelayType }
     *     
     */
    public ProcessDelayType getProcessDelay() {
        return processDelay;
    }

    /**
     * Sets the value of the processDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessDelayType }
     *     
     */
    public void setProcessDelay(ProcessDelayType value) {
        this.processDelay = value;
    }

    /**
     * Gets the value of the cancellationParty property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPartyType }
     *     
     */
    public CancellationPartyType getCancellationParty() {
        return cancellationParty;
    }

    /**
     * Sets the value of the cancellationParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPartyType }
     *     
     */
    public void setCancellationParty(CancellationPartyType value) {
        this.cancellationParty = value;
    }

    /**
     * Gets the value of the fleetCompany property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getFleetCompany() {
        return fleetCompany;
    }

    /**
     * Sets the value of the fleetCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setFleetCompany(GenericPartyType value) {
        this.fleetCompany = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPartyType }
     *     
     */
    public GenericPartyType getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPartyType }
     *     
     */
    public void setDriver(GenericPartyType value) {
        this.driver = value;
    }

    /**
     * Gets the value of the otherParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartyType }
     * 
     * 
     */
    public List<OtherPartyType> getOtherParty() {
        if (otherParty == null) {
            otherParty = new ArrayList<OtherPartyType>();
        }
        return this.otherParty;
    }

    /**
     * Gets the value of the demandingParty property.
     * 
     * @return
     *     possible object is
     *     {@link DemandingPartyType }
     *     
     */
    public DemandingPartyType getDemandingParty() {
        return demandingParty;
    }

    /**
     * Sets the value of the demandingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandingPartyType }
     *     
     */
    public void setDemandingParty(DemandingPartyType value) {
        this.demandingParty = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsiblePartyType }
     * 
     * 
     */
    public List<ResponsiblePartyType> getResponsibleParty() {
        if (responsibleParty == null) {
            responsibleParty = new ArrayList<ResponsiblePartyType>();
        }
        return this.responsibleParty;
    }

    /**
     * Gets the value of the representativeParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representativeParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentativeParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepresentativePartyType }
     * 
     * 
     */
    public List<RepresentativePartyType> getRepresentativeParty() {
        if (representativeParty == null) {
            representativeParty = new ArrayList<RepresentativePartyType>();
        }
        return this.representativeParty;
    }

    /**
     * Gets the value of the accompanyingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accompanyingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccompanyingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccompanyingPartyType }
     * 
     * 
     */
    public List<AccompanyingPartyType> getAccompanyingParty() {
        if (accompanyingParty == null) {
            accompanyingParty = new ArrayList<AccompanyingPartyType>();
        }
        return this.accompanyingParty;
    }

}
