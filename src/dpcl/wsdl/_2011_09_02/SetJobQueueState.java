
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SetJobQueueStateInput" type="{urn:dpcl:wsdl:2011-09-02}SetJobQueueStateInput"/&gt;
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
    "setJobQueueStateInput"
})
@XmlRootElement(name = "SetJobQueueState")
public class SetJobQueueState {

    @XmlElement(name = "SetJobQueueStateInput", required = true)
    protected SetJobQueueStateInput setJobQueueStateInput;

    /**
     * ��ȡsetJobQueueStateInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SetJobQueueStateInput }
     *     
     */
    public SetJobQueueStateInput getSetJobQueueStateInput() {
        return setJobQueueStateInput;
    }

    /**
     * ����setJobQueueStateInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SetJobQueueStateInput }
     *     
     */
    public void setSetJobQueueStateInput(SetJobQueueStateInput value) {
        this.setJobQueueStateInput = value;
    }

}
