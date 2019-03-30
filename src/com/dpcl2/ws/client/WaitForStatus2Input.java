
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
 * <p>WaitForStatus2Input complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取includeConditions属性的值。
     * 
     */
    public boolean isIncludeConditions() {
        return includeConditions;
    }

    /**
     * 设置includeConditions属性的值。
     * 
     */
    public void setIncludeConditions(boolean value) {
        this.includeConditions = value;
    }

    /**
     * 获取includeCounters属性的值。
     * 
     */
    public boolean isIncludeCounters() {
        return includeCounters;
    }

    /**
     * 设置includeCounters属性的值。
     * 
     */
    public void setIncludeCounters(boolean value) {
        this.includeCounters = value;
    }

    /**
     * 获取includeJobQueue属性的值。
     * 
     */
    public boolean isIncludeJobQueue() {
        return includeJobQueue;
    }

    /**
     * 设置includeJobQueue属性的值。
     * 
     */
    public void setIncludeJobQueue(boolean value) {
        this.includeJobQueue = value;
    }

    /**
     * 获取includeNetworkAdapters属性的值。
     * 
     */
    public boolean isIncludeNetworkAdapters() {
        return includeNetworkAdapters;
    }

    /**
     * 设置includeNetworkAdapters属性的值。
     * 
     */
    public void setIncludeNetworkAdapters(boolean value) {
        this.includeNetworkAdapters = value;
    }

    /**
     * 获取includeSensors属性的值。
     * 
     */
    public boolean isIncludeSensors() {
        return includeSensors;
    }

    /**
     * 设置includeSensors属性的值。
     * 
     */
    public void setIncludeSensors(boolean value) {
        this.includeSensors = value;
    }

    /**
     * 获取includeSettings属性的值。
     * 
     */
    public boolean isIncludeSettings() {
        return includeSettings;
    }

    /**
     * 设置includeSettings属性的值。
     * 
     */
    public void setIncludeSettings(boolean value) {
        this.includeSettings = value;
    }

    /**
     * 获取includeSupplies属性的值。
     * 
     */
    public boolean isIncludeSupplies() {
        return includeSupplies;
    }

    /**
     * 设置includeSupplies属性的值。
     * 
     */
    public void setIncludeSupplies(boolean value) {
        this.includeSupplies = value;
    }

    /**
     * 获取includeTunnels属性的值。
     * 
     */
    public boolean isIncludeTunnels() {
        return includeTunnels;
    }

    /**
     * 设置includeTunnels属性的值。
     * 
     */
    public void setIncludeTunnels(boolean value) {
        this.includeTunnels = value;
    }

    /**
     * 获取maxSeconds属性的值。
     * 
     */
    public int getMaxSeconds() {
        return maxSeconds;
    }

    /**
     * 设置maxSeconds属性的值。
     * 
     */
    public void setMaxSeconds(int value) {
        this.maxSeconds = value;
    }

    /**
     * 获取expectedPowerState属性的值。
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
     * 设置expectedPowerState属性的值。
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
     * 获取expectedJobQueueState属性的值。
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
     * 设置expectedJobQueueState属性的值。
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
     * 获取expectedLockState属性的值。
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
     * 设置expectedLockState属性的值。
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
     * 获取minConditionMarker属性的值。
     * 
     */
    public long getMinConditionMarker() {
        return minConditionMarker;
    }

    /**
     * 设置minConditionMarker属性的值。
     * 
     */
    public void setMinConditionMarker(long value) {
        this.minConditionMarker = value;
    }

    /**
     * 获取minSettingMarker属性的值。
     * 
     */
    public long getMinSettingMarker() {
        return minSettingMarker;
    }

    /**
     * 设置minSettingMarker属性的值。
     * 
     */
    public void setMinSettingMarker(long value) {
        this.minSettingMarker = value;
    }

    /**
     * 获取minSensorMarker属性的值。
     * 
     */
    public long getMinSensorMarker() {
        return minSensorMarker;
    }

    /**
     * 设置minSensorMarker属性的值。
     * 
     */
    public void setMinSensorMarker(long value) {
        this.minSensorMarker = value;
    }

    /**
     * 获取minSupplyMarker属性的值。
     * 
     */
    public long getMinSupplyMarker() {
        return minSupplyMarker;
    }

    /**
     * 设置minSupplyMarker属性的值。
     * 
     */
    public void setMinSupplyMarker(long value) {
        this.minSupplyMarker = value;
    }

    /**
     * 获取matchConditionClient属性的值。
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
     * 设置matchConditionClient属性的值。
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
     * 获取matchConditionJobId属性的值。
     * 
     */
    public long getMatchConditionJobId() {
        return matchConditionJobId;
    }

    /**
     * 设置matchConditionJobId属性的值。
     * 
     */
    public void setMatchConditionJobId(long value) {
        this.matchConditionJobId = value;
    }

    /**
     * 获取minConditionSeverity属性的值。
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
     * 设置minConditionSeverity属性的值。
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
