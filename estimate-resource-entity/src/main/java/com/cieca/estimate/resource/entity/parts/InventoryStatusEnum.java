package com.cieca.estimate.resource.entity.parts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryStatusEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="BackOrdered"/>
 *     &lt;enumeration value="Discontinued"/>
 *     &lt;enumeration value="NotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InventoryStatusEnum")
@XmlEnum
public enum InventoryStatusEnum {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("BackOrdered")
    BACK_ORDERED("BackOrdered"),
    @XmlEnumValue("Discontinued")
    DISCONTINUED("Discontinued"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    InventoryStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryStatusEnum fromValue(String v) {
        for (InventoryStatusEnum c: InventoryStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
