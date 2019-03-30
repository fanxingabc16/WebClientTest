
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;A DPCL2 condition that has previously existed (Resolved), or currently exists (Unresolved), on the printer. These are always in the context of a job, and provide both information about issues that have occurred and trigger points to observe state change.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Condition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
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
    "primary",
    "notification"
})
public class Condition2 {

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
    protected boolean notification;

    /**
     * ��ȡcode���Ե�ֵ��
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * ����code���Ե�ֵ��
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * ��ȡseverity���Ե�ֵ��
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
     * ����severity���Ե�ֵ��
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
     * ��ȡstate���Ե�ֵ��
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
     * ����state���Ե�ֵ��
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
     * ��ȡmodule���Ե�ֵ��
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
     * ����module���Ե�ֵ��
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
     * ��ȡactionId���Ե�ֵ��
     * 
     */
    public long getActionId() {
        return actionId;
    }

    /**
     * ����actionId���Ե�ֵ��
     * 
     */
    public void setActionId(long value) {
        this.actionId = value;
    }

    /**
     * ��ȡdataId���Ե�ֵ��
     * 
     */
    public long getDataId() {
        return dataId;
    }

    /**
     * ����dataId���Ե�ֵ��
     * 
     */
    public void setDataId(long value) {
        this.dataId = value;
    }

    /**
     * ��ȡstartMarker���Ե�ֵ��
     * 
     */
    public long getStartMarker() {
        return startMarker;
    }

    /**
     * ����startMarker���Ե�ֵ��
     * 
     */
    public void setStartMarker(long value) {
        this.startMarker = value;
    }

    /**
     * ��ȡendMarker���Ե�ֵ��
     * 
     */
    public long getEndMarker() {
        return endMarker;
    }

    /**
     * ����endMarker���Ե�ֵ��
     * 
     */
    public void setEndMarker(long value) {
        this.endMarker = value;
    }

    /**
     * ��ȡprimary���Ե�ֵ��
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * ����primary���Ե�ֵ��
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
    }

    /**
     * ��ȡnotification���Ե�ֵ��
     * 
     */
    public boolean isNotification() {
        return notification;
    }

    /**
     * ����notification���Ե�ֵ��
     * 
     */
    public void setNotification(boolean value) {
        this.notification = value;
    }

}
