
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.DiscoverPrinterInput;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscoverPrinterInput" type="{urn:dpcl:wsdl:2010-01-19}DiscoverPrinterInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "discoverPrinterInput"
})
@XmlRootElement(name = "DiscoverPrinter")
public class DiscoverPrinter {

    @XmlElement(name = "DiscoverPrinterInput", required = true)
    protected DiscoverPrinterInput discoverPrinterInput;

    /**
     * ��ȡdiscoverPrinterInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DiscoverPrinterInput }
     *     
     */
    public DiscoverPrinterInput getDiscoverPrinterInput() {
        return discoverPrinterInput;
    }

    /**
     * ����discoverPrinterInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoverPrinterInput }
     *     
     */
    public void setDiscoverPrinterInput(DiscoverPrinterInput value) {
        this.discoverPrinterInput = value;
    }

}