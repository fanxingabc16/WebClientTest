package com.dpcl2.client.util;

public class ActionParameter
{
    public String name;
    public String value;
    
    public ActionParameter(final String _name, final String _value) {
        this.name = _name;
        this.value = _value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getValue() {
        return this.value;
    }
}
