package com.cieca.estimate.resource.entity.vehicle;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitofMeasureOpenEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitofMeasureOpenEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="DH"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="EA"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="LL"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="P1"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="QT"/>
 *     &lt;enumeration value="WK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitofMeasureOpenEnum")
@XmlEnum
public enum UnitofMeasureOpenEnum {

    CM("CM"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    DA("DA"),
    DH("DH"),
    DK("DK"),
    EA("EA"),
    FO("FO"),
    FT("FT"),
    GA("GA"),
    HR("HR"),
    IN("IN"),
    LL("LL"),
    LT("LT"),
    ML("ML"),
    MO("MO"),
    P1("P1"),
    PT("PT"),
    QT("QT"),
    WK("WK");
    
    private final String value;

    UnitofMeasureOpenEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitofMeasureOpenEnum fromValue(String v) {
        for (UnitofMeasureOpenEnum c: UnitofMeasureOpenEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
