
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
 *         &lt;element name="WaitForStatus2Input" type="{urn:dpcl:wsdl:2011-09-02}WaitForStatus2Input"/&gt;
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
    "waitForStatus2Input"
})
@XmlRootElement(name = "WaitForStatus2")
public class WaitForStatus2 {

    @XmlElement(name = "WaitForStatus2Input", required = true)
    protected WaitForStatus2Input waitForStatus2Input;

    /**
     * ��ȡwaitForStatus2Input���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WaitForStatus2Input }
     *     
     */
    public WaitForStatus2Input getWaitForStatus2Input() {
        return waitForStatus2Input;
    }

    /**
     * ����waitForStatus2Input���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WaitForStatus2Input }
     *     
     */
    public void setWaitForStatus2Input(WaitForStatus2Input value) {
        this.waitForStatus2Input = value;
    }

}
