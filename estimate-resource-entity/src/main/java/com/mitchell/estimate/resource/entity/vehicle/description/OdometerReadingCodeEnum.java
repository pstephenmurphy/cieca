package com.mitchell.estimate.resource.entity.vehicle.description;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OdometerReadingCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OdometerReadingCodeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Exceeds Mechanical Limits"/>
 *     &lt;enumeration value="Not Actual"/>
 *     &lt;enumeration value="Inaccessible"/>
 *     &lt;enumeration value="Exempt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OdometerReadingCodeEnum")
@XmlEnum
public enum OdometerReadingCodeEnum {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Exceeds Mechanical Limits")
    EXCEEDS_MECHANICAL_LIMITS("Exceeds Mechanical Limits"),
    @XmlEnumValue("Not Actual")
    NOT_ACTUAL("Not Actual"),
    @XmlEnumValue("Inaccessible")
    INACCESSIBLE("Inaccessible"),
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt");
    
    private final String value;

    OdometerReadingCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OdometerReadingCodeEnum fromValue(String v) {
        for (OdometerReadingCodeEnum c: OdometerReadingCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
