package com.cieca.estimate.resource.entity.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DamageSeverityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DamageSeverityEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Minor"/>
 *     &lt;enumeration value="Moderate"/>
 *     &lt;enumeration value="Severe"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DamageSeverityEnum")
@XmlEnum
public enum DamageSeverityEnum {

    @XmlEnumValue("Minor")
    MINOR("Minor"),
    @XmlEnumValue("Moderate")
    MODERATE("Moderate"),
    @XmlEnumValue("Severe")
    SEVERE("Severe"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DamageSeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DamageSeverityEnum fromValue(String v) {
        for (DamageSeverityEnum c: DamageSeverityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
