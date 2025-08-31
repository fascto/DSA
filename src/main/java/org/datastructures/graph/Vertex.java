package org.datastructures.graph;

import java.util.ArrayList;

public class Vertex {

    private String value;
    private ArrayList<Edge> edges;

    public Vertex(String input) {
        this.value = input;
        this.edges = new ArrayList<Edge>();
    }

    public void print(boolean showWeight) {
        StringBuilder message = new StringBuilder();
        if (this.edges.isEmpty()) {
            System.out.println(this.value+"-->");
            return;
        }

        for (int i = 0; i < this.edges.size(); i++) {

            if (i == 0) {
                message.append(this.edges.get(i).getStart().value);
                message.append(" --> ");
            }

            message.append(this.edges.get(i).getEnd().value);

            if (showWeight) {
                message.append(" (");
                message.append(this.edges.get(i).getWeight());
                message.append(" )");
            }

            if (i != this.edges.size() - 1){
                message.append(",");
            }
        }
        System.out.println(message);
    }

    public void addEdge(Vertex endV, Integer weight) {
        this.edges.add(new Edge(this, endV, weight));
    }

    public void removeEdge(Vertex endV) {
        this.edges.removeIf(edge -> edge.getEnd().equals(endV));
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
}
