package com.dpcl2.client.util;

import java.util.*;

public class Command
{
    private String name;
    private String action;
    private List<ActionParameter> parameters;
    
    public Command(final String _name, final String _action, final List<ActionParameter> _parameters) {
        this.name = _name;
        this.action = _action;
        this.parameters = _parameters;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAction() {
        return this.action;
    }
    
    public ActionParameter getParameter(final int index) {
        if (index >= 0 && index < this.parameters.size()) {
            return this.parameters.get(index);
        }
        return this.parameters.get(0);
    }
    
    public List<ActionParameter> getParameters() {
        return this.parameters;
    }
    
    public String getParameterName(final int index) {
        if (index >= 0 && index < this.parameters.size()) {
            return this.parameters.get(index).name;
        }
        return "";
    }
    
    public String getParameterValue(final int index) {
        if (index >= 0 && index < this.parameters.size()) {
            return this.parameters.get(index).value;
        }
        return "";
    }
    
    public int getNumberOfParameters() {
        return this.parameters.size();
    }
}
