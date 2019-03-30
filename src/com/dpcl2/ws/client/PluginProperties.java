
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;This doubles as the root element for Properties.xml - refer to typedef struct DPCL2__PluginProperties, which doubles as the root element for Properties.xml.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>PluginProperties complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PluginProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{urn:dpcl:wsdl:2011-09-02}Version"/&gt;
 *         &lt;element name="productCode" type="{urn:dpcl:wsdl:2011-09-02}ProductCode"/&gt;
 *         &lt;element name="specialCode" type="{urn:dpcl:wsdl:2011-09-02}SpecialCode"/&gt;
 *         &lt;element name="regionCode" type="{urn:dpcl:wsdl:2011-09-02}RegionCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PluginProperties", propOrder = {
    "name",
    "version",
    "productCode",
    "specialCode",
    "regionCode"
})
public class PluginProperties {

    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "unsignedInt")
    protected long version;
    @XmlSchemaType(name = "unsignedInt")
    protected long productCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long specialCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long regionCode;

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

    /**
     * 获取version属性的值。
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * 获取productCode属性的值。
     * 
     */
    public long getProductCode() {
        return productCode;
    }

    /**
     * 设置productCode属性的值。
     * 
     */
    public void setProductCode(long value) {
        this.productCode = value;
    }

    /**
     * 获取specialCode属性的值。
     * 
     */
    public long getSpecialCode() {
        return specialCode;
    }

    /**
     * 设置specialCode属性的值。
     * 
     */
    public void setSpecialCode(long value) {
        this.specialCode = value;
    }

    /**
     * 获取regionCode属性的值。
     * 
     */
    public long getRegionCode() {
        return regionCode;
    }

    /**
     * 设置regionCode属性的值。
     * 
     */
    public void setRegionCode(long value) {
        this.regionCode = value;
    }

}
