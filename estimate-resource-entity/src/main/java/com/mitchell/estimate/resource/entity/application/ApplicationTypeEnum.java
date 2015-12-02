package com.mitchell.estimate.resource.entity.application;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="BSMS"/>
 *     &lt;enumeration value="Communication"/>
 *     &lt;enumeration value="Conversion"/>
 *     &lt;enumeration value="Estimating"/>
 *     &lt;enumeration value="Program"/>
 *     &lt;enumeration value="Salvage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationTypeEnum")
@XmlEnum
public enum ApplicationTypeEnum {

    BSMS("BSMS"),
    @XmlEnumValue("Communication")
    COMMUNICATION("Communication"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("Estimating")
    ESTIMATING("Estimating"),
    @XmlEnumValue("Program")
    PROGRAM("Program"),
    @XmlEnumValue("Salvage")
    SALVAGE("Salvage");
    private final String value;

    ApplicationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationTypeEnum fromValue(String v) {
        for (ApplicationTypeEnum c: ApplicationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
