
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
 *         &lt;element name="output" type="{urn:dpcl:wsdl:2011-09-02}WaitForStatus2Output"/&gt;
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
    "output"
})
@XmlRootElement(name = "WaitForStatus2Response")
public class WaitForStatus2Response {

    @XmlElement(required = true)
    protected WaitForStatus2Output output;

    /**
     * ��ȡoutput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WaitForStatus2Output }
     *     
     */
    public WaitForStatus2Output getOutput() {
        return output;
    }

    /**
     * ����output���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WaitForStatus2Output }
     *     
     */
    public void setOutput(WaitForStatus2Output value) {
        this.output = value;
    }

}
