
package com.vodafone.group.contract.vbs.customer.customer_service_usage.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerServiceUsageInterface-SOAP11-HTTPBindingQSService", targetNamespace = "http://group.vodafone.com/contract/vbs/customer/customer-service-usage/v1", wsdlLocation = "http://c3d-osbmgr.vodacom.corp/services/CustomerServiceUsage/v1?wsdl")
public class CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService
    extends Service
{

    private final static URL CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_EXCEPTION;
    private final static QName CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_QNAME = new QName("http://group.vodafone.com/contract/vbs/customer/customer-service-usage/v1", "CustomerServiceUsageInterface-SOAP11-HTTPBindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://c3d-osbmgr.vodacom.corp/services/CustomerServiceUsage/v1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_WSDL_LOCATION = url;
        CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_EXCEPTION = e;
    }

    public CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService() {
        super(__getWsdlLocation(), CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_QNAME);
    }

    public CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_QNAME, features);
    }

    public CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_QNAME);
    }

    public CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_QNAME, features);
    }

    public CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServiceUsageInterfaceSOAP11HTTPBindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerServiceUsageInterface
     */
    @WebEndpoint(name = "CustomerServiceUsageInterface-SOAP11-HTTPBindingQSPort")
    public CustomerServiceUsageInterface getCustomerServiceUsageInterfaceSOAP11HTTPBindingQSPort() {
        return super.getPort(new QName("http://group.vodafone.com/contract/vbs/customer/customer-service-usage/v1", "CustomerServiceUsageInterface-SOAP11-HTTPBindingQSPort"), CustomerServiceUsageInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerServiceUsageInterface
     */
    @WebEndpoint(name = "CustomerServiceUsageInterface-SOAP11-HTTPBindingQSPort")
    public CustomerServiceUsageInterface getCustomerServiceUsageInterfaceSOAP11HTTPBindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://group.vodafone.com/contract/vbs/customer/customer-service-usage/v1", "CustomerServiceUsageInterface-SOAP11-HTTPBindingQSPort"), CustomerServiceUsageInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_EXCEPTION!= null) {
            throw CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_EXCEPTION;
        }
        return CUSTOMERSERVICEUSAGEINTERFACESOAP11HTTPBINDINGQSSERVICE_WSDL_LOCATION;
    }

}