
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Sets up the trigger criteria and what contents are to be included in the response. Allows for very specific tuning of the desired information and trigger frequency.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>WaitForStatus2Input complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WaitForStatus2Input"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeConditions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeCounters" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeJobQueue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeNetworkAdapters" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeSensors" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeSettings" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeSupplies" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeTunnels" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expectedPowerState" type="{urn:dpcl:wsdl:2011-09-02}PowerState" minOccurs="0"/&gt;
 *         &lt;element name="expectedJobQueueState" type="{urn:dpcl:wsdl:2011-09-02}JobQueueState" minOccurs="0"/&gt;
 *         &lt;element name="expectedLockState" type="{urn:dpcl:wsdl:2011-09-02}LockState" minOccurs="0"/&gt;
 *         &lt;element name="minConditionMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="minSettingMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="minSensorMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="minSupplyMarker" type="{urn:dpcl:wsdl:2011-09-02}Marker"/&gt;
 *         &lt;element name="matchConditionClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchConditionJobId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="minConditionSeverity" type="{urn:dpcl:wsdl:2010-01-19}ConditionSeverity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitForStatus2Input", propOrder = {
    "includeConditions",
    "includeCounters",
    "includeJobQueue",
    "includeNetworkAdapters",
    "includeSensors",
    "includeSettings",
    "includeSupplies",
    "includeTunnels",
    "maxSeconds",
    "expectedPowerState",
    "expectedJobQueueState",
    "expectedLockState",
    "minConditionMarker",
    "minSettingMarker",
    "minSensorMarker",
    "minSupplyMarker",
    "matchConditionClient",
    "matchConditionJobId",
    "minConditionSeverity"
})
public class WaitForStatus2Input {

    @XmlElement(defaultValue = "true")
    protected boolean includeConditions;
    @XmlElement(defaultValue = "true")
    protected boolean includeCounters;
    @XmlElement(defaultValue = "true")
    protected boolean includeJobQueue;
    @XmlElement(defaultValue = "true")
    protected boolean includeNetworkAdapters;
    @XmlElement(defaultValue = "true")
    protected boolean includeSensors;
    @XmlElement(defaultValue = "true")
    protected boolean includeSettings;
    @XmlElement(defaultValue = "true")
    protected boolean includeSupplies;
    @XmlElement(defaultValue = "true")
    protected boolean includeTunnels;
    @XmlElement(defaultValue = "0")
    protected int maxSeconds;
    @XmlElement(nillable = true)
    protected QName expectedPowerState;
    @XmlElement(nillable = true)
    protected QName expectedJobQueueState;
    @XmlElement(nillable = true)
    protected QName expectedLockState;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedInt")
    protected long minConditionMarker;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedInt")
    protected long minSettingMarker;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedInt")
    protected long minSensorMarker;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedInt")
    protected long minSupplyMarker;
    @XmlElement(required = true, defaultValue = "boc")
    protected String matchConditionClient;
    @XmlElement(defaultValue = "0")
    @XmlSchemaType(name = "unsignedInt")
    protected long matchConditionJobId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConditionSeverity minConditionSeverity;

    /**
     * ��ȡincludeConditions���Ե�ֵ��
     * 
     */
    public boolean isIncludeConditions() {
        return includeConditions;
    }

    /**
     * ����includeConditions���Ե�ֵ��
     * 
     */
    public void setIncludeConditions(boolean value) {
        this.includeConditions = value;
    }

    /**
     * ��ȡincludeCounters���Ե�ֵ��
     * 
     */
    public boolean isIncludeCounters() {
        return includeCounters;
    }

    /**
     * ����includeCounters���Ե�ֵ��
     * 
     */
    public void setIncludeCounters(boolean value) {
        this.includeCounters = value;
    }

    /**
     * ��ȡincludeJobQueue���Ե�ֵ��
     * 
     */
    public boolean isIncludeJobQueue() {
        return includeJobQueue;
    }

    /**
     * ����includeJobQueue���Ե�ֵ��
     * 
     */
    public void setIncludeJobQueue(boolean value) {
        this.includeJobQueue = value;
    }

    /**
     * ��ȡincludeNetworkAdapters���Ե�ֵ��
     * 
     */
    public boolean isIncludeNetworkAdapters() {
        return includeNetworkAdapters;
    }

    /**
     * ����includeNetworkAdapters���Ե�ֵ��
     * 
     */
    public void setIncludeNetworkAdapters(boolean value) {
        this.includeNetworkAdapters = value;
    }

    /**
     * ��ȡincludeSensors���Ե�ֵ��
     * 
     */
    public boolean isIncludeSensors() {
        return includeSensors;
    }

