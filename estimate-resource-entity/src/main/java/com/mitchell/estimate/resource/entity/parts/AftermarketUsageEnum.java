package com.mitchell.estimate.resource.entity.parts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AftermarketUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AftermarketUsageEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="OV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AftermarketUsageEnum")
@XmlEnum
public enum AftermarketUsageEnum {

    NU,
    OV;

    public String value() {
        return name();
    }

    public static AftermarketUsageEnum fromValue(String v) {
        return valueOf(v);
    }

}
