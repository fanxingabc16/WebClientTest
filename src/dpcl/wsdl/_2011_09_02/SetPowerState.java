
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
     * 获取setPowerStateInput属性的值。
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
     * 设置setPowerStateInput属性的值。
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
