package com.mitchell.estimate.resource.entity.loss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseofLossEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CauseofLossEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="ANI"/>
 *     &lt;enumeration value="CLS"/>
 *     &lt;enumeration value="CTM"/>
 *     &lt;enumeration value="EQK"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="FLO"/>
 *     &lt;enumeration value="FIR"/>
 *     &lt;enumeration value="FLD"/>
 *     &lt;enumeration value="GLS"/>
 *     &lt;enumeration value="HAL"/>
 *     &lt;enumeration value="HUR"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="MEC"/>
 *     &lt;enumeration value="MUD"/>
 *     &lt;enumeration value="ZZZ"/>
 *     &lt;enumeration value="NUC"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PTH"/>
 *     &lt;enumeration value="RRP"/>
 *     &lt;enumeration value="SMK"/>
 *     &lt;enumeration value="THF"/>
 *     &lt;enumeration value="TOR"/>
 *     &lt;enumeration value="VMM"/>
 *     &lt;enumeration value="VOL"/>
 *     &lt;enumeration value="WAR"/>
 *     &lt;enumeration value="WND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CauseofLossEnum")
@XmlEnum
public enum CauseofLossEnum {

    ANI,
    CLS,
    CTM,
    EQK,
    EXP,
    FLO,
    FIR,
    FLD,
    GLS,
    HAL,
    HUR,
    LSL,
    MEC,
    MUD,
    ZZZ,
    NUC,
    OTH,
    PTH,
    RRP,
    SMK,
    THF,
    TOR,
    VMM,
    VOL,
    WAR,
    WND;

    public String value() {
        return name();
    }

    public static CauseofLossEnum fromValue(String v) {
        return valueOf(v);
    }

}
