
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
 *         &lt;element name="CancelJobInput" type="{urn:dpcl:wsdl:2010-01-19}CancelJobInput"/&gt;
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
    "cancelJobInput"
})
@XmlRootElement(name = "CancelJob")
public class CancelJob {

    @XmlElement(name = "CancelJobInput", required = true)
    protected CancelJobInput cancelJobInput;

    /**
     * ��ȡcancelJobInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CancelJobInput }
     *     
     */
    public CancelJobInput getCancelJobInput() {
        return cancelJobInput;
    }

    /**
     * ����cancelJobInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CancelJobInput }
     *     
     */
    public void setCancelJobInput(CancelJobInput value) {
        this.cancelJobInput = value;
    }

}
