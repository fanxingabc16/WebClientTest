
package dpcl.wsdl._2010_01_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Information to manage a request for status information - refer to struct DPCL__WaitForStatusInput&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>WaitForStatusInput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WaitForStatusInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxSeconds" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="minMarker" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="minSeverity" type="{urn:dpcl:wsdl:2010-01-19}ConditionSeverity"/&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="jobHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitForStatusInput", propOrder = {
    "maxSeconds",
    "minMarker",
    "minSeverity",
    "client",
    "jobId",
    "jobHistory"
})
public class WaitForStatusInput {

    @XmlSchemaType(name = "unsignedInt")
    protected long maxSeconds;
    @XmlSchemaType(name = "unsignedInt")
    protected long minMarker;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConditionSeverity minSeverity;
    @XmlElement(required = true)
    protected String client;
    @XmlSchemaType(name = "unsignedInt")
    protected long jobId;
    protected boolean jobHistory;

    /**
     * 获取maxSeconds属性的值。
     * 
     */
    public long getMaxSeconds() {
        return maxSeconds;
    }

    /**
     * 设置maxSeconds属性的值。
     * 
     */
    public void setMaxSeconds(long value) {
        this.maxSeconds = value;
    }

    /**
     * 获取minMarker属性的值。
     * 
     */
    public long getMinMarker() {
        return minMarker;
    }

    /**
     * 设置minMarker属性的值。
     * 
     */
    public void setMinMarker(long value) {
        this.minMarker = value;
    }

    /**
     * 获取minSeverity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConditionSeverity }
     *     
     */
    public ConditionSeverity getMinSeverity() {
        return minSeverity;
    }

    /**
     * 设置minSeverity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSeverity }
     *     
     */
    public void setMinSeverity(ConditionSeverity value) {
        this.minSeverity = value;
    }

    /**
     * 获取client属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * 设置client属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * 获取jobId属性的值。
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * 设置jobId属性的值。
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * 获取jobHistory属性的值。
     * 
     */
    public boolean isJobHistory() {
        return jobHistory;
    }

    /**
     * 设置jobHistory属性的值。
     * 
     */
    public void setJobHistory(boolean value) {
        this.jobHistory = value;
    }

}
