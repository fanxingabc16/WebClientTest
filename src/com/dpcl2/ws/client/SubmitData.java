
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
 *         &lt;element name="SubmitDataInput" type="{urn:dpcl:wsdl:2010-01-19}SubmitDataInput"/&gt;
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
    "submitDataInput"
})
@XmlRootElement(name = "SubmitData")
public class SubmitData {

    @XmlElement(name = "SubmitDataInput", required = true)
    protected SubmitDataInput submitDataInput;

    /**
     * ��ȡsubmitDataInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubmitDataInput }
     *     
     */
    public SubmitDataInput getSubmitDataInput() {
        return submitDataInput;
    }

    /**
     * ����submitDataInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitDataInput }
     *     
     */
    public void setSubmitDataInput(SubmitDataInput value) {
        this.submitDataInput = value;
    }

}
