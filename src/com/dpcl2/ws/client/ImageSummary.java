
package com.dpcl2.ws.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Update ImageSummary - refer to typedef struct DPCLUpdate__ImageSummary, which among its members contains a checksum and a signature&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>ImageSummary complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImageSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="board" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="segmentCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="minCurrentVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="maxCurrentVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageSummary", namespace = "urn:dpcl:update:2011-10-19", propOrder = {
    "label",
    "board",
    "category",
    "version",
    "size",
    "segmentCount",
    "minCurrentVersion",
    "maxCurrentVersion",
    "encrypted",
    "checksum",
    "signature",
    "any"
})
public class ImageSummary {

    @XmlElement(required = true)
    protected String label;
    @XmlSchemaType(name = "unsignedInt")
    protected long board;
    @XmlSchemaType(name = "unsignedInt")
    protected long category;
    @XmlSchemaType(name = "unsignedInt")
    protected long version;
    @XmlSchemaType(name = "unsignedInt")
    protected long size;
    @XmlSchemaType(name = "unsignedInt")
    protected long segmentCount;
    @XmlSchemaType(name = "unsignedInt")
    protected long minCurrentVersion;
    @XmlSchemaType(name = "unsignedInt")
    protected long maxCurrentVersion;
    protected boolean encrypted;
    @XmlElement(required = true)
    protected String checksum;
    @XmlElement(required = true)
    protected String signature;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取label属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * 获取board属性的值。
     * 
     */
    public long getBoard() {
        return board;
    }

    /**
     * 设置board属性的值。
     * 
     */
    public void setBoard(long value) {
        this.board = value;
    }

    /**
     * 获取category属性的值。
     * 
     */
    public long getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     */
    public void setCategory(long value) {
        this.category = value;
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
     * 获取size属性的值。
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * 获取segmentCount属性的值。
     * 
     */
    public long getSegmentCount() {
        return segmentCount;
    }

    /**
     * 设置segmentCount属性的值。
     * 
     */
    public void setSegmentCount(long value) {
        this.segmentCount = value;
    }

    /**
     * 获取minCurrentVersion属性的值。
     * 
     */
    public long getMinCurrentVersion() {
        return minCurrentVersion;
    }

    /**
     * 设置minCurrentVersion属性的值。
     * 
     */
    public void setMinCurrentVersion(long value) {
        this.minCurrentVersion = value;
    }

    /**
     * 获取maxCurrentVersion属性的值。
     * 
     */
    public long getMaxCurrentVersion() {
        return maxCurrentVersion;
    }

    /**
     * 设置maxCurrentVersion属性的值。
     * 
     */
    public void setMaxCurrentVersion(long value) {
        this.maxCurrentVersion = value;
    }

    /**
     * 获取encrypted属性的值。
     * 
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * 设置encrypted属性的值。
     * 
     */
    public void setEncrypted(boolean value) {
        this.encrypted = value;
    }

    /**
     * 获取checksum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * 设置checksum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * 获取signature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置signature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
