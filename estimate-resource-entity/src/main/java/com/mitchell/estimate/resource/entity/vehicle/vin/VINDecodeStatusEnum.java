package com.mitchell.estimate.resource.entity.vehicle.vin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VINDecodeStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VINDecodeStatusEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Check Digit Error"/>
 *     &lt;enumeration value="Decode Errors"/>
 *     &lt;enumeration value="Does Not Decode"/>
 *     &lt;enumeration value="Gray Market"/>
 *     &lt;enumeration value="Incorrect Length"/>
 *     &lt;enumeration value="Not Evaluated"/>
 *     &lt;enumeration value="Partial Decode"/>
 *     &lt;enumeration value="Wrong Vehicle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VINDecodeStatusEnum")
@XmlEnum
public enum VINDecodeStatusEnum {

    @XmlEnumValue("Check Digit Error")
    CHECK_DIGIT_ERROR("Check Digit Error"),
    @XmlEnumValue("Decode Errors")
    DECODE_ERRORS("Decode Errors"),
    @XmlEnumValue("Does Not Decode")
    DOES_NOT_DECODE("Does Not Decode"),
    @XmlEnumValue("Gray Market")
    GRAY_MARKET("Gray Market"),
    @XmlEnumValue("Incorrect Length")
    INCORRECT_LENGTH("Incorrect Length"),
    @XmlEnumValue("Not Evaluated")
    NOT_EVALUATED("Not Evaluated"),
    @XmlEnumValue("Partial Decode")
    PARTIAL_DECODE("Partial Decode"),
    @XmlEnumValue("Wrong Vehicle")
    WRONG_VEHICLE("Wrong Vehicle");
    private final String value;

    VINDecodeStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VINDecodeStatusEnum fromValue(String v) {
        for (VINDecodeStatusEnum c: VINDecodeStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
