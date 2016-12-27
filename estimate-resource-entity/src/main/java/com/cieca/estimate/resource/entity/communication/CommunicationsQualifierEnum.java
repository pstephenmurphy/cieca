package com.cieca.estimate.resource.entity.communication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationsQualifierEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationsQualifierEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="EM"/>
 *     &lt;enumeration value="FX"/>
 *     &lt;enumeration value="HA"/>
 *     &lt;enumeration value="HF"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="UR"/>
 *     &lt;enumeration value="VM"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WC"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="WP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationsQualifierEnum")
@XmlEnum
public enum CommunicationsQualifierEnum {

    AL,
    BN,
    CP,
    EM,
    FX,
    HA,
    HF,
    HP,
    IM,
    MA,
    NP,
    PC,
    SA,
    TE,
    UR,
    VM,
    WA,
    WC,
    WF,
    WP;

    public String value() {
        return name();
    }

    public static CommunicationsQualifierEnum fromValue(String v) {
        return valueOf(v);
    }

}
