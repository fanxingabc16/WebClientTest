
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Information from an attempt to start a job - refer to typedef struct DPCL2__StartJob2Output&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>StartJob3Output complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StartJob3Output"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="millisecondsToWait" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="optionsHash" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="settingsHash" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="printerState" type="{urn:dpcl:wsdl:2010-01-19}PrinterState"/&gt;
 *         &lt;element name="powerState" type="{urn:dpcl:wsdl:2011-09-02}PowerState"/&gt;
 *         &lt;element name="jobQueueState" type="{urn:dpcl:wsdl:2011-09-02}JobQueueState"/&gt;
 *         &lt;element name="lockState" type="{urn:dpcl:wsdl:2011-09-02}LockState"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartJob3Output", propOrder = {
    "success",
    "millisecondsToWait",
    "optionsHash",
    "settingsHash",
    "printerState",
    "powerState",
    "jobQueueState",
    "lockState"
})
public class StartJob3Output {

    protected boolean success;
    @XmlSchemaType(name = "unsignedInt")
    protected long millisecondsToWait;
    @XmlSchemaType(name = "unsignedInt")
    protected long optionsHash;
    @XmlSchemaType(name = "unsignedInt")
    protected long settingsHash;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrinterState printerState;
    @XmlElement(required = true)
    protected QName powerState;
    @XmlElement(required = true)
    protected QName jobQueueState;
    @XmlElement(required = true)
    protected QName lockState;

    /**
     * 获取success属性的值。
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 设置success属性的值。
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * 获取millisecondsToWait属性的值。
     * 
     */
    public long getMillisecondsToWait() {
        return millisecondsToWait;
    }

    /**
     * 设置millisecondsToWait属性的值。
     * 
     */
    public void setMillisecondsToWait(long value) {
        this.millisecondsToWait = value;
    }

    /**
     * 获取optionsHash属性的值。
     * 
     */
    public long getOptionsHash() {
        return optionsHash;
    }

    /**
     * 设置optionsHash属性的值。
     * 
     */
    public void setOptionsHash(long value) {
        this.optionsHash = value;
    }

    /**
     * 获取settingsHash属性的值。
     * 
     */
    public long getSettingsHash() {
        return settingsHash;
    }

    /**
     * 设置settingsHash属性的值。
     * 
     */
    public void setSettingsHash(long value) {
        this.settingsHash = value;
    }

    /**
     * 获取printerState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrinterState }
     *     
     */
    public PrinterState getPrinterState() {
        return printerState;
    }

    /**
     * 设置printerState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrinterState }
     *     
     */
    public void setPrinterState(PrinterState value) {
        this.printerState = value;
    }

    /**
     * 获取powerState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getPowerState() {
        return powerState;
    }

    /**
     * 设置powerState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setPowerState(QName value) {
        this.powerState = value;
    }

    /**
     * 获取jobQueueState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getJobQueueState() {
        return jobQueueState;
    }

    /**
     * 设置jobQueueState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setJobQueueState(QName value) {
        this.jobQueueState = value;
    }

    /**
     * 获取lockState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLockState() {
        return lockState;
    }

    /**
     * 设置lockState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLockState(QName value) {
        this.lockState = value;
    }

}
