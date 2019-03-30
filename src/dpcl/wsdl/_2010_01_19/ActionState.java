
package dpcl.wsdl._2010_01_19;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ActionState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ActionState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Submitted"/&gt;
 *     &lt;enumeration value="Requesting"/&gt;
 *     &lt;enumeration value="PrepRequest"/&gt;
 *     &lt;enumeration value="Ready"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Responding"/&gt;
 *     &lt;enumeration value="PrepResponse"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Terminated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionState")
@XmlEnum
public enum ActionState {

    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),
    @XmlEnumValue("Requesting")
    REQUESTING("Requesting"),
    @XmlEnumValue("PrepRequest")
    PREP_REQUEST("PrepRequest"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Responding")
    RESPONDING("Responding"),
    @XmlEnumValue("PrepResponse")
    PREP_RESPONSE("PrepResponse"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated");
    private final String value;

    ActionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionState fromValue(String v) {
        for (ActionState c: ActionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
