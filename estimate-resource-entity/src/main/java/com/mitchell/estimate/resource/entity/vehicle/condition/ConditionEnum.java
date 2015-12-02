package com.mitchell.estimate.resource.entity.vehicle.condition;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GO"/>
 *     &lt;enumeration value="L8"/>
 *     &lt;enumeration value="L9"/>
 *     &lt;enumeration value="PR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionEnum")
@XmlEnum
public enum ConditionEnum {

    EX("EX"),
    FR("FR"),
    GO("GO"),
    @XmlEnumValue("L8")
    L8("L8"),
    @XmlEnumValue("L9")
    L9("L9"),
    PR("PR");
    
    private final String value;

    ConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionEnum fromValue(String v) {
        for (ConditionEnum c: ConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
