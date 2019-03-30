
package dpcl.update._2011_10_19;

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
 * <p>ImageSummary complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
@XmlType(name = "ImageSummary", propOrder = {
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
     * ��ȡlabel���Ե�ֵ��
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
     * ����label���Ե�ֵ��
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
     * ��ȡboard���Ե�ֵ��
     * 
     */
    public long getBoard() {
        return board;
    }

    /**
     * ����board���Ե�ֵ��
     * 
     */
    public void setBoard(long value) {
        this.board = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     */
    public long getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     */
    public void setCategory(long value) {
        this.category = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * ��ȡsize���Ե�ֵ��
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * ����size���Ե�ֵ��
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * ��ȡsegmentCount���Ե�ֵ��
     * 
     */
    public long getSegmentCount() {
        return segmentCount;
    }

    /**
     * ����segmentCount���Ե�ֵ��
     * 
     */
    public void setSegmentCount(long value) {
        this.segmentCount = value;
    }

    /**
     * ��ȡminCurrentVersion���Ե�ֵ��
     * 
     */
    public long getMinCurrentVersion() {
        return minCurrentVersion;
    }

    /**
     * ����minCurrentVersion���Ե�ֵ��
     * 
     */
    public void setMinCurrentVersion(long value) {
        this.minCurrentVersion = value;
    }

    /**
     * ��ȡmaxCurrentVersion���Ե�ֵ��
     * 
     */
    public long getMaxCurrentVersion() {
        return maxCurrentVersion;
    }

    /**
     * ����maxCurrentVersion���Ե�ֵ��
     * 
     */
    public void setMaxCurrentVersion(long value) {
        this.maxCurrentVersion = value;
    }

    /**
     * ��ȡencrypted���Ե�ֵ��
     * 
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * ����encrypted���Ե�ֵ��
     * 
     */
    public void setEncrypted(boolean value) {
        this.encrypted = value;
    }

    /**
     * ��ȡchecksum���Ե�ֵ��
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
     * ����checksum���Ե�ֵ��
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
     * ��ȡsignature���Ե�ֵ��
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
     * ����signature���Ե�ֵ��
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