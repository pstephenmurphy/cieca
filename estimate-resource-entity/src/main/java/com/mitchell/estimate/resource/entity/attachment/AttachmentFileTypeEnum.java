package com.mitchell.estimate.resource.entity.attachment;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentFileTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentFileTypeEnum">
 *   &lt;restriction base="{http://www.cieca.com/BMS}OpenEnum">
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="BMS"/>
 *     &lt;enumeration value="EXCEL"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="MIDI"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="TIFF"/>
 *     &lt;enumeration value="WORD"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="ZIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentFileTypeEnum")
@XmlEnum
public enum AttachmentFileTypeEnum {

    CSV,
    BMS,
    EXCEL,
    HTML,
    JPEG,
    MIDI,
    OTHER,
    PDF,
    TEXT,
    TIFF,
    WORD,
    XML,
    ZIP;

    public String value() {
        return name();
    }

    public static AttachmentFileTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
