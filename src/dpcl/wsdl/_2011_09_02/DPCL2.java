package dpcl.wsdl._2011_09_02;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-03-30T12:49:44.107+08:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "DPCL2",
                  wsdlLocation = "file:/d:/1/DPCL2.wsdl",
                  targetNamespace = "urn:dpcl:wsdl:2011-09-02")
public class DPCL2 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:dpcl:wsdl:2011-09-02", "DPCL2");
    public final static QName DPCL2SecurePort = new QName("urn:dpcl:wsdl:2011-09-02", "DPCL2SecurePort");
    public final static QName DPCL2Port = new QName("urn:dpcl:wsdl:2011-09-02", "DPCL2Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/d:/1/DPCL2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DPCL2.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/d:/1/DPCL2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DPCL2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DPCL2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DPCL2() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns DPCL2PortType
     */
    @WebEndpoint(name = "DPCL2SecurePort")
    public DPCL2PortType getDPCL2SecurePort() {
        return super.getPort(DPCL2SecurePort, DPCL2PortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DPCL2PortType
     */
    @WebEndpoint(name = "DPCL2SecurePort")
    public DPCL2PortType getDPCL2SecurePort(WebServiceFeature... features) {
        return super.getPort(DPCL2SecurePort, DPCL2PortType.class, features);
    }


    /**
     *
     * @return
     *     returns DPCL2PortType
     */
    @WebEndpoint(name = "DPCL2Port")
    public DPCL2PortType getDPCL2Port() {
        return super.getPort(DPCL2Port, DPCL2PortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DPCL2PortType
     */
    @WebEndpoint(name = "DPCL2Port")
    public DPCL2PortType getDPCL2Port(WebServiceFeature... features) {
        return super.getPort(DPCL2Port, DPCL2PortType.class, features);
    }

}