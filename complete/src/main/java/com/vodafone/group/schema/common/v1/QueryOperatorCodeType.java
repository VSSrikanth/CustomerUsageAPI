
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOperatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOperatorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="LESS_THAN_EQUALS"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="NOT_LIKE"/>
 *     &lt;enumeration value="My5ViewThru"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryOperatorCodeType")
@XmlEnum
public enum QueryOperatorCodeType {

    EQUALS("EQUALS"),
    NOT_EQUALS("NOT_EQUALS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
    CONTAINS("CONTAINS"),
    DOES_NOT_CONTAIN("DOES_NOT_CONTAIN"),
    LIKE("LIKE"),
    NOT_LIKE("NOT_LIKE"),
    @XmlEnumValue("My5ViewThru")
    MY_5_VIEW_THRU("My5ViewThru");
    private final String value;

    QueryOperatorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryOperatorCodeType fromValue(String v) {
        for (QueryOperatorCodeType c: QueryOperatorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
