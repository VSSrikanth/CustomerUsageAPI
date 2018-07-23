
package com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedCustomerServiceUsageVBOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedCustomerServiceUsageVBOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatestTransactions" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedLatestTransactions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedCustomerServiceUsageVBOType", propOrder = {
    "latestTransactions"
})
public class ExtendedCustomerServiceUsageVBOType {

    @XmlElement(name = "LatestTransactions")
    protected List<ExtendedLatestTransactions> latestTransactions;

    /**
     * Gets the value of the latestTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latestTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatestTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedLatestTransactions }
     * 
     * 
     */
    public List<ExtendedLatestTransactions> getLatestTransactions() {
        if (latestTransactions == null) {
            latestTransactions = new ArrayList<ExtendedLatestTransactions>();
        }
        return this.latestTransactions;
    }

}
