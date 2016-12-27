package com.cieca.estimate.resource.entity.vehicle.condition;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TowConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TowConditionEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Towable"/>
 *     &lt;enumeration value="Not Towable"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Drivable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TowConditionEnum")
@XmlEnum
public enum TowConditionEnum {

    @XmlEnumValue("Towable")
    TOWABLE("Towable"),
    @XmlEnumValue("Not Towable")
    NOT_TOWABLE("Not Towable"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Drivable")
    DRIVABLE("Drivable");
    private final String value;

    TowConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TowConditionEnum fromValue(String v) {
        for (TowConditionEnum c: TowConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
