
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
 *         &lt;element name="SubmitActionInput" type="{urn:dpcl:wsdl:2010-01-19}SubmitActionInput"/&gt;
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
    "submitActionInput"
})
@XmlRootElement(name = "SubmitAction")
public class SubmitAction {

    @XmlElement(name = "SubmitActionInput", required = true)
    protected SubmitActionInput submitActionInput;

    /**
     * ��ȡsubmitActionInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubmitActionInput }
     *     
     */
    public SubmitActionInput getSubmitActionInput() {
        return submitActionInput;
    }

    /**
     * ����submitActionInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitActionInput }
     *     
     */
    public void setSubmitActionInput(SubmitActionInput value) {
        this.submitActionInput = value;
    }

}
