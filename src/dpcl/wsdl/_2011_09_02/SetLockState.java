
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
 *         &lt;element name="SetLockStateInput" type="{urn:dpcl:wsdl:2011-09-02}SetLockStateInput"/&gt;
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
    "setLockStateInput"
})
@XmlRootElement(name = "SetLockState")
public class SetLockState {

    @XmlElement(name = "SetLockStateInput", required = true)
    protected SetLockStateInput setLockStateInput;

    /**
     * ��ȡsetLockStateInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SetLockStateInput }
     *     
     */
    public SetLockStateInput getSetLockStateInput() {
        return setLockStateInput;
    }

    /**
     * ����setLockStateInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SetLockStateInput }
     *     
     */
    public void setSetLockStateInput(SetLockStateInput value) {
        this.setLockStateInput = value;
    }

}
