package com.mitchell.estimate.resource.entity.payment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="QF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeEnum")
@XmlEnum
public enum PaymentTypeEnum {

    CC,
    CK,
    CS,
    DC,
    OT,
    QF;

    public String value() {
        return name();
    }

    public static PaymentTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
