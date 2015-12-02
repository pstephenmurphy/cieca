package com.mitchell.estimate.resource.entity.vehicle.vin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VINFormatEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VINFormatEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="ISO17"/>
 *     &lt;enumeration value="Manufacturer PIN"/>
 *     &lt;enumeration value="Pre ISO"/>
 *     &lt;enumeration value="State Assigned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VINFormatEnum")
@XmlEnum
public enum VINFormatEnum {

    @XmlEnumValue("ISO17")
    ISO_17("ISO17"),
    @XmlEnumValue("Manufacturer PIN")
    MANUFACTURER_PIN("Manufacturer PIN"),
    @XmlEnumValue("Pre ISO")
    PRE_ISO("Pre ISO"),
    @XmlEnumValue("State Assigned")
    STATE_ASSIGNED("State Assigned");
    private final String value;

    VINFormatEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VINFormatEnum fromValue(String v) {
        for (VINFormatEnum c: VINFormatEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
