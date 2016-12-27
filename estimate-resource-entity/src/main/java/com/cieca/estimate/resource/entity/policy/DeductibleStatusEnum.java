package com.cieca.estimate.resource.entity.policy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeductibleStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeductibleStatusEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="DX"/>
 *     &lt;enumeration value="AV"/>
 *     &lt;enumeration value="B7"/>
 *     &lt;enumeration value="D2"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="ZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeductibleStatusEnum")
@XmlEnum
public enum DeductibleStatusEnum {

    FK("FK"),
    DX("DX"),
    AV("AV"),
    B7("B7"),
    D2("D2"),
    PH("PH"),
    SB("SB"),
    ZZ("ZZ");
	
    private final String value;

    DeductibleStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeductibleStatusEnum fromValue(String v) {
        for (DeductibleStatusEnum c: DeductibleStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
