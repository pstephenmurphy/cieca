//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.14 at 02:56:20 PM PST 
//


package com.mitchell.estimate.resource.dto.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeductibleStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeductibleStatusEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="AV"/>
 *     &lt;enumeration value="B7"/>
 *     &lt;enumeration value="D2"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="ZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeductibleStatusEnum")
@XmlEnum
public enum DeductibleStatusEnum {

    FK("FK"),
    DX("DX"),
    AV("AV"),
    @XmlEnumValue("B7")
    B_7("B7"),
    @XmlEnumValue("D2")
    D_2("D2"),
    PH("PH"),
    SB("SB"),
    ZZ("ZZ");
    private final String value;

    DeductibleStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeductibleStatusEnum fromValue(String v) {
        for (DeductibleStatusEnum c: DeductibleStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
