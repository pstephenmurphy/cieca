package com.cieca.estimate.resource.entity.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatusEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatusEnum")
@XmlEnum
public enum DocumentStatusEnum {

    C,
    I;

    public String value() {
        return name();
    }

    public static DocumentStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
