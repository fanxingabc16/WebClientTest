
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
 *         &lt;element name="WaitForStatusInput" type="{urn:dpcl:wsdl:2010-01-19}WaitForStatusInput"/&gt;
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
    "waitForStatusInput"
})
@XmlRootElement(name = "WaitForStatus")
public class WaitForStatus {

    @XmlElement(name = "WaitForStatusInput", required = true)
    protected WaitForStatusInput waitForStatusInput;

    /**
     * ��ȡwaitForStatusInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WaitForStatusInput }
     *     
     */
    public WaitForStatusInput getWaitForStatusInput() {
        return waitForStatusInput;
    }

    /**
     * ����waitForStatusInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WaitForStatusInput }
     *     
     */
    public void setWaitForStatusInput(WaitForStatusInput value) {
        this.waitForStatusInput = value;
    }

}
