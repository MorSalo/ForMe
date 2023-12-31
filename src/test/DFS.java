package test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DFS<T> implements Search<T>{
    @Override
    public void traverse(Vertex<T> start){
        Deque<Vertex<T>> stack = new LinkedList<>();
        stack.push(start);

        while (!stack.isEmpty()){
            Vertex<T> now = stack.pop();
            if(!now.visited){
                now.visited =true;
                System.out.println(now.val);
                now.adj.forEach(stack::push);
            }
        }
    }

    public static void DFSHelper(){
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setAdj(Arrays.asList(v1,v5,v6));
        v1.setAdj(Arrays.asList(v3,v4));
        v4.setAdj(Arrays.asList(v2,v6));
        v6.setAdj(Arrays.asList(v0));

        Search<Integer> search = new DFS<>();
        search.traverse(v0);
    }
}
