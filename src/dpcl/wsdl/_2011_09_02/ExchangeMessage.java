
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
 *         &lt;element name="ExchangeMessageInput" type="{urn:dpcl:wsdl:2011-09-02}ExchangeMessageInput"/&gt;
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
    "exchangeMessageInput"
})
@XmlRootElement(name = "ExchangeMessage")
public class ExchangeMessage {

    @XmlElement(name = "ExchangeMessageInput", required = true)
    protected ExchangeMessageInput exchangeMessageInput;

    /**
     * ��ȡexchangeMessageInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExchangeMessageInput }
     *     
     */
    public ExchangeMessageInput getExchangeMessageInput() {
        return exchangeMessageInput;
    }

    /**
     * ����exchangeMessageInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeMessageInput }
     *     
     */
    public void setExchangeMessageInput(ExchangeMessageInput value) {
        this.exchangeMessageInput = value;
    }

}
