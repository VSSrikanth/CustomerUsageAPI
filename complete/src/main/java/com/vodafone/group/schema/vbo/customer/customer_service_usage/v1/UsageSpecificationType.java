
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedUsageSpecification;


/**
 * <p>Java class for UsageSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageSpecificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}SpecificationType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedUsageSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageSpecificationType", propOrder = {
    "extension"
})
public class UsageSpecificationType
    extends SpecificationType
{

    @XmlElement(name = "Extension")
    protected ExtendedUsageSpecification extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedUsageSpecification }
     *     
     */
    public ExtendedUsageSpecification getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedUsageSpecification }
     *     
     */
    public void setExtension(ExtendedUsageSpecification value) {
        this.extension = value;
    }

}
