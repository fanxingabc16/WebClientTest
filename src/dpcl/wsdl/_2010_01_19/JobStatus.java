
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;A job context in the printer, which contains actions and data.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>JobStatus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="JobStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{urn:dpcl:wsdl:2010-01-19}ActionStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="state" type="{urn:dpcl:wsdl:2010-01-19}JobState"/&gt;
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
    @XmlSchemaType(name = "string")
    protected JobState state;
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
     * ��ȡclient���Ե�ֵ��
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
     * ����client���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobState }
     *     
     */
    public JobState getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobState }
     *     
     */
    public void setState(JobState value) {
        this.state = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡqueuePosition���Ե�ֵ��
     * 
     */
    public int getQueuePosition() {
        return queuePosition;
    }

    /**
     * ����queuePosition���Ե�ֵ��
     * 
     */
    public void setQueuePosition(int value) {
        this.queuePosition = value;
    }

    /**
     * ��ȡsettingsGroup���Ե�ֵ��
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
     * ����settingsGroup���Ե�ֵ��
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
     * ��ȡsettingsHash���Ե�ֵ��
     * 
     */
    public long getSettingsHash() {
        return settingsHash;
    }

    /**
     * ����settingsHash���Ե�ֵ��
     * 
     */
    public void setSettingsHash(long value) {
        this.settingsHash = value;
    }

    /**
     * ��ȡrestartCount���Ե�ֵ��
     * 
     */
    public long getRestartCount() {
        return restartCount;
    }

    /**
     * ����restartCount���Ե�ֵ��
     * 
     */
    public void setRestartCount(long value) {
        this.restartCount = value;
    }

    /**
     * ��ȡtakingActions���Ե�ֵ��
     * 
     */
    public boolean isTakingActions() {
        return takingActions;
    }

    /**
     * ����takingActions���Ե�ֵ��
     * 
     */
    public void setTakingActions(boolean value) {
        this.takingActions = value;
    }

}
