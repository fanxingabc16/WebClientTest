
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
 *         &lt;element name="StartJob2Input" type="{urn:dpcl:wsdl:2011-09-02}StartJob2Input"/&gt;
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
    "startJob2Input"
})
@XmlRootElement(name = "StartJob3")
public class StartJob3 {

    @XmlElement(name = "StartJob2Input", required = true)
    protected StartJob2Input startJob2Input;

    /**
     * 获取startJob2Input属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StartJob2Input }
     *     
     */
    public StartJob2Input getStartJob2Input() {
        return startJob2Input;
    }

    /**
     * 设置startJob2Input属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StartJob2Input }
     *     
     */
    public void setStartJob2Input(StartJob2Input value) {
        this.startJob2Input = value;
    }

}
