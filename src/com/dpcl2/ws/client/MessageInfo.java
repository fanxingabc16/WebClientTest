
package com.dpcl2.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Contains std::vector type DPCL__ParameterInfo*, DPCL__ParameterInfo*, DPCL2__MessageDataInfo*, DPCL2__MessageDataInfo*, and a xsd__string name - refer to typedef struct DPCL2__MessageInfo&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>MessageInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MessageInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestParameter" type="{urn:dpcl:wsdl:2010-01-19}ParameterInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="respondParameter" type="{urn:dpcl:wsdl:2010-01-19}ParameterInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requestData" type="{urn:dpcl:wsdl:2011-09-02}MessageDataInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="respondData" type="{urn:dpcl:wsdl:2011-09-02}MessageDataInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo", propOrder = {
    "requestParameter",
    "respondParameter",
    "requestData",
    "respondData",
    "name"
})
public class MessageInfo {

    @XmlElement(nillable = true)
    protected List<ParameterInfo> requestParameter;
    @XmlElement(nillable = true)
    protected List<ParameterInfo> respondParameter;
    @XmlElement(nillable = true)
    protected List<MessageDataInfo> requestData;
    @XmlElement(nillable = true)
    protected List<MessageDataInfo> respondData;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the requestParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterInfo }
     * 
     * 
     */
    public List<ParameterInfo> getRequestParameter() {
        if (requestParameter == null) {
            requestParameter = new ArrayList<ParameterInfo>();
        }
        return this.requestParameter;
    }

    /**
     * Gets the value of the respondParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterInfo }
     * 
     * 
     */
    public List<ParameterInfo> getRespondParameter() {
        if (respondParameter == null) {
            respondParameter = new ArrayList<ParameterInfo>();
        }
        return this.respondParameter;
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
     * {@link MessageDataInfo }
     * 
     * 
     */
    public List<MessageDataInfo> getRequestData() {
        if (requestData == null) {
            requestData = new ArrayList<MessageDataInfo>();
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
     * {@link MessageDataInfo }
     * 
     * 
     */
    public List<MessageDataInfo> getRespondData() {
        if (respondData == null) {
            respondData = new ArrayList<MessageDataInfo>();
        }
        return this.respondData;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
