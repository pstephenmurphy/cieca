package com.cieca.estimate.resource.entity.vehicle.vin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VINSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VINSourceEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Appraisal"/>
 *     &lt;enumeration value="Inspected"/>
 *     &lt;enumeration value="LossReport"/>
 *     &lt;enumeration value="Policy"/>
 *     &lt;enumeration value="Salvage"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VINSourceEnum")
@XmlEnum
public enum VINSourceEnum {

    @XmlEnumValue("Appraisal")
    APPRAISAL("Appraisal"),
    @XmlEnumValue("Inspected")
    INSPECTED("Inspected"),
    @XmlEnumValue("LossReport")
    LOSS_REPORT("LossReport"),
    @XmlEnumValue("Policy")
    POLICY("Policy"),
    @XmlEnumValue("Salvage")
    SALVAGE("Salvage"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VINSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VINSourceEnum fromValue(String v) {
        for (VINSourceEnum c: VINSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
