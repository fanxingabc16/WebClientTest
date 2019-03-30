
package dpcl.wsdl._2010_01_19;

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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Obtains condition, counter, job, tunnel, adapter, sensor, settingsGroup, supply, mode, state, powerState, jobQueueState, lockState, secondsOn, optionsHash - refer to struct DPCL__PrinterStatus&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>PrinterStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PrinterStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="counter" type="{urn:dpcl:wsdl:2010-01-19}Counter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="condition" type="{urn:dpcl:wsdl:2010-01-19}Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supply" type="{urn:dpcl:wsdl:2010-01-19}SupplyStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="job" type="{urn:dpcl:wsdl:2010-01-19}JobStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{urn:dpcl:wsdl:2010-01-19}PrinterMode"/&gt;
 *         &lt;element name="state" type="{urn:dpcl:wsdl:2010-01-19}PrinterState"/&gt;
 *         &lt;element name="secondsOn" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="optionsHash" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrinterStatus", propOrder = {
    "counter",
    "condition",
    "supply",
    "job",
    "mode",
    "state",
    "secondsOn",
    "optionsHash"
})
public class PrinterStatus {

    @XmlElement(nillable = true)
    protected List<Counter> counter;
    @XmlElement(nillable = true)
    protected List<Condition> condition;
    @XmlElement(nillable = true)
    protected List<SupplyStatus> supply;
    @XmlElement(nillable = true)
    protected List<JobStatus> job;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrinterMode mode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrinterState state;
    @XmlSchemaType(name = "unsignedInt")
    protected long secondsOn;
    @XmlSchemaType(name = "unsignedInt")
    protected long optionsHash;

    /**
     * Gets the value of the counter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Counter }
     * 
     * 
     */
    public List<Counter> getCounter() {
        if (counter == null) {
            counter = new ArrayList<Counter>();
        }
        return this.counter;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Condition }
     * 
     * 
     */
    public List<Condition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<Condition>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the supply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyStatus }
     * 
     * 
     */
    public List<SupplyStatus> getSupply() {
        if (supply == null) {
            supply = new ArrayList<SupplyStatus>();
        }
        return this.supply;
    }

    /**
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobStatus }
     * 
     * 
     */
    public List<JobStatus> getJob() {
        if (job == null) {
            job = new ArrayList<JobStatus>();
        }
        return this.job;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrinterMode }
     *     
     */
    public PrinterMode getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrinterMode }
     *     
     */
    public void setMode(PrinterMode value) {
        this.mode = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrinterState }
     *     
     */
    public PrinterState getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrinterState }
     *     
     */
    public void setState(PrinterState value) {
        this.state = value;
    }

    /**
     * 获取secondsOn属性的值。
     * 
     */
    public long getSecondsOn() {
        return secondsOn;
    }

    /**
     * 设置secondsOn属性的值。
     * 
     */
    public void setSecondsOn(long value) {
        this.secondsOn = value;
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

}
