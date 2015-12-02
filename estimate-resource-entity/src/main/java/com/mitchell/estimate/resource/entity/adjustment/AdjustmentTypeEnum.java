package com.mitchell.estimate.resource.entity.adjustment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjustmentTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Adjustment"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="Labor"/>
 *     &lt;enumeration value="Markup"/>
 *     &lt;enumeration value="Betterment"/>
 *     &lt;enumeration value="Betterment Labor"/>
 *     &lt;enumeration value="Betterment Labor Paint"/>
 *     &lt;enumeration value="Betterment Parts"/>
 *     &lt;enumeration value="Betterment Parts Labor"/>
 *     &lt;enumeration value="Betterment Parts Labor Paint"/>
 *     &lt;enumeration value="Betterment Paint and Materials"/>
 *     &lt;enumeration value="Betterment Parts Paint"/>
 *     &lt;enumeration value="Betterment Total Paint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdjustmentTypeEnum")
@XmlEnum
public enum AdjustmentTypeEnum {

    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Labor")
    LABOR("Labor"),
    @XmlEnumValue("Markup")
    MARKUP("Markup"),
    @XmlEnumValue("Betterment")
    BETTERMENT("Betterment"),
    @XmlEnumValue("Betterment Labor")
    BETTERMENT_LABOR("Betterment Labor"),
    @XmlEnumValue("Betterment Labor Paint")
    BETTERMENT_LABOR_PAINT("Betterment Labor Paint"),
    @XmlEnumValue("Betterment Parts")
    BETTERMENT_PARTS("Betterment Parts"),
    @XmlEnumValue("Betterment Parts Labor")
    BETTERMENT_PARTS_LABOR("Betterment Parts Labor"),
    @XmlEnumValue("Betterment Parts Labor Paint")
    BETTERMENT_PARTS_LABOR_PAINT("Betterment Parts Labor Paint"),
    @XmlEnumValue("Betterment Paint and Materials")
    BETTERMENT_PAINT_AND_MATERIALS("Betterment Paint and Materials"),
    @XmlEnumValue("Betterment Parts Paint")
    BETTERMENT_PARTS_PAINT("Betterment Parts Paint"),
    @XmlEnumValue("Betterment Total Paint")
    BETTERMENT_TOTAL_PAINT("Betterment Total Paint");
    
    private final String value;

    AdjustmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdjustmentTypeEnum fromValue(String v) {
        for (AdjustmentTypeEnum c: AdjustmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
