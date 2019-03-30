
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;A DPCL condition that has previously existed (Resolved), or currently exists (Unresolved), on the printer. These are always in the context of a job, and provide both information about issues that have occurred and trigger points to observe state change.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Condition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Condition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="severity" type="{urn:dpcl:wsdl:2010-01-19}ConditionSeverity"/&gt;
 *         &lt;element name="state" type="{urn:dpcl:wsdl:2010-01-19}ConditionState"/&gt;
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="startMarker" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="endMarker" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", namespace = "urn:dpcl:wsdl:2010-01-19", propOrder = {
    "code",
    "severity",
    "state",
    "module",
    "client",
    "jobId",
    "actionId",
    "dataId",
    "startMarker",
    "endMarker",
    "primary"
})
public class Condition {

    @XmlSchemaType(name = "unsignedInt")
    protected long code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConditionSeverity severity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConditionState state;
    @XmlElement(required = true)
    protected String module;
    @XmlElement(required = true)
    protected String client;
    @XmlSchemaType(name = "unsignedInt")
    protected long jobId;
    @XmlSchemaType(name = "unsignedInt")
    protected long actionId;
    @XmlSchemaType(name = "unsignedInt")
    protected long dataId;
    @XmlSchemaType(name = "unsignedInt")
    protected long startMarker;
    @XmlSchemaType(name = "unsignedInt")
    protected long endMarker;
    protected boolean primary;

    /**
     * 获取code属性的值。
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * 获取severity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConditionSeverity }
     *     
     */
    public ConditionSeverity getSeverity() {
        return severity;
    }

    /**
     * 设置severity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSeverity }
     *     
     */
    public void setSeverity(ConditionSeverity value) {
        this.severity = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConditionState }
     *     
     */
    public ConditionState getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionState }
     *     
     */
    public void setState(ConditionState value) {
        this.state = value;
    }

    /**
     * 获取module属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置module属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
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
     * 获取actionId属性的值。
     * 
     */
    public long getActionId() {
        return actionId;
    }

    /**
     * 设置actionId属性的值。
     * 
     */
    public void setActionId(long value) {
        this.actionId = value;
    }

    /**
     * 获取dataId属性的值。
     * 
     */
    public long getDataId() {
        return dataId;
    }

    /**
     * 设置dataId属性的值。
     * 
     */
    public void setDataId(long value) {
        this.dataId = value;
    }

    /**
     * 获取startMarker属性的值。
     * 
     */
    public long getStartMarker() {
        return startMarker;
    }

    /**
     * 设置startMarker属性的值。
     * 
     */
    public void setStartMarker(long value) {
        this.startMarker = value;
    }

    /**
     * 获取endMarker属性的值。
     * 
     */
    public long getEndMarker() {
        return endMarker;
    }

    /**
     * 设置endMarker属性的值。
     * 
     */
    public void setEndMarker(long value) {
        this.endMarker = value;
    }

    /**
     * 获取primary属性的值。
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * 设置primary属性的值。
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

}
