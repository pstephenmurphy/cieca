package com.cieca.estimate.resource.entity.parts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartNumTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartNumTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="AAIA"/>
 *     &lt;enumeration value="Aftermarket"/>
 *     &lt;enumeration value="CarPart"/>
 *     &lt;enumeration value="EstimatingSystem"/>
 *     &lt;enumeration value="HollanderInterchange"/>
 *     &lt;enumeration value="OE"/>
 *     &lt;enumeration value="Recycle"/>
 *     &lt;enumeration value="Stock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartNumTypeEnum")
@XmlEnum
public enum PartNumTypeEnum {

    AAIA("AAIA"),
    @XmlEnumValue("Aftermarket")
    AFTERMARKET("Aftermarket"),
    @XmlEnumValue("CarPart")
    CAR_PART("CarPart"),
    @XmlEnumValue("EstimatingSystem")
    ESTIMATING_SYSTEM("EstimatingSystem"),
    @XmlEnumValue("HollanderInterchange")
    HOLLANDER_INTERCHANGE("HollanderInterchange"),
    OE("OE"),
    @XmlEnumValue("Recycle")
    RECYCLE("Recycle"),
    @XmlEnumValue("Stock")
    STOCK("Stock");
    private final String value;

    PartNumTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartNumTypeEnum fromValue(String v) {
        for (PartNumTypeEnum c: PartNumTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
