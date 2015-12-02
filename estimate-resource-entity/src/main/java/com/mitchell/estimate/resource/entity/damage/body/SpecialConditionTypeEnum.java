package com.mitchell.estimate.resource.entity.damage.body;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialConditionTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="ACS"/>
 *     &lt;enumeration value="MTA"/>
 *     &lt;enumeration value="SUV"/>
 *     &lt;enumeration value="VAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialConditionTypeEnum")
@XmlEnum
public enum SpecialConditionTypeEnum {

    ACS,
    MTA,
    SUV,
    VAN;

    public String value() {
        return name();
    }

    public static SpecialConditionTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
