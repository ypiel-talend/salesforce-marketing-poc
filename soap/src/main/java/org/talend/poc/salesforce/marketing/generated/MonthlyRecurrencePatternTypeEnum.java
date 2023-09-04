
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthlyRecurrencePatternTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MonthlyRecurrencePatternTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ByDay"/&gt;
 *     &lt;enumeration value="ByWeek"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthlyRecurrencePatternTypeEnum")
@XmlEnum
public enum MonthlyRecurrencePatternTypeEnum {

    @XmlEnumValue("ByDay")
    BY_DAY("ByDay"),
    @XmlEnumValue("ByWeek")
    BY_WEEK("ByWeek");
    private final String value;

    MonthlyRecurrencePatternTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthlyRecurrencePatternTypeEnum fromValue(String v) {
        for (MonthlyRecurrencePatternTypeEnum c: MonthlyRecurrencePatternTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
