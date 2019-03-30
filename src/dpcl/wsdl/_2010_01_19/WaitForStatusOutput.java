
package dpcl.wsdl._2010_01_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Returns trigger, nextMarker, and DPCL__PrinterStatus - refer to struct DPCL__WaitForStatusOutput&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>WaitForStatusOutput complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WaitForStatusOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trigger" type="{urn:dpcl:wsdl:2010-01-19}StatusTrigger"/&gt;
 *         &lt;element name="nextMarker" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="status" type="{urn:dpcl:wsdl:2010-01-19}PrinterStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitForStatusOutput", propOrder = {
    "trigger",
    "nextMarker",
    "status"
})
public class WaitForStatusOutput {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusTrigger trigger;
    @XmlSchemaType(name = "unsignedInt")
    protected long nextMarker;
    @XmlElement(required = true)
    protected PrinterStatus status;

    /**
     * ��ȡtrigger���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StatusTrigger }
     *     
     */
    public StatusTrigger getTrigger() {
        return trigger;
    }

    /**
     * ����trigger���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTrigger }
     *     
     */
    public void setTrigger(StatusTrigger value) {
        this.trigger = value;
    }

    /**
     * ��ȡnextMarker���Ե�ֵ��
     * 
     */
    public long getNextMarker() {
        return nextMarker;
    }

    /**
     * ����nextMarker���Ե�ֵ��
     * 
     */
    public void setNextMarker(long value) {
        this.nextMarker = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PrinterStatus }
     *     
     */
    public PrinterStatus getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PrinterStatus }
     *     
     */
    public void setStatus(PrinterStatus value) {
        this.status = value;
    }

}
