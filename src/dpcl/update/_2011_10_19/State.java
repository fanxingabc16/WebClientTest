
package dpcl.update._2011_10_19;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>State�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="State"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Uninitiated"/&gt;
 *     &lt;enumeration value="Initiated"/&gt;
 *     &lt;enumeration value="Staged"/&gt;
 *     &lt;enumeration value="Finalized"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "State")
@XmlEnum
public enum State {

    @XmlEnumValue("Uninitiated")
    UNINITIATED("Uninitiated"),
    @XmlEnumValue("Initiated")
    INITIATED("Initiated"),
    @XmlEnumValue("Staged")
    STAGED("Staged"),
    @XmlEnumValue("Finalized")
    FINALIZED("Finalized");
    private final String value;

    State(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static State fromValue(String v) {
        for (State c: State.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
