
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>StartJob4Input complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StartJob4Input"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="settingsGroup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exceptionJob" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowRestart" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxSecondsIdle" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="inputHopper" type="{urn:dpcl:wsdl:2011-09-02}InputHopper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartJob4Input", propOrder = {
    "client",
    "jobId",
    "settingsGroup",
    "exceptionJob",
    "allowRestart",
    "maxSecondsIdle",
    "inputHopper"
})
public class StartJob4Input {

    @XmlElement(required = true)
    protected String client;
    @XmlSchemaType(name = "unsignedInt")
    protected long jobId;
    @XmlElement(required = true, defaultValue = "Group01")
    protected String settingsGroup;
    @XmlElement(defaultValue = "false")
    protected boolean exceptionJob;
    @XmlElement(defaultValue = "true")
    protected boolean allowRestart;
    @XmlElement(defaultValue = "600")
    @XmlSchemaType(name = "unsignedInt")
    protected long maxSecondsIdle;
    @XmlElement(required = true, defaultValue = "DPCL2:HopperDefault")
    protected QName inputHopper;

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
     * 获取jobId属性的值。
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * 设置jobId属性的值。
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
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
     * 获取exceptionJob属性的值。
     * 
     */
    public boolean isExceptionJob() {
        return exceptionJob;
    }

    /**
     * 设置exceptionJob属性的值。
     * 
     */
    public void setExceptionJob(boolean value) {
        this.exceptionJob = value;
    }

    /**
     * 获取allowRestart属性的值。
     * 
     */
    public boolean isAllowRestart() {
        return allowRestart;
    }

    /**
     * 设置allowRestart属性的值。
     * 
     */
    public void setAllowRestart(boolean value) {
        this.allowRestart = value;
    }

    /**
     * 获取maxSecondsIdle属性的值。
     * 
     */
    public long getMaxSecondsIdle() {
        return maxSecondsIdle;
    }

    /**
     * 设置maxSecondsIdle属性的值。
     * 
     */
    public void setMaxSecondsIdle(long value) {
        this.maxSecondsIdle = value;
    }

    /**
     * 获取inputHopper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInputHopper() {
        return inputHopper;
    }

    /**
     * 设置inputHopper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInputHopper(QName value) {
        this.inputHopper = value;
    }

}
