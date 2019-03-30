
package dpcl.wsdl._2011_09_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.ActionInfo;
import dpcl.wsdl._2010_01_19.Option;
import dpcl.wsdl._2010_01_19.Serialization;
import dpcl.wsdl._2010_01_19.Version;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Obtain action, tunnel, option, serialization, version, plugin, manufacturer, model, agencyModel, optionsHash - refer to typedef struct DPCL2__DiscoverPrinter2Output&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>DiscoverPrinter2Output complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DiscoverPrinter2Output"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{urn:dpcl:wsdl:2010-01-19}ActionInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tunnel" type="{urn:dpcl:wsdl:2011-09-02}TunnelInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="option" type="{urn:dpcl:wsdl:2010-01-19}Option" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serialization" type="{urn:dpcl:wsdl:2010-01-19}Serialization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{urn:dpcl:wsdl:2010-01-19}Version" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="plugin" type="{urn:dpcl:wsdl:2011-09-02}PluginInfo" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="agencyModel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "DiscoverPrinter2Output", propOrder = {
    "action",
    "tunnel",
    "option",
    "serialization",
    "version",
    "plugin",
    "manufacturer",
    "model",
    "agencyModel",
    "optionsHash"
})
public class DiscoverPrinter2Output {

    @XmlElement(nillable = true)
    protected List<ActionInfo> action;
    @XmlElement(nillable = true)
    protected List<TunnelInfo> tunnel;
    @XmlElement(nillable = true)
    protected List<Option> option;
    @XmlElement(nillable = true)
    protected List<Serialization> serialization;
    @XmlElement(nillable = true)
    protected List<Version> version;
    @XmlElement(nillable = true)
    protected PluginInfo plugin;
    @XmlElement(required = true)
    protected String manufacturer;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String agencyModel;
    @XmlSchemaType(name = "unsignedInt")
    protected long optionsHash;

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
     * {@link ActionInfo }
     * 
     * 
     */
    public List<ActionInfo> getAction() {
        if (action == null) {
            action = new ArrayList<ActionInfo>();
        }
        return this.action;
    }

    /**
     * Gets the value of the tunnel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunnel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunnel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TunnelInfo }
     * 
     * 
     */
    public List<TunnelInfo> getTunnel() {
        if (tunnel == null) {
            tunnel = new ArrayList<TunnelInfo>();
        }
        return this.tunnel;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option }
     * 
     * 
     */
    public List<Option> getOption() {
        if (option == null) {
            option = new ArrayList<Option>();
        }
        return this.option;
    }

    /**
     * Gets the value of the serialization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Serialization }
     * 
     * 
     */
    public List<Serialization> getSerialization() {
        if (serialization == null) {
            serialization = new ArrayList<Serialization>();
        }
        return this.serialization;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Version }
     * 
     * 
     */
    public List<Version> getVersion() {
        if (version == null) {
            version = new ArrayList<Version>();
        }
        return this.version;
    }

    /**
     * ��ȡplugin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PluginInfo }
     *     
     */
    public PluginInfo getPlugin() {
        return plugin;
    }

    /**
     * ����plugin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PluginInfo }
     *     
     */
    public void setPlugin(PluginInfo value) {
        this.plugin = value;
    }

    /**
     * ��ȡmanufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * ����manufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * ��ȡmodel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * ����model���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * ��ȡagencyModel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyModel() {
        return agencyModel;
    }

    /**
     * ����agencyModel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyModel(String value) {
        this.agencyModel = value;
    }

    /**
     * ��ȡoptionsHash���Ե�ֵ��
     * 
     */
    public long getOptionsHash() {
        return optionsHash;
    }

    /**
     * ����optionsHash���Ե�ֵ��
     * 
     */
    public void setOptionsHash(long value) {
        this.optionsHash = value;
    }

}
