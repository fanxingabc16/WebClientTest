
package dpcl.wsdl._2011_09_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import dpcl.wsdl._2010_01_19.JobType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;A job context in the printer, which contains actions and data.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>JobStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JobStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{urn:dpcl:wsdl:2011-09-02}ActionStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="state" type="{urn:dpcl:wsdl:2011-09-02}JobState"/&gt;
 *         &lt;element name="type" type="{urn:dpcl:wsdl:2010-01-19}JobType"/&gt;
 *         &lt;element name="queuePosition" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="settingsGroup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="settingsHash" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="restartCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="takingActions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStatus", propOrder = {
    "action",
    "client",
    "id",
    "state",
    "type",
    "queuePosition",
    "settingsGroup",
    "settingsHash",
    "restartCount",
    "takingActions"
})
public class JobStatus {

    @XmlElement(nillable = true)
    protected List<ActionStatus> action;
    @XmlElement(required = true)
    protected String client;
    @XmlSchemaType(name = "unsignedInt")
    protected long id;
    @XmlElement(required = true)
    protected QName state;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected JobType type;
    protected int queuePosition;
    @XmlElement(required = true)
    protected String settingsGroup;
    @XmlSchemaType(name = "unsignedInt")
    protected long settingsHash;
    @XmlSchemaType(name = "unsignedInt")
    protected long restartCount;
    protected boolean takingActions;

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionStatus }
     * 
     * 
     */
    public List<ActionStatus> getAction() {
        if (action == null) {
            action = new ArrayList<ActionStatus>();
        }
        return this.action;
    }

    /**
     * 获取client属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * 设置client属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * 获取id属性的值。
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setState(QName value) {
        this.state = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setType(JobType value) {
        this.type = value;
    }

    /**
     * 获取queuePosition属性的值。
     * 
     */
    public int getQueuePosition() {
        return queuePosition;
    }

    /**
     * 设置queuePosition属性的值。
     * 
     */
    public void setQueuePosition(int value) {
        this.queuePosition = value;
    }

    /**
     * 获取settingsGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingsGroup() {
        return settingsGroup;
    }

    /**
     * 设置settingsGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingsGroup(String value) {
        this.settingsGroup = value;
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

    /**
     * 获取restartCount属性的值。
     * 
     */
    public long getRestartCount() {
        return restartCount;
    }

    /**
     * 设置restartCount属性的值。
     * 
     */
    public void setRestartCount(long value) {
        this.restartCount = value;
    }

    /**
     * 获取takingActions属性的值。
     * 
     */
    public boolean isTakingActions() {
        return takingActions;
    }

    /**
     * 设置takingActions属性的值。
     * 
     */
    public void setTakingActions(boolean value) {
        this.takingActions = value;
    }

}
