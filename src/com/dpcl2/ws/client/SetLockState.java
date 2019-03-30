
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
 *         &lt;element name="SetLockStateInput" type="{urn:dpcl:wsdl:2011-09-02}SetLockStateInput"/&gt;
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
    "setLockStateInput"
})
@XmlRootElement(name = "SetLockState")
public class SetLockState {

    @XmlElement(name = "SetLockStateInput", required = true)
    protected SetLockStateInput setLockStateInput;

    /**
     * 获取setLockStateInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SetLockStateInput }
     *     
     */
    public SetLockStateInput getSetLockStateInput() {
        return setLockStateInput;
    }

    /**
     * 设置setLockStateInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SetLockStateInput }
     *     
     */
    public void setSetLockStateInput(SetLockStateInput value) {
        this.setLockStateInput = value;
    }

}
