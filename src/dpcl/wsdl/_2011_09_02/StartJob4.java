
package dpcl.wsdl._2011_09_02;

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
 *         &lt;element name="StartJob2Input" type="{urn:dpcl:wsdl:2011-09-02}StartJob4Input"/&gt;
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
@XmlRootElement(name = "StartJob4")
public class StartJob4 {

    @XmlElement(name = "StartJob2Input", required = true)
    protected StartJob4Input startJob2Input;

    /**
     * 获取startJob2Input属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StartJob4Input }
     *     
     */
    public StartJob4Input getStartJob2Input() {
        return startJob2Input;
    }

    /**
     * 设置startJob2Input属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StartJob4Input }
     *     
     */
    public void setStartJob2Input(StartJob4Input value) {
        this.startJob2Input = value;
    }

}
