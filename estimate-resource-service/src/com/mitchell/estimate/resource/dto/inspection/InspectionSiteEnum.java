//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.14 at 02:56:20 PM PST 
//


package com.mitchell.estimate.resource.dto.inspection;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InspectionSiteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InspectionSiteEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="CATD"/>
 *     &lt;enumeration value="CATF"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="DAP"/>
 *     &lt;enumeration value="DRP"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="FIS"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="OW"/>
 *     &lt;enumeration value="PRO"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="RSP"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="STF"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TPA"/>
 *     &lt;enumeration value="UNK"/>
 *     &lt;enumeration value="VIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InspectionSiteEnum")
@XmlEnum
public enum InspectionSiteEnum {

    CATD,
    CATF,
    D,
    DAP,
    DRP,
    F,
    FIS,
    I,
    ND,
    OTHR,
    OR,
    OW,
    PRO,
    RF,
    RSP,
    SC,
    STF,
    TC,
    TPA,
    UNK,
    VIC;

    public String value() {
        return name();
    }

    public static InspectionSiteEnum fromValue(String v) {
        return valueOf(v);
    }

}
