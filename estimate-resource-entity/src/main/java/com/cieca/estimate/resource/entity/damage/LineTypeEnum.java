package com.cieca.estimate.resource.entity.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Related"/>
 *     &lt;enumeration value="Unrelated"/>
 *     &lt;enumeration value="Current Claim"/>
 *     &lt;enumeration value="Prior Damage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineTypeEnum")
@XmlEnum
public enum LineTypeEnum {

    @XmlEnumValue("Related")
    RELATED("Related"),
    @XmlEnumValue("Unrelated")
    UNRELATED("Unrelated"),
    @XmlEnumValue("Current Claim")
    CURRENT_CLAIM("Current Claim"),
    @XmlEnumValue("Prior Damage")
    PRIOR_DAMAGE("Prior Damage");
    private final String value;

    LineTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineTypeEnum fromValue(String v) {
        for (LineTypeEnum c: LineTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
