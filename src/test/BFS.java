package test;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BFS<T> implements Search<T>{

    @Override
    public void traverse(Vertex<T> start) {
        Queue<Vertex<T>> queue = new ArrayBlockingQueue<>(100);
        queue.add(start);

        while (!queue.isEmpty()){
            Vertex<T> now = queue.poll();

            if(!now.visited){
                now.visited=true;
                System.out.println(now.val);
                now.adj.forEach(queue::offer);
            }
        }
    }

    public static void BFSHelper(){
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

        Search<Integer> search = new BFS<>();
        search.traverse(v0);
    }
}
