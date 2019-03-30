
package dpcl.wheel._2011_06_03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Wheel line - refer to typedef struct DPCLWheel__Wheel, which among its members contains an array of std::vectors of type DPCLWheel__Line*&lt;/p&gt;
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
 *         &lt;element name="ascii1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ascii2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ascii3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="font" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="upper" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lower" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "ascii1",
    "ascii2",
    "ascii3",
    "font",
    "upper",
    "lower",
    "type"
})
public class Line {

    @XmlElement(required = true)
    protected String ascii1;
    @XmlElement(required = true)
    protected String ascii2;
    @XmlElement(required = true)
    protected String ascii3;
    @XmlElement(required = true)
    protected String font;
    @XmlElement(required = true)
    protected String upper;
    @XmlElement(required = true)
    protected String lower;
    @XmlElement(required = true)
    protected String type;
    @XmlAttribute(name = "number", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long number;

    /**
     * ��ȡascii1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscii1() {
        return ascii1;
    }

    /**
     * ����ascii1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscii1(String value) {
        this.ascii1 = value;
    }

    /**
     * ��ȡascii2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscii2() {
        return ascii2;
    }

    /**
     * ����ascii2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscii2(String value) {
        this.ascii2 = value;
    }

    /**
     * ��ȡascii3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscii3() {
        return ascii3;
    }

    /**
     * ����ascii3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscii3(String value) {
        this.ascii3 = value;
    }

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
     * ��ȡupper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpper() {
        return upper;
    }

    /**
     * ����upper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpper(String value) {
        this.upper = value;
    }

    /**
     * ��ȡlower���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLower() {
        return lower;
    }

    /**
     * ����lower���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLower(String value) {
        this.lower = value;
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
