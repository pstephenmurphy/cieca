package com.cieca.estimate.resource.entity.currency;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="CDN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyEnum")
@XmlEnum
public enum CurrencyEnum {

    USD,
    CDN;

    public String value() {
        return name();
    }

    public static CurrencyEnum fromValue(String v) {
        return valueOf(v);
    }

}
