
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.RestartJobInput;


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
 *         &lt;element name="RestartJobInput" type="{urn:dpcl:wsdl:2010-01-19}RestartJobInput"/&gt;
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
    "restartJobInput"
})
@XmlRootElement(name = "RestartJob")
public class RestartJob {

    @XmlElement(name = "RestartJobInput", required = true)
    protected RestartJobInput restartJobInput;

    /**
     * ��ȡrestartJobInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RestartJobInput }
     *     
     */
    public RestartJobInput getRestartJobInput() {
        return restartJobInput;
    }

    /**
     * ����restartJobInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RestartJobInput }
     *     
     */
    public void setRestartJobInput(RestartJobInput value) {
        this.restartJobInput = value;
    }

}
