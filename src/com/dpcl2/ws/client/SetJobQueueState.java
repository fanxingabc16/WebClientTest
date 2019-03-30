
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetJobQueueStateInput" type="{urn:dpcl:wsdl:2011-09-02}SetJobQueueStateInput"/&gt;
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
    "setJobQueueStateInput"
})
@XmlRootElement(name = "SetJobQueueState")
public class SetJobQueueState {

    @XmlElement(name = "SetJobQueueStateInput", required = true)
    protected SetJobQueueStateInput setJobQueueStateInput;

    /**
     * 获取setJobQueueStateInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SetJobQueueStateInput }
     *     
     */
    public SetJobQueueStateInput getSetJobQueueStateInput() {
        return setJobQueueStateInput;
    }

    /**
     * 设置setJobQueueStateInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SetJobQueueStateInput }
     *     
     */
    public void setSetJobQueueStateInput(SetJobQueueStateInput value) {
        this.setJobQueueStateInput = value;
    }

}
