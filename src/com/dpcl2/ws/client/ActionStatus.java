
package com.dpcl2.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;An action within a job context for DPCL.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>ActionStatus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ActionStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{urn:dpcl:wsdl:2010-01-19}Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requestData" type="{urn:dpcl:wsdl:2010-01-19}DataStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="respondData" type="{urn:dpcl:wsdl:2010-01-19}DataStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="queuePosition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="state" type="{urn:dpcl:wsdl:2010-01-19}ActionState"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionStatus", namespace = "urn:dpcl:wsdl:2010-01-19", propOrder = {
    "parameter",
    "requestData",
    "respondData",
    "id",
    "type",
    "module",
    "queuePosition",
    "state"
})
public class ActionStatus {

    @XmlElement(nillable = true)
    protected List<Parameter> parameter;
    @XmlElement(nillable = true)
    protected List<DataStatus> requestData;
    @XmlElement(nillable = true)
    protected List<DataStatus> respondData;
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String module;
    protected int queuePosition;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActionState state;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the requestData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataStatus }
     * 
     * 
     */
    public List<DataStatus> getRequestData() {
        if (requestData == null) {
            requestData = new ArrayList<DataStatus>();
        }
        return this.requestData;
    }

    /**
     * Gets the value of the respondData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataStatus }
     * 
     * 
     */
    public List<DataStatus> getRespondData() {
        if (respondData == null) {
            respondData = new ArrayList<DataStatus>();
        }
        return this.respondData;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * ��ȡqueuePosition���Ե�ֵ��
     * 
     */
    public int getQueuePosition() {
        return queuePosition;
    }

    /**
     * ����queuePosition���Ե�ֵ��
     * 
     */
    public void setQueuePosition(int value) {
        this.queuePosition = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ActionState }
     *     
     */
    public ActionState getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ActionState }
     *     
     */
    public void setState(ActionState value) {
        this.state = value;
    }

}