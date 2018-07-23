
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="DeezerView"/>
 *     &lt;enumeration value="DeezerActivatePackage"/>
 *     &lt;enumeration value="DeezerEligiblePackages"/>
 *     &lt;enumeration value="DeezerDeactivatePackage"/>
 *     &lt;enumeration value="DeezerMonthlyDeactivatePackage"/>
 *     &lt;enumeration value="DeezerTransactionView"/>
 *     &lt;enumeration value="CUR_SYNC"/>
 *     &lt;enumeration value="CSDB_SYNC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionCodeType")
@XmlEnum
public enum ActionCodeType {

    ADD("ADD"),
    UPDATE("UPDATE"),
    DELETE("DELETE"),
    @XmlEnumValue("DeezerView")
    DEEZER_VIEW("DeezerView"),
    @XmlEnumValue("DeezerActivatePackage")
    DEEZER_ACTIVATE_PACKAGE("DeezerActivatePackage"),
    @XmlEnumValue("DeezerEligiblePackages")
    DEEZER_ELIGIBLE_PACKAGES("DeezerEligiblePackages"),
    @XmlEnumValue("DeezerDeactivatePackage")
    DEEZER_DEACTIVATE_PACKAGE("DeezerDeactivatePackage"),
    @XmlEnumValue("DeezerMonthlyDeactivatePackage")
    DEEZER_MONTHLY_DEACTIVATE_PACKAGE("DeezerMonthlyDeactivatePackage"),
    @XmlEnumValue("DeezerTransactionView")
    DEEZER_TRANSACTION_VIEW("DeezerTransactionView"),
    CUR_SYNC("CUR_SYNC"),
    CSDB_SYNC("CSDB_SYNC");
    private final String value;

    ActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCodeType fromValue(String v) {
        for (ActionCodeType c: ActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
