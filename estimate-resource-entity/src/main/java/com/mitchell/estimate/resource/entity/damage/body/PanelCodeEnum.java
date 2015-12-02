package com.mitchell.estimate.resource.entity.damage.body;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PanelCodeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="DTR"/>
 *     &lt;enumeration value="HOOD"/>
 *     &lt;enumeration value="LFD"/>
 *     &lt;enumeration value="LFF"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LRQ"/>
 *     &lt;enumeration value="RFD"/>
 *     &lt;enumeration value="RFF"/>
 *     &lt;enumeration value="RRD"/>
 *     &lt;enumeration value="RRQ"/>
 *     &lt;enumeration value="TOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PanelCodeEnum")
@XmlEnum
public enum PanelCodeEnum {

    DTR,
    HOOD,
    LFD,
    LFF,
    LRD,
    LRQ,
    RFD,
    RFF,
    RRD,
    RRQ,
    TOP;

    public String value() {
        return name();
    }

    public static PanelCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
