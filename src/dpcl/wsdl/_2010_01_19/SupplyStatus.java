
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.w3.org/2001/XMLSchema" xmlns:DIME="http://schemas.xmlsoap.org/ws/2002/04/dime/wsdl/" xmlns:DPCL="urn:dpcl:wsdl:2010-01-19" xmlns:DPCL2="urn:dpcl:wsdl:2011-09-02" xmlns:DPCLEmboss="urn:dpcl:emboss:2011-06-03" xmlns:DPCLMagStripe="urn:dpcl:magstripe:2010-01-19" xmlns:DPCLNetworkAccessList="urn:dpcl:nal:2012-05-30" xmlns:DPCLSensors="urn:dpcl:sensors:2010-01-19" xmlns:DPCLSettings="urn:dpcl:settings:2010-01-19" xmlns:DPCLUpdate="urn:dpcl:update:2011-10-19" xmlns:DPCLWheel="urn:dpcl:wheel:2011-06-03" xmlns:MIME="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:SOAP="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:SOAP-ENC="http://www.w3.org/2003/05/soap-encoding" xmlns:SOAP-ENV="http://www.w3.org/2003/05/soap-envelope" xmlns:WSDL="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="urn:dpcl:wsdl:2011-09-02" xmlns:xmime5="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;Status of a supply supported by the current printer configuration.&lt;/p&gt;
 * </pre>
 * 
 * 
 * <p>SupplyStatus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SupplyStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionSequence" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="installed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="supported" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="supplyCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="specialCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="regionCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="mfgCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="percentRemain" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="percentReady" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="partNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="lotCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyStatus", propOrder = {
    "actionSequence",
    "installed",
    "supported",
    "supplyCode",
    "productCode",
    "specialCode",
    "regionCode",
    "mfgCode",
    "module",
    "percentRemain",
    "percentReady",
    "maxLength",
    "partNumber",
    "lotCode",
    "serialNumber"
})
public class SupplyStatus {

    @XmlElement(nillable = true)
    protected List<String> actionSequence;
    protected boolean installed;
    protected boolean supported;
    @XmlSchemaType(name = "unsignedInt")
    protected long supplyCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long productCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long specialCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long regionCode;
    @XmlSchemaType(name = "unsignedInt")
    protected long mfgCode;
    @XmlElement(required = true)
    protected String module;
    @XmlSchemaType(name = "unsignedInt")
    protected long percentRemain;
    @XmlSchemaType(name = "unsignedInt")
    protected long percentReady;
    @XmlSchemaType(name = "unsignedInt")
    protected long maxLength;
    @XmlSchemaType(name = "unsignedInt")
    protected long partNumber;
    @XmlElement(required = true)
    protected String lotCode;
    @XmlElement(required = true)
    protected String serialNumber;

    /**
     * Gets the value of the actionSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionSequence() {
        if (actionSequence == null) {
            actionSequence = new ArrayList<String>();
        }
        return this.actionSequence;
    }

    /**
     * ��ȡinstalled���Ե�ֵ��
     * 
     */
    public boolean isInstalled() {
        return installed;
    }

    /**
     * ����installed���Ե�ֵ��
     * 
     */
    public void setInstalled(boolean value) {
        this.installed = value;
    }

    /**
     * ��ȡsupported���Ե�ֵ��
     * 
     */
    public boolean isSupported() {
        return supported;
    }

    /**
     * ����supported���Ե�ֵ��
     * 
     */
    public void setSupported(boolean value) {
        this.supported = value;
    }

    /**
     * ��ȡsupplyCode���Ե�ֵ��
     * 
     */
    public long getSupplyCode() {
        return supplyCode;
    }

    /**
     * ����supplyCode���Ե�ֵ��
     * 
     */
    public void setSupplyCode(long value) {
        this.supplyCode = value;
    }

    /**
     * ��ȡproductCode���Ե�ֵ��
     * 
     */
    public long getProductCode() {
        return productCode;
    }

    /**
     * ����productCode���Ե�ֵ��
     * 
     */
    public void setProductCode(long value) {
        this.productCode = value;
    }

    /**
     * ��ȡspecialCode���Ե�ֵ��
     * 
     */
    public long getSpecialCode() {
        return specialCode;
    }

    /**
     * ����specialCode���Ե�ֵ��
     * 
     */
    public void setSpecialCode(long value) {
        this.specialCode = value;
    }

    /**
     * ��ȡregionCode���Ե�ֵ��
     * 
     */
    public long getRegionCode() {
        return regionCode;
    }

    /**
     * ����regionCode���Ե�ֵ��
     * 
     */
    public void setRegionCode(long value) {
        this.regionCode = value;
    }

    /**
     * ��ȡmfgCode���Ե�ֵ��
     * 
     */
    public long getMfgCode() {
        return mfgCode;
    }

    /**
     * ����mfgCode���Ե�ֵ��
     * 
     */
    public void setMfgCode(long value) {
        this.mfgCode = value;
    }

    /**
     * ��ȡmodule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * ����module���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * ��ȡpercentRemain���Ե�ֵ��
     * 
     */
    public long getPercentRemain() {
        return percentRemain;
    }

    /**
     * ����percentRemain���Ե�ֵ��
     * 
     */
    public void setPercentRemain(long value) {
        this.percentRemain = value;
    }

    /**
     * ��ȡpercentReady���Ե�ֵ��
     * 
     */
    public long getPercentReady() {
        return percentReady;
    }

    /**
     * ����percentReady���Ե�ֵ��
     * 
     */
    public void setPercentReady(long value) {
        this.percentReady = value;
    }

    /**
     * ��ȡmaxLength���Ե�ֵ��
     * 
     */
    public long getMaxLength() {
        return maxLength;
    }

    /**
     * ����maxLength���Ե�ֵ��
     * 
     */
    public void setMaxLength(long value) {
        this.maxLength = value;
    }

    /**
     * ��ȡpartNumber���Ե�ֵ��
     * 
     */
    public long getPartNumber() {
        return partNumber;
    }

    /**
     * ����partNumber���Ե�ֵ��
     * 
     */
    public void setPartNumber(long value) {
        this.partNumber = value;
    }

    /**
     * ��ȡlotCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotCode() {
        return lotCode;
    }

    /**
     * ����lotCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotCode(String value) {
        this.lotCode = value;
    }

    /**
     * ��ȡserialNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * ����serialNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

}
