package com.cieca.estimate.resource.entity.communication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstantMessagingTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstantMessagingTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="AOL"/>
 *     &lt;enumeration value="ICQ"/>
 *     &lt;enumeration value="MSN"/>
 *     &lt;enumeration value="RFC2821"/>
 *     &lt;enumeration value="Yahoo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstantMessagingTypeEnum")
@XmlEnum
public enum InstantMessagingTypeEnum {

    AOL("AOL"),
    ICQ("ICQ"),
    MSN("MSN"),
    @XmlEnumValue("RFC2821")
    RFC_2821("RFC2821"),
    @XmlEnumValue("Yahoo")
    YAHOO("Yahoo");
    private final String value;

    InstantMessagingTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstantMessagingTypeEnum fromValue(String v) {
        for (InstantMessagingTypeEnum c: InstantMessagingTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
