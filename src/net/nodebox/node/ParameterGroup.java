package net.nodebox.node;

import java.util.List;
import java.util.ArrayList;

public class ParameterGroup {

    private Node node;
    private String label;
    private List<Parameter> parameters = new ArrayList<Parameter>();

    public ParameterGroup(Node node, String label) {
        this.node = node;
        this.label = label;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        node.setChanged();
    }

    //// Container operations ////

    public boolean addParameter(Parameter parameter) {
        if (parameters.contains(parameter)) return false;
        return parameters.add(parameter);
    }

    public boolean removeParameter(Parameter parameter) {
        return parameters.remove(parameter);
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

}
