//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.14 at 02:56:20 PM PST 
//


package com.mitchell.estimate.resource.dto.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaborOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LaborOperationEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="OP0"/>
 *     &lt;enumeration value="OP1"/>
 *     &lt;enumeration value="OP2"/>
 *     &lt;enumeration value="OP3"/>
 *     &lt;enumeration value="OP4"/>
 *     &lt;enumeration value="OP5"/>
 *     &lt;enumeration value="OP6"/>
 *     &lt;enumeration value="OP7"/>
 *     &lt;enumeration value="OP8"/>
 *     &lt;enumeration value="OP9"/>
 *     &lt;enumeration value="OP10"/>
 *     &lt;enumeration value="OP11"/>
 *     &lt;enumeration value="OP12"/>
 *     &lt;enumeration value="OP13"/>
 *     &lt;enumeration value="OP14"/>
 *     &lt;enumeration value="OP15"/>
 *     &lt;enumeration value="OP16"/>
 *     &lt;enumeration value="OP17"/>
 *     &lt;enumeration value="OP18"/>
 *     &lt;enumeration value="OP19"/>
 *     &lt;enumeration value="OP20"/>
 *     &lt;enumeration value="OP21"/>
 *     &lt;enumeration value="OP22"/>
 *     &lt;enumeration value="OP23"/>
 *     &lt;enumeration value="OP24"/>
 *     &lt;enumeration value="OP25"/>
 *     &lt;enumeration value="OP26"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaborOperationEnum")
@XmlEnum
public enum LaborOperationEnum {

    @XmlEnumValue("OP0")
    OP_0("OP0"),
    @XmlEnumValue("OP1")
    OP_1("OP1"),
    @XmlEnumValue("OP2")
    OP_2("OP2"),
    @XmlEnumValue("OP3")
    OP_3("OP3"),
    @XmlEnumValue("OP4")
    OP_4("OP4"),
    @XmlEnumValue("OP5")
    OP_5("OP5"),
    @XmlEnumValue("OP6")
    OP_6("OP6"),
    @XmlEnumValue("OP7")
    OP_7("OP7"),
    @XmlEnumValue("OP8")
    OP_8("OP8"),
    @XmlEnumValue("OP9")
    OP_9("OP9"),
    @XmlEnumValue("OP10")
    OP_10("OP10"),
    @XmlEnumValue("OP11")
    OP_11("OP11"),
    @XmlEnumValue("OP12")
    OP_12("OP12"),
    @XmlEnumValue("OP13")
    OP_13("OP13"),
    @XmlEnumValue("OP14")
    OP_14("OP14"),
    @XmlEnumValue("OP15")
    OP_15("OP15"),
    @XmlEnumValue("OP16")
    OP_16("OP16"),
    @XmlEnumValue("OP17")
    OP_17("OP17"),
    @XmlEnumValue("OP18")
    OP_18("OP18"),
    @XmlEnumValue("OP19")
    OP_19("OP19"),
    @XmlEnumValue("OP20")
    OP_20("OP20"),
    @XmlEnumValue("OP21")
    OP_21("OP21"),
    @XmlEnumValue("OP22")
    OP_22("OP22"),
    @XmlEnumValue("OP23")
    OP_23("OP23"),
    @XmlEnumValue("OP24")
    OP_24("OP24"),
    @XmlEnumValue("OP25")
    OP_25("OP25"),
    @XmlEnumValue("OP26")
    OP_26("OP26");
    private final String value;

    LaborOperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaborOperationEnum fromValue(String v) {
        for (LaborOperationEnum c: LaborOperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
