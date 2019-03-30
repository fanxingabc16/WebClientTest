
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
 *         &lt;element name="DiscoverPrinter2Input" type="{urn:dpcl:wsdl:2011-09-02}DiscoverPrinter2Input"/&gt;
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
    "discoverPrinter2Input"
})
@XmlRootElement(name = "DiscoverPrinter2")
public class DiscoverPrinter2 {

    @XmlElement(name = "DiscoverPrinter2Input", required = true)
    protected DiscoverPrinter2Input discoverPrinter2Input;

    /**
     * 获取discoverPrinter2Input属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DiscoverPrinter2Input }
     *     
     */
    public DiscoverPrinter2Input getDiscoverPrinter2Input() {
        return discoverPrinter2Input;
    }

    /**
     * 设置discoverPrinter2Input属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoverPrinter2Input }
     *     
     */
    public void setDiscoverPrinter2Input(DiscoverPrinter2Input value) {
        this.discoverPrinter2Input = value;
    }

}
