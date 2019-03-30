
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
 *         &lt;element name="RetrieveLogInput" type="{urn:dpcl:wsdl:2011-09-02}RetrieveLogInput"/&gt;
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
    "retrieveLogInput"
})
@XmlRootElement(name = "RetrieveLog")
public class RetrieveLog {

    @XmlElement(name = "RetrieveLogInput", required = true)
    protected RetrieveLogInput retrieveLogInput;

    /**
     * 获取retrieveLogInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RetrieveLogInput }
     *     
     */
    public RetrieveLogInput getRetrieveLogInput() {
        return retrieveLogInput;
    }

    /**
     * 设置retrieveLogInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveLogInput }
     *     
     */
    public void setRetrieveLogInput(RetrieveLogInput value) {
        this.retrieveLogInput = value;
    }

}
