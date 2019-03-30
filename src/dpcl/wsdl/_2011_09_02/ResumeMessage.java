
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
 *         &lt;element name="ResumeMessageInput" type="{urn:dpcl:wsdl:2011-09-02}ResumeMessageInput"/&gt;
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
    "resumeMessageInput"
})
@XmlRootElement(name = "ResumeMessage")
public class ResumeMessage {

    @XmlElement(name = "ResumeMessageInput", required = true)
    protected ResumeMessageInput resumeMessageInput;

    /**
     * 获取resumeMessageInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResumeMessageInput }
     *     
     */
    public ResumeMessageInput getResumeMessageInput() {
        return resumeMessageInput;
    }

    /**
     * 设置resumeMessageInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResumeMessageInput }
     *     
     */
    public void setResumeMessageInput(ResumeMessageInput value) {
        this.resumeMessageInput = value;
    }

}
