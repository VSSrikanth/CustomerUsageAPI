
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedCustomerServiceUsagePartsType;


/**
 * <p>Java class for CustomerServiceUsagePartsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerServiceUsagePartsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccount" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerAccountType"/>
 *         &lt;element name="Subscription" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}SubscriptionType"/>
 *         &lt;element name="Service" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}ServiceType" minOccurs="0"/>
 *         &lt;element name="Resource" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}ResourceType" minOccurs="0"/>
 *         &lt;element name="UsageSpecification" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}UsageSpecificationType" minOccurs="0"/>
 *         &lt;element name="UsageItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Usage" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}UsageType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedCustomerServiceUsagePartsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerServiceUsagePartsType", propOrder = {
    "customerAccount",
    "subscription",
    "service",
    "resource",
    "usageSpecification",
    "usageItems",
    "extension"
})
public class CustomerServiceUsagePartsType {

    @XmlElement(name = "CustomerAccount", required = true)
    protected CustomerAccountType customerAccount;
    @XmlElement(name = "Subscription", required = true)
    protected SubscriptionType subscription;
    @XmlElement(name = "Service")
    protected ServiceType service;
    @XmlElement(name = "Resource")
    protected ResourceType resource;
    @XmlElement(name = "UsageSpecification")
    protected UsageSpecificationType usageSpecification;
    @XmlElement(name = "UsageItems")
    protected CustomerServiceUsagePartsType.UsageItems usageItems;
    @XmlElement(name = "Extension")
    protected ExtendedCustomerServiceUsagePartsType extension;

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType }
     *     
     */
    public CustomerAccountType getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType }
     *     
     */
    public void setCustomerAccount(CustomerAccountType value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionType }
     *     
     */
    public SubscriptionType getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionType }
     *     
     */
    public void setSubscription(SubscriptionType value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setResource(ResourceType value) {
        this.resource = value;
    }

    /**
     * Gets the value of the usageSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSpecificationType }
     *     
     */
    public UsageSpecificationType getUsageSpecification() {
        return usageSpecification;
    }

    /**
     * Sets the value of the usageSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSpecificationType }
     *     
     */
    public void setUsageSpecification(UsageSpecificationType value) {
        this.usageSpecification = value;
    }

    /**
     * Gets the value of the usageItems property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerServiceUsagePartsType.UsageItems }
     *     
     */
    public CustomerServiceUsagePartsType.UsageItems getUsageItems() {
        return usageItems;
    }

    /**
     * Sets the value of the usageItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerServiceUsagePartsType.UsageItems }
     *     
     */
    public void setUsageItems(CustomerServiceUsagePartsType.UsageItems value) {
        this.usageItems = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerServiceUsagePartsType }
     *     
     */
    public ExtendedCustomerServiceUsagePartsType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerServiceUsagePartsType }
     *     
     */
    public void setExtension(ExtendedCustomerServiceUsagePartsType value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Usage" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}UsageType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usage"
    })
    public static class UsageItems {

        @XmlElement(name = "Usage")
        protected List<UsageType> usage;

        /**
         * Gets the value of the usage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UsageType }
         * 
         * 
         */
        public List<UsageType> getUsage() {
            if (usage == null) {
                usage = new ArrayList<UsageType>();
            }
            return this.usage;
        }

    }

}
