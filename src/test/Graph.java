package test;

public class Graph<T> {
    Vertex<T> source;

    Search<T> search;

    public Graph(Vertex<T> v, Search<T> s){
        source=v;
        search=s;
    }

}
