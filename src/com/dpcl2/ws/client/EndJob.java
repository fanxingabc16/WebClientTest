
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
 *         &lt;element name="EndJobInput" type="{urn:dpcl:wsdl:2010-01-19}EndJobInput"/&gt;
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
    "endJobInput"
})
@XmlRootElement(name = "EndJob")
public class EndJob {

    @XmlElement(name = "EndJobInput", required = true)
    protected EndJobInput endJobInput;

    /**
     * 获取endJobInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EndJobInput }
     *     
     */
    public EndJobInput getEndJobInput() {
        return endJobInput;
    }

    /**
     * 设置endJobInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EndJobInput }
     *     
     */
    public void setEndJobInput(EndJobInput value) {
        this.endJobInput = value;
    }

}
