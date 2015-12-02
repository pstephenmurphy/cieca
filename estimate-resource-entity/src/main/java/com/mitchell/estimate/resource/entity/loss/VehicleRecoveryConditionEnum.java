package com.mitchell.estimate.resource.entity.loss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleRecoveryConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleRecoveryConditionEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleRecoveryConditionEnum")
@XmlEnum
public enum VehicleRecoveryConditionEnum {

    @XmlEnumValue("0")
    VALUE_1("0"),
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
    @XmlEnumValue("9")
    VALUE_8("9"),
    @XmlEnumValue("A")
    VALUE_9("A"),
    @XmlEnumValue("B")
    VALUE_10("B"),
    @XmlEnumValue("C")
    VALUE_11("C"),
    @XmlEnumValue("D")
    VALUE_12("D"),
    @XmlEnumValue("E")
    VALUE_13("E"),
    @XmlEnumValue("F")
    VALUE_14("F"),
    @XmlEnumValue("Z")
    VALUE_15("Z");
    private final String value;

    VehicleRecoveryConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleRecoveryConditionEnum fromValue(String v) {
        for (VehicleRecoveryConditionEnum c: VehicleRecoveryConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
