package org.datastructures.graph;


import java.util.ArrayList;
import java.util.Objects;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isDirected = inputIsDirected;
        this.isWeighted = inputIsWeighted;
    }

    public Vertex addVertex(String value) {
        Vertex newVertex = new Vertex(value);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
         if (!this.isWeighted) {
             weight = null;
         }
         vertex1.addEdge(vertex2, weight );
         if (!this.isDirected) {
             vertex2.addEdge(vertex1, weight);
         }
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public void setWeighted(boolean weighted) {
        isWeighted = weighted;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(boolean directed) {
        isDirected = directed;
    }

    public Vertex getVertexByValue(String value) {
        for (Vertex v: this.vertices) {
            if (Objects.equals(v.getValue(), value)) {
                return v;
            }
        }
        return null;
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }



}

