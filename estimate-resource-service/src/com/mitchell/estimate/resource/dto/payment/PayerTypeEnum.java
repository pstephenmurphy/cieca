//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.14 at 02:56:20 PM PST 
//


package com.mitchell.estimate.resource.dto.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayerTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="47"/>
 *     &lt;enumeration value="2B"/>
 *     &lt;enumeration value="IP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayerTypeEnum")
@XmlEnum
public enum PayerTypeEnum {

    @XmlEnumValue("47")
    VALUE_1("47"),
    @XmlEnumValue("2B")
    VALUE_2("2B"),
    @XmlEnumValue("IP")
    VALUE_3("IP");
    private final String value;

    PayerTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayerTypeEnum fromValue(String v) {
        for (PayerTypeEnum c: PayerTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
