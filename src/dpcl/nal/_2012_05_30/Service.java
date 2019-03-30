
package dpcl.nal._2012_05_30;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Service的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Service"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICMP"/&gt;
 *     &lt;enumeration value="DPCL"/&gt;
 *     &lt;enumeration value="DPCLSecure"/&gt;
 *     &lt;enumeration value="DPM"/&gt;
 *     &lt;enumeration value="DPMSecure"/&gt;
 *     &lt;enumeration value="WebServer"/&gt;
 *     &lt;enumeration value="WebServerSecure"/&gt;
 *     &lt;enumeration value="SNMP"/&gt;
 *     &lt;enumeration value="CPX"/&gt;
 *     &lt;enumeration value="PLUGIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Service")
@XmlEnum
public enum Service {

    ICMP("ICMP"),
    DPCL("DPCL"),
    @XmlEnumValue("DPCLSecure")
    DPCL_SECURE("DPCLSecure"),
    DPM("DPM"),
    @XmlEnumValue("DPMSecure")
    DPM_SECURE("DPMSecure"),
    @XmlEnumValue("WebServer")
    WEB_SERVER("WebServer"),
    @XmlEnumValue("WebServerSecure")
    WEB_SERVER_SECURE("WebServerSecure"),
    SNMP("SNMP"),
    CPX("CPX"),
    PLUGIN("PLUGIN");
    private final String value;

    Service(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Service fromValue(String v) {
        for (Service c: Service.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
