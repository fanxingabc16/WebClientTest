
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
 *         &lt;element name="WaitForStatus2Input" type="{urn:dpcl:wsdl:2011-09-02}WaitForStatus2Input"/&gt;
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
    "waitForStatus2Input"
})
@XmlRootElement(name = "WaitForStatus2")
public class WaitForStatus2 {

    @XmlElement(name = "WaitForStatus2Input", required = true)
    protected WaitForStatus2Input waitForStatus2Input;

    /**
     * 获取waitForStatus2Input属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WaitForStatus2Input }
     *     
     */
    public WaitForStatus2Input getWaitForStatus2Input() {
        return waitForStatus2Input;
    }

    /**
     * 设置waitForStatus2Input属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WaitForStatus2Input }
     *     
     */
    public void setWaitForStatus2Input(WaitForStatus2Input value) {
        this.waitForStatus2Input = value;
    }

}
