package com.cieca.estimate.resource.entity.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WhoPaysEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WhoPaysEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="BP"/>
 *     &lt;enumeration value="DS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WhoPaysEnum")
@XmlEnum
public enum WhoPaysEnum {

    C,
    CP,
    F,
    I,
    IN,
    O,
    W,
    TP,
    IC,
    BP,
    DS;

    public String value() {
        return name();
    }

    public static WhoPaysEnum fromValue(String v) {
        return valueOf(v);
    }

}
