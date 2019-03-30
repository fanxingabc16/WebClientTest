
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.StatusTrigger;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Provides the response tailored to the filters on the input.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>WaitForStatus2Output complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WaitForStatus2Output"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trigger" type="{urn:dpcl:wsdl:2010-01-19}StatusTrigger"/&gt;
 *         &lt;element name="nextConditionMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="nextSettingMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="nextSensorMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="nextSupplyMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="status" type="{urn:dpcl:wsdl:2011-09-02}PrinterStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitForStatus2Output", propOrder = {
    "trigger",
    "nextConditionMarker",
    "nextSettingMarker",
    "nextSensorMarker",
    "nextSupplyMarker",
    "status"
})
public class WaitForStatus2Output {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusTrigger trigger;
    @XmlSchemaType(name = "unsignedInt")
    protected long nextConditionMarker;
    @XmlSchemaType(name = "unsignedInt")
    protected long nextSettingMarker;
    @XmlSchemaType(name = "unsignedInt")
    protected long nextSensorMarker;
    @XmlSchemaType(name = "unsignedInt")
    protected long nextSupplyMarker;
    @XmlElement(required = true)
    protected PrinterStatus status;

    /**
     * 获取trigger属性的值。
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
     * 设置trigger属性的值。
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
     * 获取nextConditionMarker属性的值。
     * 
     */
    public long getNextConditionMarker() {
        return nextConditionMarker;
    }

    /**
     * 设置nextConditionMarker属性的值。
     * 
     */
    public void setNextConditionMarker(long value) {
        this.nextConditionMarker = value;
    }

    /**
     * 获取nextSettingMarker属性的值。
     * 
     */
    public long getNextSettingMarker() {
        return nextSettingMarker;
    }

    /**
     * 设置nextSettingMarker属性的值。
     * 
     */
    public void setNextSettingMarker(long value) {
        this.nextSettingMarker = value;
    }

    /**
     * 获取nextSensorMarker属性的值。
     * 
     */
    public long getNextSensorMarker() {
        return nextSensorMarker;
    }

    /**
     * 设置nextSensorMarker属性的值。
     * 
     */
    public void setNextSensorMarker(long value) {
        this.nextSensorMarker = value;
    }

    /**
     * 获取nextSupplyMarker属性的值。
     * 
     */
    public long getNextSupplyMarker() {
        return nextSupplyMarker;
    }

    /**
     * 设置nextSupplyMarker属性的值。
     * 
     */
    public void setNextSupplyMarker(long value) {
        this.nextSupplyMarker = value;
    }

    /**
     * 获取status属性的值。
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
     * 设置status属性的值。
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
