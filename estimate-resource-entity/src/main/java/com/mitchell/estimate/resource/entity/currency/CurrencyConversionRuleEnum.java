package com.mitchell.estimate.resource.entity.currency;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversionRuleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyConversionRuleEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Indirect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyConversionRuleEnum")
@XmlEnum
public enum CurrencyConversionRuleEnum {

    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Indirect")
    INDIRECT("Indirect");
    private final String value;

    CurrencyConversionRuleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyConversionRuleEnum fromValue(String v) {
        for (CurrencyConversionRuleEnum c: CurrencyConversionRuleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
