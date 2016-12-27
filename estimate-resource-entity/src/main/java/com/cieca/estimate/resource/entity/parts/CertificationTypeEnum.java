package com.cieca.estimate.resource.entity.parts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificationTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CertificationTypeEnum")
@XmlEnum
public enum CertificationTypeEnum {

    C,
    M;

    public String value() {
        return name();
    }

    public static CertificationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
