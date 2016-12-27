package com.cieca.estimate.resource.entity.inspection;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InspectionCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InspectionCodeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InspectionCodeEnum")
@XmlEnum
public enum InspectionCodeEnum {

    D,
    I,
    O,
    C;

    public String value() {
        return name();
    }

    public static InspectionCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
