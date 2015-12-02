package com.mitchell.estimate.resource.entity.event;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferralSourceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferralSourceTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="Newspaper"/>
 *     &lt;enumeration value="Personal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferralSourceTypeEnum")
@XmlEnum
public enum ReferralSourceTypeEnum {

    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("Newspaper")
    NEWSPAPER("Newspaper"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal");
    private final String value;

    ReferralSourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferralSourceTypeEnum fromValue(String v) {
        for (ReferralSourceTypeEnum c: ReferralSourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
