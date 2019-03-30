
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
 *         &lt;element name="RetrieveDataInput" type="{urn:dpcl:wsdl:2010-01-19}RetrieveDataInput"/&gt;
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
    "retrieveDataInput"
})
@XmlRootElement(name = "RetrieveData")
public class RetrieveData {

    @XmlElement(name = "RetrieveDataInput", required = true)
    protected RetrieveDataInput retrieveDataInput;

    /**
     * 获取retrieveDataInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RetrieveDataInput }
     *     
     */
    public RetrieveDataInput getRetrieveDataInput() {
        return retrieveDataInput;
    }

    /**
     * 设置retrieveDataInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveDataInput }
     *     
     */
    public void setRetrieveDataInput(RetrieveDataInput value) {
        this.retrieveDataInput = value;
    }

}
