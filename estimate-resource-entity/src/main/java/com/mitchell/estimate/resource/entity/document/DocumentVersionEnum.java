package com.mitchell.estimate.resource.entity.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentVersionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentVersionEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="EM"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="UD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentVersionEnum")
@XmlEnum
public enum DocumentVersionEnum {

    CO,
    DM,
    EM,
    ME,
    SV,
    UP,
    VN,
    RD,
    UD;

    public String value() {
        return name();
    }

    public static DocumentVersionEnum fromValue(String v) {
        return valueOf(v);
    }

}
