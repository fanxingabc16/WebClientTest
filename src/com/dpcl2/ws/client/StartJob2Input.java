
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Provides input to method putJob sufficient to start a print job - refer to typedef struct DPCL2__StartJob2Input&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>StartJob2Input complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="StartJob2Input"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="settingsGroup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exceptionJob" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowRestart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxSecondsIdle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartJob2Input", propOrder = {
    "client",
    "jobId",
    "settingsGroup",
    "exceptionJob",
    "allowRestart",
    "maxSecondsIdle"
})
public class StartJob2Input {

    @XmlElement(required = true)
    protected String client;
    @XmlSchemaType(name = "unsignedInt")
    protected long jobId;
    @XmlElement(required = true, defaultValue = "Group01")
    protected String settingsGroup;
    @XmlElement(defaultValue = "false")
    protected boolean exceptionJob;
    @XmlElement(defaultValue = "true")
    protected boolean allowRestart;
    @XmlElement(defaultValue = "600")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxSecondsIdle;

    /**
     * ��ȡclient���Ե�ֵ��
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
     * ����client���Ե�ֵ��
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
     * ��ȡjobId���Ե�ֵ��
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * ����jobId���Ե�ֵ��
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * ��ȡsettingsGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingsGroup() {
        return settingsGroup;
    }

    /**
     * ����settingsGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingsGroup(String value) {
        this.settingsGroup = value;
    }

    /**
     * ��ȡexceptionJob���Ե�ֵ��
     * 
     */
    public boolean isExceptionJob() {
        return exceptionJob;
    }

    /**
     * ����exceptionJob���Ե�ֵ��
     * 
     */
    public void setExceptionJob(boolean value) {
        this.exceptionJob = value;
    }

    /**
     * ��ȡallowRestart���Ե�ֵ��
     * 
     */
    public boolean isAllowRestart() {
        return allowRestart;
    }

    /**
     * ����allowRestart���Ե�ֵ��
     * 
     */
    public void setAllowRestart(boolean value) {
        this.allowRestart = value;
    }

    /**
     * ��ȡmaxSecondsIdle���Ե�ֵ��
     * 
     */
    public long getMaxSecondsIdle() {
        return maxSecondsIdle;
    }

    /**
     * ����maxSecondsIdle���Ե�ֵ��
     * 
     */
    public void setMaxSecondsIdle(long value) {
        this.maxSecondsIdle = value;
    }

}
