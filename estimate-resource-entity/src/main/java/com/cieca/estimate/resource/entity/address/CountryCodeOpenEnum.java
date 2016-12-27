package com.cieca.estimate.resource.entity.address;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeOpenEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCodeOpenEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="PR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryCodeOpenEnum")
@XmlEnum
public enum CountryCodeOpenEnum {

    CA,
    MX,
    US,
    PR;

    public String value() {
        return name();
    }

    public static CountryCodeOpenEnum fromValue(String v) {
        return valueOf(v);
    }

}
