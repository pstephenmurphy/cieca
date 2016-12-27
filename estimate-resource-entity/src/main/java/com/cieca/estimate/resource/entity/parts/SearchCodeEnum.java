package com.cieca.estimate.resource.entity.parts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchCodeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AH"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="OV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchCodeEnum")
@XmlEnum
public enum SearchCodeEnum {

    AF,
    AH,
    DC,
    ML,
    NA,
    OV;

    public String value() {
        return name();
    }

    public static SearchCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}

