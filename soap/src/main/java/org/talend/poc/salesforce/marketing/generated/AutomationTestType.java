
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationTestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AutomationTestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="UnplannedOutage"/&gt;
 *     &lt;enumeration value="InMaintenance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AutomationTestType")
@XmlEnum
public enum AutomationTestType {

    OK("OK"),
    @XmlEnumValue("UnplannedOutage")
    UNPLANNED_OUTAGE("UnplannedOutage"),
    @XmlEnumValue("InMaintenance")
    IN_MAINTENANCE("InMaintenance");
    private final String value;

    AutomationTestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomationTestType fromValue(String v) {
        for (AutomationTestType c: AutomationTestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
