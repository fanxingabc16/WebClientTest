
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.ResumeJobInput;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResumeJobInput" type="{urn:dpcl:wsdl:2010-01-19}ResumeJobInput"/&gt;
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
    "resumeJobInput"
})
@XmlRootElement(name = "ResumeJob")
public class ResumeJob {

    @XmlElement(name = "ResumeJobInput", required = true)
    protected ResumeJobInput resumeJobInput;

    /**
     * ��ȡresumeJobInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResumeJobInput }
     *     
     */
    public ResumeJobInput getResumeJobInput() {
        return resumeJobInput;
    }

    /**
     * ����resumeJobInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResumeJobInput }
     *     
     */
    public void setResumeJobInput(ResumeJobInput value) {
        this.resumeJobInput = value;
    }

}
