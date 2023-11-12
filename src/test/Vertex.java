package test;

import java.util.*;


public class Vertex<T> {
    T val;
    boolean visited;
    List<Vertex<T>> adj = null;

    public Vertex(T v) {
        val = v;
        visited = false;
        adj = new ArrayList<>();
    }

    public void setAdj(List<Vertex<T>> list){
        adj = list;
    }


}
