
package dpcl.emboss._2011_06_03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Emboss line, refer to typedef struct DPCLEmboss__Line&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>Line complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Line"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="horz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vert" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stringData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "font",
    "horz",
    "vert",
    "stringData"
})
public class Line {

    @XmlElement(required = true)
    protected String font;
    @XmlElement(required = true)
    protected String horz;
    @XmlElement(required = true)
    protected String vert;
    @XmlElement(required = true)
    protected String stringData;
    @XmlAttribute(name = "number", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long number;

    /**
     * ��ȡfont���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFont() {
        return font;
    }

    /**
     * ����font���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFont(String value) {
        this.font = value;
    }

    /**
     * ��ȡhorz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorz() {
        return horz;
    }

    /**
     * ����horz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorz(String value) {
        this.horz = value;
    }

    /**
     * ��ȡvert���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVert() {
        return vert;
    }

    /**
     * ����vert���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVert(String value) {
        this.vert = value;
    }

    /**
     * ��ȡstringData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringData() {
        return stringData;
    }

    /**
     * ����stringData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringData(String value) {
        this.stringData = value;
    }

    /**
     * ��ȡnumber���Ե�ֵ��
     * 
     */
    public long getNumber() {
        return number;
    }

    /**
     * ����number���Ե�ֵ��
     * 
     */
    public void setNumber(long value) {
        this.number = value;
    }

}