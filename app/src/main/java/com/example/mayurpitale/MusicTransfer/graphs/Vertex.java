package com.example.mayurpitale.MusicTransfer.graphs;

/**
 * Created by Yash on 12/3/2015.
 */
public class Vertex {
    private Integer distance = Integer.MAX_VALUE;
    private String name;
    private String predecessor;

    public Vertex(String name){
        this.name = name;
    }

    public String getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(String predecessor) {
        this.predecessor = predecessor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

}
