
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChatMessagingEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChatMessagingEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Template"/&gt;
 *     &lt;enumeration value="MO"/&gt;
 *     &lt;enumeration value="WhatsAppTemplate"/&gt;
 *     &lt;enumeration value="WhatsAppMO"/&gt;
 *     &lt;enumeration value="WhatsAppPhone"/&gt;
 *     &lt;enumeration value="WhatsAppAccount"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChatMessagingEventType")
@XmlEnum
public enum ChatMessagingEventType {

    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    MO("MO"),
    @XmlEnumValue("WhatsAppTemplate")
    WHATS_APP_TEMPLATE("WhatsAppTemplate"),
    @XmlEnumValue("WhatsAppMO")
    WHATS_APP_MO("WhatsAppMO"),
    @XmlEnumValue("WhatsAppPhone")
    WHATS_APP_PHONE("WhatsAppPhone"),
    @XmlEnumValue("WhatsAppAccount")
    WHATS_APP_ACCOUNT("WhatsAppAccount");
    private final String value;

    ChatMessagingEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChatMessagingEventType fromValue(String v) {
        for (ChatMessagingEventType c: ChatMessagingEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
