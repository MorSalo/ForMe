package test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DFS<T> implements Search<T>{

    public void traverse(Vertex<T> start){
        Deque<Vertex<T>> stack = new LinkedList<>();
        stack.add(start);

        while (!stack.isEmpty()){
            Vertex<T> now = stack.pop();
            if(!now.visited){
                now.visited =true;
                now.adj.forEach(stack::offer);
            }
        }
    }
}
