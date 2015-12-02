package com.mitchell.estimate.resource.entity.adjustment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedAdjustmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppliedAdjustmentEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AIG"/>
 *     &lt;enumeration value="AIGD"/>
 *     &lt;enumeration value="AIGM"/>
 *     &lt;enumeration value="AILD"/>
 *     &lt;enumeration value="AILM"/>
 *     &lt;enumeration value="AINA"/>
 *     &lt;enumeration value="AIP"/>
 *     &lt;enumeration value="AIPD"/>
 *     &lt;enumeration value="AIPM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppliedAdjustmentEnum")
@XmlEnum
public enum AppliedAdjustmentEnum {

    AIG,
    AIGD,
    AIGM,
    AILD,
    AILM,
    AINA,
    AIP,
    AIPD,
    AIPM;

    public String value() {
        return name();
    }

    public static AppliedAdjustmentEnum fromValue(String v) {
        return valueOf(v);
    }

}
