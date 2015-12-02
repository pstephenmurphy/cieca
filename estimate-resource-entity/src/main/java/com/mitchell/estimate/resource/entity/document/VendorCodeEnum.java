package com.mitchell.estimate.resource.entity.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorCodeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VendorCodeEnum")
@XmlEnum
public enum VendorCodeEnum {

    A,
    C,
    E,
    D,
    M,
    O;

    public String value() {
        return name();
    }

    public static VendorCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
