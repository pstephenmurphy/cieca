package com.cieca.estimate.resource.entity.damage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaterialTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}ClosedEnum">
 *     &lt;enumeration value="MA2S"/>
 *     &lt;enumeration value="MA2T"/>
 *     &lt;enumeration value="MA3S"/>
 *     &lt;enumeration value="MABL"/>
 *     &lt;enumeration value="MACS"/>
 *     &lt;enumeration value="MAHW"/>
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="MAPA"/>
 *     &lt;enumeration value="MASH"/>
 *     &lt;enumeration value="MATD"/>
 *     &lt;enumeration value="OTCO"/>
 *     &lt;enumeration value="OTCP"/>
 *     &lt;enumeration value="OTFA"/>
 *     &lt;enumeration value="OTFO"/>
 *     &lt;enumeration value="OTFS"/>
 *     &lt;enumeration value="OTLU"/>
 *     &lt;enumeration value="OTRC"/>
 *     &lt;enumeration value="OTSH"/>
 *     &lt;enumeration value="OTUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaterialTypeEnum")
@XmlEnum
public enum MaterialTypeEnum {

    @XmlEnumValue("MA2S")
    MA_2_S("MA2S"),
    @XmlEnumValue("MA2T")
    MA_2_T("MA2T"),
    @XmlEnumValue("MA3S")
    MA_3_S("MA3S"),
    MABL("MABL"),
    MACS("MACS"),
    MAHW("MAHW"),
    MAIN("MAIN"),
    MAPA("MAPA"),
    MASH("MASH"),
    MATD("MATD"),
    OTCO("OTCO"),
    OTCP("OTCP"),
    OTFA("OTFA"),
    OTFO("OTFO"),
    OTFS("OTFS"),
    OTLU("OTLU"),
    OTRC("OTRC"),
    OTSH("OTSH"),
    OTUM("OTUM");
    private final String value;

    MaterialTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialTypeEnum fromValue(String v) {
        for (MaterialTypeEnum c: MaterialTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
