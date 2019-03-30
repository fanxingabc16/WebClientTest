
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
 *         &lt;element name="RetrieveInfoInput" type="{urn:dpcl:wsdl:2011-09-02}RetrieveInfoInput"/&gt;
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
    "retrieveInfoInput"
})
@XmlRootElement(name = "RetrieveInfo")
public class RetrieveInfo {

    @XmlElement(name = "RetrieveInfoInput", required = true)
    protected RetrieveInfoInput retrieveInfoInput;

    /**
     * 获取retrieveInfoInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RetrieveInfoInput }
     *     
     */
    public RetrieveInfoInput getRetrieveInfoInput() {
        return retrieveInfoInput;
    }

    /**
     * 设置retrieveInfoInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveInfoInput }
     *     
     */
    public void setRetrieveInfoInput(RetrieveInfoInput value) {
        this.retrieveInfoInput = value;
    }

}
