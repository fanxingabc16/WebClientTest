
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
 *         &lt;element name="StartJobInput" type="{urn:dpcl:wsdl:2010-01-19}StartJobInput"/&gt;
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
    "startJobInput"
})
@XmlRootElement(name = "StartJob")
public class StartJob {

    @XmlElement(name = "StartJobInput", required = true)
    protected StartJobInput startJobInput;

    /**
     * 获取startJobInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StartJobInput }
     *     
     */
    public StartJobInput getStartJobInput() {
        return startJobInput;
    }

    /**
     * 设置startJobInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StartJobInput }
     *     
     */
    public void setStartJobInput(StartJobInput value) {
        this.startJobInput = value;
    }

}
