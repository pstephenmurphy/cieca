package com.cieca.estimate.resource.entity.vehicle.vin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VINAvailabilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VINAvailabilityEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Unreadable"/>
 *     &lt;enumeration value="Inaccessible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VINAvailabilityEnum")
@XmlEnum
public enum VINAvailabilityEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Unreadable")
    UNREADABLE("Unreadable"),
    @XmlEnumValue("Inaccessible")
    INACCESSIBLE("Inaccessible");
    private final String value;

    VINAvailabilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VINAvailabilityEnum fromValue(String v) {
        for (VINAvailabilityEnum c: VINAvailabilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
