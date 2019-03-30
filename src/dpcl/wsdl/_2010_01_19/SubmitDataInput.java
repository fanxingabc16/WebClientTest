
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Information to submit data - refer to struct DPCL__SubmitDataInput&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>SubmitDataInput complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SubmitDataInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{urn:dpcl:wsdl:2010-01-19}Parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="attachment" type="{urn:dpcl:wsdl:2010-01-19}Attachment"/&gt;
 *         &lt;element name="moreData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitDataInput", propOrder = {
    "parameter",
    "client",
    "jobId",
    "actionId",
    "dataId",
    "attachment",
    "moreData"
})
public class SubmitDataInput {

    @XmlElement(nillable = true)
    protected List<Parameter> parameter;
    @XmlElement(required = true)
    protected String client;
    @XmlSchemaType(name = "unsignedInt")
    protected long jobId;
    @XmlSchemaType(name = "unsignedInt")
    protected long actionId;
    @XmlSchemaType(name = "unsignedInt")
    protected long dataId;
    @XmlElement(required = true)
    protected Attachment attachment;
    protected boolean moreData;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parameter }
     * 
     * 
     */
    public List<Parameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
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
     * ��ȡactionId���Ե�ֵ��
     * 
     */
    public long getActionId() {
        return actionId;
    }

    /**
     * ����actionId���Ե�ֵ��
     * 
     */
    public void setActionId(long value) {
        this.actionId = value;
    }

    /**
     * ��ȡdataId���Ե�ֵ��
     * 
     */
    public long getDataId() {
        return dataId;
    }

    /**
     * ����dataId���Ե�ֵ��
     * 
     */
    public void setDataId(long value) {
        this.dataId = value;
    }

    /**
     * ��ȡattachment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * ����attachment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

    /**
     * ��ȡmoreData���Ե�ֵ��
     * 
     */
    public boolean isMoreData() {
        return moreData;
    }

    /**
     * ����moreData���Ե�ֵ��
     * 
     */
    public void setMoreData(boolean value) {
        this.moreData = value;
    }

}
