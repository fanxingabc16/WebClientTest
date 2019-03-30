package com.dpcl2.client.util;

import java.util.*;

public class Job
{
    private String name;
    private List<Command> commands;
    
    public String getName() {
        return this.name;
    }
    
    public Command getCommand(final int index) {
        if (index >= 0 && index < this.commands.size()) {
            return this.commands.get(index);
        }
        return this.commands.get(0);
    }
    
    public int getNumberOfCommands() {
        return this.commands.size();
    }
    
    public Job(final String _name, final List<Command> _commands) {
        this.name = _name;
        this.commands = _commands;
    }
}
