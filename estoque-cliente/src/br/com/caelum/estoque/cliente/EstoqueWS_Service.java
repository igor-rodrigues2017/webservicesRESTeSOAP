
package br.com.caelum.estoque.cliente;

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
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EstoqueWS", targetNamespace = "http://ws.estoque.caelum.com.br/", wsdlLocation = "http://localhost:8080/webservices-soap-jaxws-wildfly-0.0.1-SNAPSHOT/EstoqueWS?wsdl")
public class EstoqueWS_Service
    extends Service
{

    private final static URL ESTOQUEWS_WSDL_LOCATION;
    private final static WebServiceException ESTOQUEWS_EXCEPTION;
    private final static QName ESTOQUEWS_QNAME = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/webservices-soap-jaxws-wildfly-0.0.1-SNAPSHOT/EstoqueWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ESTOQUEWS_WSDL_LOCATION = url;
        ESTOQUEWS_EXCEPTION = e;
    }

    public EstoqueWS_Service() {
        super(__getWsdlLocation(), ESTOQUEWS_QNAME);
    }

    public EstoqueWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ESTOQUEWS_QNAME, features);
    }

    public EstoqueWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ESTOQUEWS_QNAME);
    }

    public EstoqueWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ESTOQUEWS_QNAME, features);
    }

    public EstoqueWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EstoqueWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort() {
        return super.getPort(new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSPort"), EstoqueWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.estoque.caelum.com.br/", "EstoqueWSPort"), EstoqueWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ESTOQUEWS_EXCEPTION!= null) {
            throw ESTOQUEWS_EXCEPTION;
        }
        return ESTOQUEWS_WSDL_LOCATION;
    }

}
