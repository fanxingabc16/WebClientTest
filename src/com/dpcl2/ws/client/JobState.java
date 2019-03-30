
package com.dpcl2.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JobState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="JobState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Queued"/&gt;
 *     &lt;enumeration value="Held"/&gt;
 *     &lt;enumeration value="Running"/&gt;
 *     &lt;enumeration value="Blocked"/&gt;
 *     &lt;enumeration value="Succeeded"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobState", namespace = "urn:dpcl:wsdl:2010-01-19")
@XmlEnum
public enum JobState {

    @XmlEnumValue("Queued")
    QUEUED("Queued"),
    @XmlEnumValue("Held")
    HELD("Held"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    JobState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobState fromValue(String v) {
        for (JobState c: JobState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
