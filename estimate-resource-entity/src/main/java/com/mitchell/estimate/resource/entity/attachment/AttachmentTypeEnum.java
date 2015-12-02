package com.mitchell.estimate.resource.entity.attachment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="TV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentTypeEnum")
@XmlEnum
public enum AttachmentTypeEnum {

    CD,
    ES,
    FR,
    IN,
    MI,
    PH,
    PI,
    PO,
    RO,
    TV;

    public String value() {
        return name();
    }

    public static AttachmentTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
