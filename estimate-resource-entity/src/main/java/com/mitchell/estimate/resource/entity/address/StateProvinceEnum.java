package com.mitchell.estimate.resource.entity.address;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateProvinceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StateProvinceEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="FL"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="HI"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IA"/>
 *     &lt;enumeration value="KS"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="NJ"/>
 *     &lt;enumeration value="NM"/>
 *     &lt;enumeration value="NY"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="ND"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="OH"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="VT"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="WV"/>
 *     &lt;enumeration value="WI"/>
 *     &lt;enumeration value="WY"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="MB"/>
 *     &lt;enumeration value="NB"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="QC"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="YT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StateProvinceEnum")
@XmlEnum
public enum StateProvinceEnum {

    AL,
    AK,
    AS,
    AZ,
    AR,
    CA,
    CO,
    CT,
    DE,
    DC,
    FM,
    FL,
    GA,
    GU,
    HI,
    ID,
    IL,
    IN,
    IA,
    KS,
    KY,
    LA,
    ME,
    MH,
    MD,
    MA,
    MI,
    MN,
    MS,
    MO,
    MT,
    NE,
    NV,
    NH,
    NJ,
    NM,
    NY,
    NC,
    ND,
    MP,
    OH,
    OK,
    OR,
    PW,
    PA,
    PR,
    RI,
    SC,
    SD,
    TN,
    TX,
    UT,
    VT,
    VI,
    VA,
    WA,
    WV,
    WI,
    WY,
    AA,
    AE,
    AP,
    AB,
    BC,
    MB,
    NB,
    NL,
    NS,
    NT,
    NU,
    ON,
    PE,
    QC,
    SK,
    YT;

    public String value() {
        return name();
    }

    public static StateProvinceEnum fromValue(String v) {
        return valueOf(v);
    }

}
