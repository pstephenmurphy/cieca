package com.mitchell.estimate.resource.entity.damage;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.mitchell.estimate.resource.entity.adjustment.AppliedAdjustmentEnum;
import com.mitchell.estimate.resource.entity.damage.body.PDRInfoType;
import com.mitchell.estimate.resource.entity.document.DocumentVersionEnum;
import com.mitchell.estimate.resource.entity.parts.PartInfoType;


/**
 * <p>Java class for DamageLineInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DamageLineInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNum" type="{http://www.cieca.com/BMS}LineNumType"/>
 *         &lt;element name="UniqueSequenceNum" type="{http://www.cieca.com/BMS}LineNumType" minOccurs="0"/>
 *         &lt;element name="ParentLineNum" type="{http://www.cieca.com/BMS}LineNumType" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="SupplementNum" type="{http://www.cieca.com/BMS}DocumentVerNumType"/>
 *           &lt;element name="EstimateVerCode" type="{http://www.cieca.com/BMS}DocumentVersionEnum"/>
 *         &lt;/sequence>
 *         &lt;element name="ManualLineInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="AutomatedEntry" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LineStatusCode" type="{http://www.cieca.com/BMS}LineStatusEnum" minOccurs="0"/>
 *         &lt;element name="DamageLineHistoryInfo" type="{http://www.cieca.com/BMS}DamageLineInfoType" minOccurs="0"/>
 *         &lt;element name="MessageCode" type="{http://www.cieca.com/BMS}MessageCodeType" minOccurs="0"/>
 *         &lt;element name="VendorRefNum" type="{http://www.cieca.com/BMS}VendorRefNumType" minOccurs="0"/>
 *         &lt;element name="LineDesc" type="{http://www.cieca.com/BMS}LineDescType" minOccurs="0"/>
 *         &lt;element name="DescJudgmentInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *         &lt;element name="LineItemCategoryCode" type="{http://www.cieca.com/BMS}LineItemCategoryEnum" minOccurs="0"/>
 *         &lt;element name="LineDescCode" type="{http://www.cieca.com/BMS}LineDescCodeType" minOccurs="0"/>
 *         &lt;element name="SubletInfoType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PartSubletInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                   &lt;element name="LaborSubletInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                   &lt;element name="OtherChargesSubletInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PartInfo" type="{http://www.cieca.com/BMS}PartInfoType" minOccurs="0"/>
 *         &lt;element name="LaborInfo" type="{http://www.cieca.com/BMS}LaborInfoType" minOccurs="0"/>
 *         &lt;element name="RefinishLaborInfo" type="{http://www.cieca.com/BMS}LaborInfoType" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{http://www.cieca.com/BMS}MaterialTypeEnum" minOccurs="0"/>
 *         &lt;element name="OtherChargesInfo" type="{http://www.cieca.com/BMS}OtherChargesInfoType" minOccurs="0"/>
 *         &lt;element name="AppliedAdjustment" type="{http://www.cieca.com/BMS}AppliedAdjustmentEnum" minOccurs="0"/>
 *         &lt;element name="LineAdjustmentType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdjustmentType" type="{http://www.cieca.com/BMS}AdjustmentTypeEnum" minOccurs="0"/>
 *                   &lt;element name="AdjustmentPct" type="{http://www.cieca.com/BMS}PctType" minOccurs="0"/>
 *                   &lt;element name="AdjustmentAmt" type="{http://www.cieca.com/BMS}Currency" minOccurs="0"/>
 *                   &lt;element name="TaxableInd" type="{http://www.cieca.com/BMS}Boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WhoPays" type="{http://www.cieca.com/BMS}WhoPaysEnum" minOccurs="0"/>
 *         &lt;element name="LineMemo" type="{http://www.cieca.com/BMS}C" minOccurs="0"/>
 *         &lt;element name="PDRInfo" type="{http://www.cieca.com/BMS}PDRInfoType" minOccurs="0"/>
 *         &lt;element name="LineType" type="{http://www.cieca.com/BMS}LineTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DamageLineInfoType", propOrder = {
    "lineNum",
    "uniqueSequenceNum",
    "parentLineNum",
    "supplementNum",
    "estimateVerCode",
    "manualLineInd",
    "automatedEntry",
    "lineStatusCode",
    "damageLineHistoryInfo",
    "messageCode",
    "vendorRefNum",
    "lineDesc",
    "descJudgmentInd",
    "lineItemCategoryCode",
    "lineDescCode",
    "subletInfo",
    "partInfo",
    "laborInfo",
    "refinishLaborInfo",
    "materialType",
    "otherChargesInfo",
    "appliedAdjustment",
    "lineAdjustment",
    "whoPays",
    "lineMemo",
    "pdrInfo",
    "lineType"
})
public class DamageLineInfoType
    implements Serializable
{

    private final static long serialVersionUID = 20120208L;
    
    @XmlElement(name = "LineNum")
    protected int lineNum;
    
    @XmlElement(name = "UniqueSequenceNum")
    protected Integer uniqueSequenceNum;
    
    @XmlElement(name = "ParentLineNum")
    protected Integer parentLineNum;
    
    @XmlElement(name = "SupplementNum")
    protected Integer supplementNum;
    
    @XmlElement(name = "EstimateVerCode")
    protected DocumentVersionEnum estimateVerCode;
    
    @XmlElement(name = "ManualLineInd")
    protected Boolean manualLineInd;
    
    @XmlElement(name = "AutomatedEntry")
    protected Boolean automatedEntry;
    
    @XmlElement(name = "LineStatusCode")
    protected LineStatusEnum lineStatusCode;
    
    @XmlElement(name = "DamageLineHistoryInfo")
    protected DamageLineInfoType damageLineHistoryInfo;
    
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    
    @XmlElement(name = "VendorRefNum")
    protected String vendorRefNum;
    
    @XmlElement(name = "LineDesc")
    protected String lineDesc;
    
    @XmlElement(name = "DescJudgmentInd")
    protected Boolean descJudgmentInd;
    
    @XmlElement(name = "LineItemCategoryCode")
    protected String lineItemCategoryCode;
    
    @XmlElement(name = "LineDescCode")
    protected String lineDescCode;
    
    @XmlElement(name = "SubletInfoType")
    protected SubletInfoType subletInfo;
    
    @XmlElement(name = "PartInfo")
    protected PartInfoType partInfo;
    
    @XmlElement(name = "LaborInfo")
    protected LaborInfoType laborInfo;
    
    @XmlElement(name = "RefinishLaborInfo")
    protected LaborInfoType refinishLaborInfo;
    
    @XmlElement(name = "MaterialType")
    protected MaterialTypeEnum materialType;
    
    @XmlElement(name = "OtherChargesInfo")
    protected OtherChargesInfoType otherChargesInfo;
    
    @XmlElement(name = "AppliedAdjustment")
    protected AppliedAdjustmentEnum appliedAdjustment;
    
    @XmlElement(name = "LineAdjustmentType")
    protected LineAdjustmentType lineAdjustment;
    
    @XmlElement(name = "WhoPays")
    protected WhoPaysEnum whoPays;
    
    @XmlElement(name = "LineMemo")
    protected String lineMemo;
    
    @XmlElement(name = "PDRInfo")
    protected PDRInfoType pdrInfo;
    
    @XmlElement(name = "LineType")
    protected LineTypeEnum lineType;

    /**
     * Gets the value of the lineNum property.
     * 
     */
    public int getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     */
    public void setLineNum(int value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the uniqueSequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueSequenceNum() {
        return uniqueSequenceNum;
    }

    /**
     * Sets the value of the uniqueSequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueSequenceNum(Integer value) {
        this.uniqueSequenceNum = value;
    }

    /**
     * Gets the value of the parentLineNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentLineNum() {
        return parentLineNum;
    }

    /**
     * Sets the value of the parentLineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentLineNum(Integer value) {
        this.parentLineNum = value;
    }

    /**
     * Gets the value of the supplementNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplementNum() {
        return supplementNum;
    }

    /**
     * Sets the value of the supplementNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplementNum(Integer value) {
        this.supplementNum = value;
    }

    /**
     * Gets the value of the estimateVerCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersionEnum }
     *     
     */
    public DocumentVersionEnum getEstimateVerCode() {
        return estimateVerCode;
    }

    /**
     * Sets the value of the estimateVerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersionEnum }
     *     
     */
    public void setEstimateVerCode(DocumentVersionEnum value) {
        this.estimateVerCode = value;
    }

    /**
     * Gets the value of the manualLineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getManualLineInd() {
        return manualLineInd;
    }

    /**
     * Sets the value of the manualLineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualLineInd(Boolean value) {
        this.manualLineInd = value;
    }

    /**
     * Gets the value of the automatedEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutomatedEntry() {
        return automatedEntry;
    }

    /**
     * Sets the value of the automatedEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatedEntry(Boolean value) {
        this.automatedEntry = value;
    }

    /**
     * Gets the value of the lineStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusEnum }
     *     
     */
    public LineStatusEnum getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Sets the value of the lineStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusEnum }
     *     
     */
    public void setLineStatusCode(LineStatusEnum value) {
        this.lineStatusCode = value;
    }

    /**
     * Gets the value of the damageLineHistoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DamageLineInfoType }
     *     
     */
    public DamageLineInfoType getDamageLineHistoryInfo() {
        return damageLineHistoryInfo;
    }

    /**
     * Sets the value of the damageLineHistoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageLineInfoType }
     *     
     */
    public void setDamageLineHistoryInfo(DamageLineInfoType value) {
        this.damageLineHistoryInfo = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the vendorRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorRefNum() {
        return vendorRefNum;
    }

    /**
     * Sets the value of the vendorRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorRefNum(String value) {
        this.vendorRefNum = value;
    }

    /**
     * Gets the value of the lineDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDesc() {
        return lineDesc;
    }

    /**
     * Sets the value of the lineDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDesc(String value) {
        this.lineDesc = value;
    }

    /**
     * Gets the value of the descJudgmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDescJudgmentInd() {
        return descJudgmentInd;
    }

    /**
     * Sets the value of the descJudgmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescJudgmentInd(Boolean value) {
        this.descJudgmentInd = value;
    }

    /**
     * Gets the value of the lineItemCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemCategoryCode() {
        return lineItemCategoryCode;
    }

    /**
     * Sets the value of the lineItemCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemCategoryCode(String value) {
        this.lineItemCategoryCode = value;
    }

    /**
     * Gets the value of the lineDescCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDescCode() {
        return lineDescCode;
    }

    /**
     * Sets the value of the lineDescCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDescCode(String value) {
        this.lineDescCode = value;
    }

    /**
     * Gets the value of the subletInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DamageLineInfoType.SubletInfoType }
     *     
     */
    public SubletInfoType getSubletInfo() {
        return subletInfo;
    }

    /**
     * Sets the value of the subletInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageLineInfoType.SubletInfoType }
     *     
     */
    public void setSubletInfo(SubletInfoType value) {
        this.subletInfo = value;
    }

    /**
     * Gets the value of the partInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartInfoType }
     *     
     */
    public PartInfoType getPartInfo() {
        return partInfo;
    }

    /**
     * Sets the value of the partInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartInfoType }
     *     
     */
    public void setPartInfo(PartInfoType value) {
        this.partInfo = value;
    }

    /**
     * Gets the value of the laborInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LaborInfoType }
     *     
     */
    public LaborInfoType getLaborInfo() {
        return laborInfo;
    }

    /**
     * Sets the value of the laborInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborInfoType }
     *     
     */
    public void setLaborInfo(LaborInfoType value) {
        this.laborInfo = value;
    }

    /**
     * Gets the value of the refinishLaborInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LaborInfoType }
     *     
     */
    public LaborInfoType getRefinishLaborInfo() {
        return refinishLaborInfo;
    }

    /**
     * Sets the value of the refinishLaborInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborInfoType }
     *     
     */
    public void setRefinishLaborInfo(LaborInfoType value) {
        this.refinishLaborInfo = value;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialTypeEnum }
     *     
     */
    public MaterialTypeEnum getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialTypeEnum }
     *     
     */
    public void setMaterialType(MaterialTypeEnum value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the otherChargesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherChargesInfoType }
     *     
     */
    public OtherChargesInfoType getOtherChargesInfo() {
        return otherChargesInfo;
    }

    /**
     * Sets the value of the otherChargesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherChargesInfoType }
     *     
     */
    public void setOtherChargesInfo(OtherChargesInfoType value) {
        this.otherChargesInfo = value;
    }

    /**
     * Gets the value of the appliedAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedAdjustmentEnum }
     *     
     */
    public AppliedAdjustmentEnum getAppliedAdjustment() {
        return appliedAdjustment;
    }

    /**
     * Sets the value of the appliedAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedAdjustmentEnum }
     *     
     */
    public void setAppliedAdjustment(AppliedAdjustmentEnum value) {
        this.appliedAdjustment = value;
    }

    /**
     * Gets the value of the lineAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link DamageLineInfoType.LineAdjustmentType }
     *     
     */
    public LineAdjustmentType getLineAdjustment() {
        return lineAdjustment;
    }

    /**
     * Sets the value of the lineAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamageLineInfoType.LineAdjustmentType }
     *     
     */
    public void setLineAdjustment(LineAdjustmentType value) {
        this.lineAdjustment = value;
    }

    /**
     * Gets the value of the whoPays property.
     * 
     * @return
     *     possible object is
     *     {@link WhoPaysEnum }
     *     
     */
    public WhoPaysEnum getWhoPays() {
        return whoPays;
    }

    /**
     * Sets the value of the whoPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhoPaysEnum }
     *     
     */
    public void setWhoPays(WhoPaysEnum value) {
        this.whoPays = value;
    }

    /**
     * Gets the value of the lineMemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineMemo() {
        return lineMemo;
    }

    /**
     * Sets the value of the lineMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineMemo(String value) {
        this.lineMemo = value;
    }

    /**
     * Gets the value of the pdrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PDRInfoType }
     *     
     */
    public PDRInfoType getPDRInfo() {
        return pdrInfo;
    }

    /**
     * Sets the value of the pdrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDRInfoType }
     *     
     */
    public void setPDRInfo(PDRInfoType value) {
        this.pdrInfo = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeEnum }
     *     
     */
    public LineTypeEnum getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeEnum }
     *     
     */
    public void setLineType(LineTypeEnum value) {
        this.lineType = value;
    }
}
