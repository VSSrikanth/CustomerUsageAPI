
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedServiceAccountType;


/**
 * <p>Java class for ServiceAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAccountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedServiceAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAccountType", propOrder = {
    "extension"
})
public class ServiceAccountType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedServiceAccountType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedServiceAccountType }
     *     
     */
    public ExtendedServiceAccountType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedServiceAccountType }
     *     
     */
    public void setExtension(ExtendedServiceAccountType value) {
        this.extension = value;
    }

}
