
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedCustomerServiceUsageDetailsType;


/**
 *  A type definition for CustomerServiceUsage
 * 				Details
 * 
 * <p>Java class for CustomerServiceUsageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerServiceUsageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedCustomerServiceUsageDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerServiceUsageDetailsType", propOrder = {
    "extension"
})
public class CustomerServiceUsageDetailsType {

    @XmlElement(name = "Extension")
    protected ExtendedCustomerServiceUsageDetailsType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerServiceUsageDetailsType }
     *     
     */
    public ExtendedCustomerServiceUsageDetailsType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerServiceUsageDetailsType }
     *     
     */
    public void setExtension(ExtendedCustomerServiceUsageDetailsType value) {
        this.extension = value;
    }

}
