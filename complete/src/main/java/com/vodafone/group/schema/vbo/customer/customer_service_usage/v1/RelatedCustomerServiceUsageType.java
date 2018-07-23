
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedRelatedCustomerServiceUsageType;


/**
 * A type definition for Related CustomerServiceUsage
 * 				Type
 * 
 * <p>Java class for RelatedCustomerServiceUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedCustomerServiceUsageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedRelatedCustomerServiceUsageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedCustomerServiceUsageType", propOrder = {
    "extension"
})
public class RelatedCustomerServiceUsageType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedRelatedCustomerServiceUsageType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedRelatedCustomerServiceUsageType }
     *     
     */
    public ExtendedRelatedCustomerServiceUsageType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedRelatedCustomerServiceUsageType }
     *     
     */
    public void setExtension(ExtendedRelatedCustomerServiceUsageType value) {
        this.extension = value;
    }

}
