package com.example.mayurpitale.MusicTransfer.graphs;

import java.util.List;

/**
 * Created by Yash Ostwal on 12/3/2015.
 */
public class Graph {
//    private final List<String> vertexes;
    private final List<Edge> edges;
    private final List<Vertex> vertexes;


    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.edges = edges;
        this.vertexes = vertexes;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
