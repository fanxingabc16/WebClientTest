
package dpcl.wsdl._2010_01_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Information from an attempt to start a job - refer to struct DPCL__StartJobOutput&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>StartJobOutput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StartJobOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="millisecondsToWait" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="optionsHash" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="settingsHash" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartJobOutput", propOrder = {
    "success",
    "millisecondsToWait",
    "optionsHash",
    "settingsHash"
})
public class StartJobOutput {

    protected boolean success;
    @XmlSchemaType(name = "unsignedInt")
    protected long millisecondsToWait;
    @XmlSchemaType(name = "unsignedInt")
    protected long optionsHash;
    @XmlSchemaType(name = "unsignedInt")
    protected long settingsHash;

    /**
     * 获取success属性的值。
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 设置success属性的值。
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * 获取millisecondsToWait属性的值。
     * 
     */
    public long getMillisecondsToWait() {
        return millisecondsToWait;
    }

    /**
     * 设置millisecondsToWait属性的值。
     * 
     */
    public void setMillisecondsToWait(long value) {
        this.millisecondsToWait = value;
    }

    /**
     * 获取optionsHash属性的值。
     * 
     */
    public long getOptionsHash() {
        return optionsHash;
    }

    /**
     * 设置optionsHash属性的值。
     * 
     */
    public void setOptionsHash(long value) {
        this.optionsHash = value;
    }

    /**
     * 获取settingsHash属性的值。
     * 
     */
    public long getSettingsHash() {
        return settingsHash;
    }

    /**
     * 设置settingsHash属性的值。
     * 
     */
    public void setSettingsHash(long value) {
        this.settingsHash = value;
    }

}
