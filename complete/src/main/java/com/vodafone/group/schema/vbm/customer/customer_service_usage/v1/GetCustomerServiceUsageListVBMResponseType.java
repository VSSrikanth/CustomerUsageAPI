
package com.vodafone.group.schema.vbm.customer.customer_service_usage.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.vbo.customer.customer_service_usage.v1.CustomerServiceUsageVBOType;


/**
 *  Type definition for the
 * 				GetCustomerServiceUsageList response payload.
 * 			
 * 
 * <p>Java class for GetCustomerServiceUsageListVBMResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerServiceUsageListVBMResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerServiceUsageVBO" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CustomerServiceUsageVBOType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerServiceUsageListVBMResponseType", propOrder = {
    "customerServiceUsageVBO"
})
public class GetCustomerServiceUsageListVBMResponseType {

    @XmlElement(name = "CustomerServiceUsageVBO")
    protected List<CustomerServiceUsageVBOType> customerServiceUsageVBO;

    /**
     * Gets the value of the customerServiceUsageVBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerServiceUsageVBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerServiceUsageVBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerServiceUsageVBOType }
     * 
     * 
     */
    public List<CustomerServiceUsageVBOType> getCustomerServiceUsageVBO() {
        if (customerServiceUsageVBO == null) {
            customerServiceUsageVBO = new ArrayList<CustomerServiceUsageVBOType>();
        }
        return this.customerServiceUsageVBO;
    }

}
