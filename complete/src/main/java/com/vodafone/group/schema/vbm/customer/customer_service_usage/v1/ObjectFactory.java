
package com.vodafone.group.schema.vbm.customer.customer_service_usage.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vodafone.group.schema.vbm.customer.customer_service_usage.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomerServiceUsageListVBMResponse_QNAME = new QName("http://group.vodafone.com/schema/vbm/customer/customer-service-usage/v1", "GetCustomerServiceUsageListVBMResponse");
    private final static QName _GetCustomerServiceUsageListVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/customer/customer-service-usage/v1", "GetCustomerServiceUsageListVBMRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vodafone.group.schema.vbm.customer.customer_service_usage.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerServiceUsageListVBMResponseType }
     * 
     */
    public GetCustomerServiceUsageListVBMResponseType createGetCustomerServiceUsageListVBMResponseType() {
        return new GetCustomerServiceUsageListVBMResponseType();
    }

    /**
     * Create an instance of {@link GetCustomerServiceUsageListVBMRequestType }
     * 
     */
    public GetCustomerServiceUsageListVBMRequestType createGetCustomerServiceUsageListVBMRequestType() {
        return new GetCustomerServiceUsageListVBMRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceUsageListVBMResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/customer/customer-service-usage/v1", name = "GetCustomerServiceUsageListVBMResponse")
    public JAXBElement<GetCustomerServiceUsageListVBMResponseType> createGetCustomerServiceUsageListVBMResponse(GetCustomerServiceUsageListVBMResponseType value) {
        return new JAXBElement<GetCustomerServiceUsageListVBMResponseType>(_GetCustomerServiceUsageListVBMResponse_QNAME, GetCustomerServiceUsageListVBMResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerServiceUsageListVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/customer/customer-service-usage/v1", name = "GetCustomerServiceUsageListVBMRequest")
    public JAXBElement<GetCustomerServiceUsageListVBMRequestType> createGetCustomerServiceUsageListVBMRequest(GetCustomerServiceUsageListVBMRequestType value) {
        return new JAXBElement<GetCustomerServiceUsageListVBMRequestType>(_GetCustomerServiceUsageListVBMRequest_QNAME, GetCustomerServiceUsageListVBMRequestType.class, null, value);
    }

}
