
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DiscoverPrinter2Input" type="{urn:dpcl:wsdl:2011-09-02}DiscoverPrinter2Input"/&gt;
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
    "discoverPrinter2Input"
})
@XmlRootElement(name = "DiscoverPrinter2")
public class DiscoverPrinter2 {

    @XmlElement(name = "DiscoverPrinter2Input", required = true)
    protected DiscoverPrinter2Input discoverPrinter2Input;

    /**
     * ��ȡdiscoverPrinter2Input���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DiscoverPrinter2Input }
     *     
     */
    public DiscoverPrinter2Input getDiscoverPrinter2Input() {
        return discoverPrinter2Input;
    }

    /**
     * ����discoverPrinter2Input���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoverPrinter2Input }
     *     
     */
    public void setDiscoverPrinter2Input(DiscoverPrinter2Input value) {
        this.discoverPrinter2Input = value;
    }

}
