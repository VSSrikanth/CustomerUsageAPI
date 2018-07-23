
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedCustomerServiceUsageRolesType;


/**
 * <p>Java class for CustomerServiceUsageRolesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerServiceUsageRolesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerType"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedCustomerServiceUsageRolesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerServiceUsageRolesType", propOrder = {
    "customer",
    "extension"
})
public class CustomerServiceUsageRolesType {

    @XmlElement(name = "Customer", required = true)
    protected CustomerType customer;
    @XmlElement(name = "Extension")
    protected ExtendedCustomerServiceUsageRolesType extension;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerServiceUsageRolesType }
     *     
     */
    public ExtendedCustomerServiceUsageRolesType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerServiceUsageRolesType }
     *     
     */
    public void setExtension(ExtendedCustomerServiceUsageRolesType value) {
        this.extension = value;
    }

}
