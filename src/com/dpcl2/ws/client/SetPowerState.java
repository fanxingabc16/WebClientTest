
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
 *         &lt;element name="SetPowerStateInput" type="{urn:dpcl:wsdl:2011-09-02}SetPowerStateInput"/&gt;
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
    "setPowerStateInput"
})
@XmlRootElement(name = "SetPowerState")
public class SetPowerState {

    @XmlElement(name = "SetPowerStateInput", required = true)
    protected SetPowerStateInput setPowerStateInput;

    /**
     * ��ȡsetPowerStateInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SetPowerStateInput }
     *     
     */
    public SetPowerStateInput getSetPowerStateInput() {
        return setPowerStateInput;
    }

    /**
     * ����setPowerStateInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SetPowerStateInput }
     *     
     */
    public void setSetPowerStateInput(SetPowerStateInput value) {
        this.setPowerStateInput = value;
    }

}
