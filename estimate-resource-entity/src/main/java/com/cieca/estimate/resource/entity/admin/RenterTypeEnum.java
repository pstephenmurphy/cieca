package com.cieca.estimate.resource.entity.admin;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenterTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenterTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="CC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenterTypeEnum")
@XmlEnum
public enum RenterTypeEnum {

    IL,
    CC;

    public String value() {
        return name();
    }

    public static RenterTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
