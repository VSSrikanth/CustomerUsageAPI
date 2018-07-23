
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;
import com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1.ExtendedCustomerAccountType;


/**
 * <p>Java class for CustomerAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="BillingAccounts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerBillingAccount" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerBillingAccountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceAccounts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceAccount" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}ServiceAccountType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/customer/customer-service-usage/v1}ExtendedCustomerAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountType", propOrder = {
    "billingAccounts",
    "serviceAccounts",
    "extension"
})
public class CustomerAccountType
    extends BaseComponentType
{

    @XmlElement(name = "BillingAccounts", required = true)
    protected CustomerAccountType.BillingAccounts billingAccounts;
    @XmlElement(name = "ServiceAccounts", required = true)
    protected CustomerAccountType.ServiceAccounts serviceAccounts;
    @XmlElement(name = "Extension")
    protected ExtendedCustomerAccountType extension;

    /**
     * Gets the value of the billingAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType.BillingAccounts }
     *     
     */
    public CustomerAccountType.BillingAccounts getBillingAccounts() {
        return billingAccounts;
    }

    /**
     * Sets the value of the billingAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType.BillingAccounts }
     *     
     */
    public void setBillingAccounts(CustomerAccountType.BillingAccounts value) {
        this.billingAccounts = value;
    }

    /**
     * Gets the value of the serviceAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType.ServiceAccounts }
     *     
     */
    public CustomerAccountType.ServiceAccounts getServiceAccounts() {
        return serviceAccounts;
    }

    /**
     * Sets the value of the serviceAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType.ServiceAccounts }
     *     
     */
    public void setServiceAccounts(CustomerAccountType.ServiceAccounts value) {
        this.serviceAccounts = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerAccountType }
     *     
     */
    public ExtendedCustomerAccountType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerAccountType }
     *     
     */
    public void setExtension(ExtendedCustomerAccountType value) {
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
     *         &lt;element name="CustomerBillingAccount" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerBillingAccountType" maxOccurs="unbounded"/>
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
        "customerBillingAccount"
    })
    public static class BillingAccounts {

        @XmlElement(name = "CustomerBillingAccount", required = true)
        protected List<CustomerBillingAccountType> customerBillingAccount;

        /**
         * Gets the value of the customerBillingAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerBillingAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerBillingAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerBillingAccountType }
         * 
         * 
         */
        public List<CustomerBillingAccountType> getCustomerBillingAccount() {
            if (customerBillingAccount == null) {
                customerBillingAccount = new ArrayList<CustomerBillingAccountType>();
            }
            return this.customerBillingAccount;
        }

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
     *         &lt;element name="ServiceAccount" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}ServiceAccountType" maxOccurs="unbounded"/>
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
        "serviceAccount"
    })
    public static class ServiceAccounts {

        @XmlElement(name = "ServiceAccount", required = true)
        protected List<ServiceAccountType> serviceAccount;

        /**
         * Gets the value of the serviceAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceAccountType }
         * 
         * 
         */
        public List<ServiceAccountType> getServiceAccount() {
            if (serviceAccount == null) {
                serviceAccount = new ArrayList<ServiceAccountType>();
            }
            return this.serviceAccount;
        }

    }

}
