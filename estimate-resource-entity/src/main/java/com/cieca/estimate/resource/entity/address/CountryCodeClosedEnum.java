package com.cieca.estimate.resource.entity.address;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeClosedEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCodeClosedEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="PR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryCodeClosedEnum")
@XmlEnum
public enum CountryCodeClosedEnum {

    CA,
    MX,
    US,
    PR;

    public String value() {
        return name();
    }

    public static CountryCodeClosedEnum fromValue(String v) {
        return valueOf(v);
    }

}
