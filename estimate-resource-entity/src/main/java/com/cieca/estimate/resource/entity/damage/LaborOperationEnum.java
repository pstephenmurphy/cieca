package com.cieca.estimate.resource.entity.damage;

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
    BLANK("OP0"),
    @XmlEnumValue("OP1")
    REFINISH_REPAIR("OP1"),
    @XmlEnumValue("OP2")
    REMOVE_Install("OP2"),
    @XmlEnumValue("OP3")
    ADDITIONAL_REPAIR("OP3"),
    @XmlEnumValue("OP4")
    ALIGNMENT("OP4"),
    @XmlEnumValue("OP5")
    OVERHAUL("OP5"),
    @XmlEnumValue("OP6")
    REFINISH("OP6"),
    @XmlEnumValue("OP7")
    INSPECT("OP7"),
    @XmlEnumValue("OP8")
    CHECK_ADJUST("OP8"),
    @XmlEnumValue("OP9")
    REPAIR("OP9"),
    @XmlEnumValue("OP10")
    REPAIR_PARTIAL("OP10"),
    @XmlEnumValue("OP11")
    REMOVE_REPLACE("OP11"),
    @XmlEnumValue("OP12")
    REMOVE_REPLACE_PARTIAL("OP12"),
    @XmlEnumValue("OP13")
    ADDITIONAL_COSTS("OP13"),
    @XmlEnumValue("OP14")
    ADDITIONAL_OPERATIONS("OP14"),
    @XmlEnumValue("OP15")
    BLEND("OP15"),
    @XmlEnumValue("OP16")
    SUBLET("OP16"),
    @XmlEnumValue("OP17")
    RELATED_PRIOR_DAMAGE("OP17"),
    @XmlEnumValue("OP18")
    APPEARANCE_ALLOWANCE("OP18"),
    @XmlEnumValue("OP19")
    UNRELATED_PRIOR_DAMAGE("OP19"),
    @XmlEnumValue("OP20")
    REMOVE_AND_Reinstall("OP20"),
    @XmlEnumValue("OP21")
    REMOVE_AND_REPAIR("OP21"),
    @XmlEnumValue("OP22")
    REPAIR_FIRST_ELSE_REPLACE("OP22"),
    @XmlEnumValue("OP23")
    REDO("OP23"),
    @XmlEnumValue("OP24")
    CHIP_GUARD("OP24"),
    @XmlEnumValue("OP25")
    TWO_TONE("OP25"),
    @XmlEnumValue("OP26")
    PAINTLESS_DENT_REPAIR("OP26");
    
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
