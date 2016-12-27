package com.cieca.estimate.resource.entity.payment;

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
    ESTIMATOR("47"),
    @XmlEnumValue("2B")
    THIRD_PARTY_ADMINISTRATOR("2B"),
    @XmlEnumValue("IP")
    INDEPENDENT_APPRAISER("IP");
    
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
