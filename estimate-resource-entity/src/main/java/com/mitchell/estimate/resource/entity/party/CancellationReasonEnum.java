package com.mitchell.estimate.resource.entity.party;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationReasonEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="Duplicate"/>
 *     &lt;enumeration value="Government Action"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Owner Retained"/>
 *     &lt;enumeration value="Repaired"/>
 *     &lt;enumeration value="Provider Request"/>
 *     &lt;enumeration value="Transferred"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancellationReasonEnum")
@XmlEnum
public enum CancellationReasonEnum {

    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),
    @XmlEnumValue("Government Action")
    GOVERNMENT_ACTION("Government Action"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Owner Retained")
    OWNER_RETAINED("Owner Retained"),
    @XmlEnumValue("Repaired")
    REPAIRED("Repaired"),
    @XmlEnumValue("Provider Request")
    PROVIDER_REQUEST("Provider Request"),
    @XmlEnumValue("Transferred")
    TRANSFERRED("Transferred"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CancellationReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancellationReasonEnum fromValue(String v) {
        for (CancellationReasonEnum c: CancellationReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
