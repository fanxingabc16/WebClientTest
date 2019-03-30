
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.SubmitDataInput;


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
 *         &lt;element name="SubmitDataInput" type="{urn:dpcl:wsdl:2010-01-19}SubmitDataInput"/&gt;
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
    "submitDataInput"
})
@XmlRootElement(name = "SubmitData")
public class SubmitData {

    @XmlElement(name = "SubmitDataInput", required = true)
    protected SubmitDataInput submitDataInput;

    /**
     * 获取submitDataInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubmitDataInput }
     *     
     */
    public SubmitDataInput getSubmitDataInput() {
        return submitDataInput;
    }

    /**
     * 设置submitDataInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitDataInput }
     *     
     */
    public void setSubmitDataInput(SubmitDataInput value) {
        this.submitDataInput = value;
    }

}
