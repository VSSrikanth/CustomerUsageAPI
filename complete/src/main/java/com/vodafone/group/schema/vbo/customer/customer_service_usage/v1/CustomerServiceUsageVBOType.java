
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.ExtendedBaseComponentType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedCustomerServiceUsageVBOType;


/**
 * 
 * 				The Customer Service Usage service is an "Entity"
 * 				service that provides capabilities to view the record of a Service
 * 				Usage for a Party, Product or Service. This is usually in the
 * 				context of the Customer Account and their subscriptions to Vodafone
 * 				services.
 * 			
 * 
 * <p>Java class for CustomerServiceUsageVBOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerServiceUsageVBOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}ExtendedBaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerServiceUsageDetailsType" minOccurs="0"/>
 *         &lt;element name="RelatedCustomerServiceUsages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerServiceUsage" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}RelatedCustomerServiceUsageType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Roles" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerServiceUsageRolesType"/>
 *         &lt;element name="Parts" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerServiceUsagePartsType"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedCustomerServiceUsageVBOType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerServiceUsageVBOType", propOrder = {
    "details",
    "relatedCustomerServiceUsages",
    "roles",
    "parts",
    "extension"
})
public class CustomerServiceUsageVBOType
    extends ExtendedBaseComponentType
{

    @XmlElement(name = "Details")
    protected CustomerServiceUsageDetailsType details;
    @XmlElement(name = "RelatedCustomerServiceUsages")
    protected CustomerServiceUsageVBOType.RelatedCustomerServiceUsages relatedCustomerServiceUsages;
    @XmlElement(name = "Roles", required = true)
    protected CustomerServiceUsageRolesType roles;
    @XmlElement(name = "Parts", required = true)
    protected CustomerServiceUsagePartsType parts;
    @XmlElement(name = "Extension")
    protected ExtendedCustomerServiceUsageVBOType extension;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerServiceUsageDetailsType }
     *     
     */
    public CustomerServiceUsageDetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerServiceUsageDetailsType }
     *     
     */
    public void setDetails(CustomerServiceUsageDetailsType value) {
        this.details = value;
    }

    /**
     * Gets the value of the relatedCustomerServiceUsages property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerServiceUsageVBOType.RelatedCustomerServiceUsages }
     *     
     */
    public CustomerServiceUsageVBOType.RelatedCustomerServiceUsages getRelatedCustomerServiceUsages() {
        return relatedCustomerServiceUsages;
    }

    /**
     * Sets the value of the relatedCustomerServiceUsages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerServiceUsageVBOType.RelatedCustomerServiceUsages }
     *     
     */
    public void setRelatedCustomerServiceUsages(CustomerServiceUsageVBOType.RelatedCustomerServiceUsages value) {
        this.relatedCustomerServiceUsages = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerServiceUsageRolesType }
     *     
     */
    public CustomerServiceUsageRolesType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerServiceUsageRolesType }
     *     
     */
    public void setRoles(CustomerServiceUsageRolesType value) {
        this.roles = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerServiceUsagePartsType }
     *     
     */
    public CustomerServiceUsagePartsType getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerServiceUsagePartsType }
     *     
     */
    public void setParts(CustomerServiceUsagePartsType value) {
        this.parts = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerServiceUsageVBOType }
     *     
     */
    public ExtendedCustomerServiceUsageVBOType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerServiceUsageVBOType }
     *     
     */
    public void setExtension(ExtendedCustomerServiceUsageVBOType value) {
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
     *         &lt;element name="CustomerServiceUsage" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}RelatedCustomerServiceUsageType" maxOccurs="unbounded"/>
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
        "customerServiceUsage"
    })
    public static class RelatedCustomerServiceUsages {

        @XmlElement(name = "CustomerServiceUsage", required = true)
        protected List<RelatedCustomerServiceUsageType> customerServiceUsage;

        /**
         * Gets the value of the customerServiceUsage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerServiceUsage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerServiceUsage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedCustomerServiceUsageType }
         * 
         * 
         */
        public List<RelatedCustomerServiceUsageType> getCustomerServiceUsage() {
            if (customerServiceUsage == null) {
                customerServiceUsage = new ArrayList<RelatedCustomerServiceUsageType>();
            }
            return this.customerServiceUsage;
        }

    }

}
