package com.cieca.estimate.resource.entity.loss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FederalLitigationVenueCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FederalLitigationVenueCodeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="11"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FederalLitigationVenueCodeEnum")
@XmlEnum
public enum FederalLitigationVenueCodeEnum {

    @XmlEnumValue("1")
    VALUE_1("1"),
    @XmlEnumValue("2")
    VALUE_2("2"),
    @XmlEnumValue("3")
    VALUE_3("3"),
    @XmlEnumValue("4")
    VALUE_4("4"),
    @XmlEnumValue("5")
    VALUE_5("5"),
    @XmlEnumValue("6")
    VALUE_6("6"),
    @XmlEnumValue("7")
    VALUE_7("7"),
    @XmlEnumValue("8")
    VALUE_8("8"),
    @XmlEnumValue("9")
    VALUE_9("9"),
    @XmlEnumValue("10")
    VALUE_10("10"),
    @XmlEnumValue("11")
    VALUE_11("11");
    private final String value;

    FederalLitigationVenueCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FederalLitigationVenueCodeEnum fromValue(String v) {
        for (FederalLitigationVenueCodeEnum c: FederalLitigationVenueCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
