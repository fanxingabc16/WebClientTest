
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.StartJobInput;


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
 *         &lt;element name="StartJobInput" type="{urn:dpcl:wsdl:2010-01-19}StartJobInput"/&gt;
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
    "startJobInput"
})
@XmlRootElement(name = "StartJob")
public class StartJob {

    @XmlElement(name = "StartJobInput", required = true)
    protected StartJobInput startJobInput;

    /**
     * ��ȡstartJobInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StartJobInput }
     *     
     */
    public StartJobInput getStartJobInput() {
        return startJobInput;
    }

    /**
     * ����startJobInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StartJobInput }
     *     
     */
    public void setStartJobInput(StartJobInput value) {
        this.startJobInput = value;
    }

}