    /**
     * ����includeSensors���Ե�ֵ��
     * 
     */
    public void setIncludeSensors(boolean value) {
        this.includeSensors = value;
    }

    /**
     * ��ȡincludeSettings���Ե�ֵ��
     * 
     */
    public boolean isIncludeSettings() {
        return includeSettings;
    }

    /**
     * ����includeSettings���Ե�ֵ��
     * 
     */
    public void setIncludeSettings(boolean value) {
        this.includeSettings = value;
    }

    /**
     * ��ȡincludeSupplies���Ե�ֵ��
     * 
     */
    public boolean isIncludeSupplies() {
        return includeSupplies;
    }

    /**
     * ����includeSupplies���Ե�ֵ��
     * 
     */
    public void setIncludeSupplies(boolean value) {
        this.includeSupplies = value;
    }

    /**
     * ��ȡincludeTunnels���Ե�ֵ��
     * 
     */
    public boolean isIncludeTunnels() {
        return includeTunnels;
    }

    /**
     * ����includeTunnels���Ե�ֵ��
     * 
     */
    public void setIncludeTunnels(boolean value) {
        this.includeTunnels = value;
    }

    /**
     * ��ȡmaxSeconds���Ե�ֵ��
     * 
     */
    public int getMaxSeconds() {
        return maxSeconds;
    }

    /**
     * ����maxSeconds���Ե�ֵ��
     * 
     */
    public void setMaxSeconds(int value) {
        this.maxSeconds = value;
    }

    /**
     * ��ȡexpectedPowerState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getExpectedPowerState() {
        return expectedPowerState;
    }

    /**
     * ����expectedPowerState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setExpectedPowerState(QName value) {
        this.expectedPowerState = value;
    }

    /**
     * ��ȡexpectedJobQueueState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getExpectedJobQueueState() {
        return expectedJobQueueState;
    }

    /**
     * ����expectedJobQueueState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setExpectedJobQueueState(QName value) {
        this.expectedJobQueueState = value;
    }

    /**
     * ��ȡexpectedLockState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getExpectedLockState() {
        return expectedLockState;
    }

    /**
     * ����expectedLockState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setExpectedLockState(QName value) {
        this.expectedLockState = value;
    }

    /**
     * ��ȡminConditionMarker���Ե�ֵ��
     * 
     */
    public long getMinConditionMarker() {
        return minConditionMarker;
    }

    /**
     * ����minConditionMarker���Ե�ֵ��
     * 
     */
    public void setMinConditionMarker(long value) {
        this.minConditionMarker = value;
    }

    /**
     * ��ȡminSettingMarker���Ե�ֵ��
     * 
     */
    public long getMinSettingMarker() {
        return minSettingMarker;
    }

    /**
     * ����minSettingMarker���Ե�ֵ��
     * 
     */
    public void setMinSettingMarker(long value) {
        this.minSettingMarker = value;
    }

    /**
     * ��ȡminSensorMarker���Ե�ֵ��
     * 
     */
    public long getMinSensorMarker() {
        return minSensorMarker;
    }

    /**
     * ����minSensorMarker���Ե�ֵ��
     * 
     */
    public void setMinSensorMarker(long value) {
        this.minSensorMarker = value;
    }

    /**
     * ��ȡminSupplyMarker���Ե�ֵ��
     * 
     */
    public long getMinSupplyMarker() {
        return minSupplyMarker;
    }

    /**
     * ����minSupplyMarker���Ե�ֵ��
     * 
     */
    public void setMinSupplyMarker(long value) {
        this.minSupplyMarker = value;
    }

    /**
     * ��ȡmatchConditionClient���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchConditionClient() {
        return matchConditionClient;
    }

    /**
     * ����matchConditionClient���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchConditionClient(String value) {
        this.matchConditionClient = value;
    }

    /**
     * ��ȡmatchConditionJobId���Ե�ֵ��
     * 
     */
    public long getMatchConditionJobId() {
        return matchConditionJobId;
    }

    /**
     * ����matchConditionJobId���Ե�ֵ��
     * 
     */
    public void setMatchConditionJobId(long value) {
        this.matchConditionJobId = value;
    }

    /**
     * ��ȡminConditionSeverity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ConditionSeverity }
     *     
     */
    public ConditionSeverity getMinConditionSeverity() {
        return minConditionSeverity;
    }

    /**
     * ����minConditionSeverity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionSeverity }
     *     
     */
    public void setMinConditionSeverity(ConditionSeverity value) {
        this.minConditionSeverity = value;
    }

}
