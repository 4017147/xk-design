package com.xksquare.pattern.design.template.sample2;

import java.util.HashMap;
import java.util.Map;

public class VariableContext {
    private Map<String, Object> variables = new HashMap<>();

    public void put(String variableName, Object dataHolder) {
        variables.putIfAbsent(variableName.toLowerCase(), dataHolder);
    }

    public <T> T get(String variableName) {
        return (T) variables.get(variableName);
    }
}
