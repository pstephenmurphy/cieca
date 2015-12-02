package com.mitchell.estimate.resource.entity.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="C1"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyTypeEnum")
@XmlEnum
public enum PolicyTypeEnum {

    C1("C1"),
    OT("OT"),
    PE("PE"),
    PL("PL");
	
    private final String value;

    PolicyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyTypeEnum fromValue(String v) {
        for (PolicyTypeEnum c: PolicyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
