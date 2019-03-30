
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>StartJob4Input complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡjobId���Ե�ֵ��
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * ����jobId���Ե�ֵ��
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
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
     * ��ȡexceptionJob���Ե�ֵ��
     * 
     */
    public boolean isExceptionJob() {
        return exceptionJob;
    }

    /**
     * ����exceptionJob���Ե�ֵ��
     * 
     */
    public void setExceptionJob(boolean value) {
        this.exceptionJob = value;
    }

    /**
     * ��ȡallowRestart���Ե�ֵ��
     * 
     */
    public boolean isAllowRestart() {
        return allowRestart;
    }

    /**
     * ����allowRestart���Ե�ֵ��
     * 
     */
    public void setAllowRestart(boolean value) {
        this.allowRestart = value;
    }

    /**
     * ��ȡmaxSecondsIdle���Ե�ֵ��
     * 
     */
    public long getMaxSecondsIdle() {
        return maxSecondsIdle;
    }

    /**
     * ����maxSecondsIdle���Ե�ֵ��
     * 
     */
    public void setMaxSecondsIdle(long value) {
        this.maxSecondsIdle = value;
    }

    /**
     * ��ȡinputHopper���Ե�ֵ��
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
     * ����inputHopper���Ե�ֵ��
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
