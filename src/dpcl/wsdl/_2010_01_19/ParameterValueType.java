
package dpcl.wsdl._2010_01_19;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParameterValueType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="EnumeratedList"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="UnsignedInteger"/&gt;
 *     &lt;enumeration value="FloatingPoint"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterValueType")
@XmlEnum
public enum ParameterValueType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("EnumeratedList")
    ENUMERATED_LIST("EnumeratedList"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("UnsignedInteger")
    UNSIGNED_INTEGER("UnsignedInteger"),
    @XmlEnumValue("FloatingPoint")
    FLOATING_POINT("FloatingPoint");
    private final String value;

    ParameterValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterValueType fromValue(String v) {
        for (ParameterValueType c: ParameterValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
