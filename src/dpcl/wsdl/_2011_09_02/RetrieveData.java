
package dpcl.wsdl._2011_09_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dpcl.wsdl._2010_01_19.RetrieveDataInput;


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
 *         &lt;element name="RetrieveDataInput" type="{urn:dpcl:wsdl:2010-01-19}RetrieveDataInput"/&gt;
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
    "retrieveDataInput"
})
@XmlRootElement(name = "RetrieveData")
public class RetrieveData {

    @XmlElement(name = "RetrieveDataInput", required = true)
    protected RetrieveDataInput retrieveDataInput;

    /**
     * ��ȡretrieveDataInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RetrieveDataInput }
     *     
     */
    public RetrieveDataInput getRetrieveDataInput() {
        return retrieveDataInput;
    }

    /**
     * ����retrieveDataInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveDataInput }
     *     
     */
    public void setRetrieveDataInput(RetrieveDataInput value) {
        this.retrieveDataInput = value;
    }

}
