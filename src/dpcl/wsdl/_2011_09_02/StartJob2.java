
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
 *         &lt;element name="StartJob2Input" type="{urn:dpcl:wsdl:2011-09-02}StartJob2Input"/&gt;
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
    "startJob2Input"
})
@XmlRootElement(name = "StartJob2")
public class StartJob2 {

    @XmlElement(name = "StartJob2Input", required = true)
    protected StartJob2Input startJob2Input;

    /**
     * ��ȡstartJob2Input���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StartJob2Input }
     *     
     */
    public StartJob2Input getStartJob2Input() {
        return startJob2Input;
    }

    /**
     * ����startJob2Input���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StartJob2Input }
     *     
     */
    public void setStartJob2Input(StartJob2Input value) {
        this.startJob2Input = value;
    }

}
