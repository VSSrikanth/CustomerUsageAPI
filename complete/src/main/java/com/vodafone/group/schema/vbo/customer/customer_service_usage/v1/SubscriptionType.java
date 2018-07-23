
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedSubscriptionType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.TextType;


/**
 * <p>Java class for SubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Msisdn" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedSubscriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionType", propOrder = {
    "msisdn",
    "extension"
})
public class SubscriptionType
    extends BaseComponentType
{

    @XmlElement(name = "Msisdn")
    protected TextType msisdn;
    @XmlElement(name = "Extension")
    protected ExtendedSubscriptionType extension;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMsisdn(TextType value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSubscriptionType }
     *     
     */
    public ExtendedSubscriptionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSubscriptionType }
     *     
     */
    public void setExtension(ExtendedSubscriptionType value) {
        this.extension = value;
    }

}
