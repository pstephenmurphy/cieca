package com.cieca.estimate.resource.entity.damage.body;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DentsSizeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DentsSizeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DentsSizeEnum")
@XmlEnum
public enum DentsSizeEnum {

    @XmlEnumValue("1")
    VALUE_1("1"),
    @XmlEnumValue("2")
    VALUE_2("2"),
    @XmlEnumValue("3")
    VALUE_3("3"),
    @XmlEnumValue("4")
    VALUE_4("4"),
    @XmlEnumValue("5")
    VALUE_5("5");
    private final String value;

    DentsSizeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DentsSizeEnum fromValue(String v) {
        for (DentsSizeEnum c: DentsSizeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
