package test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class BusRouts {

    public static int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target)
            return 1;

        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        ArrayList<Integer> sources = new ArrayList<>();
        ArrayList<Integer> targets = new ArrayList<>();
        for(int i=0;i<routes.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<routes[i].length;j++){
                list.add(routes[i][j]);

                //what buses go through the source and the target stations
                if(routes[i][j] == source){
                    sources.add(i);
                }
                else if(routes[i][j] == target){
                    targets.add(i);
                }
            }
            hm.put(i,list);
        }

        //array of vertexes
        ArrayList<Vertex<Integer>> vertexs = new ArrayList<>();
        for(int i=0;i<routes.length;i++){
            vertexs.add(new Vertex<>(i));
        }
        //initializing adj
        for(int i=0;i<routes.length;i++){
            //Vertex<Integer> now = vertexs.get(i);
            for(int j=0;j<routes[i].length;j++){
                for(int k=i+1;k<routes.length;k++) {
                    //if it's not already there
                    if (!vertexs.get(i).adj.contains(vertexs.get(k))) {
                        if (hm.get(k).contains(routes[i][j])) {
                            vertexs.get(i).adj.add(vertexs.get(k));
                            vertexs.get(k).adj.add(vertexs.get(i));
                        }
                    }
                }
            }
        }

        //BFSing
        int minbus = Integer.MAX_VALUE;
        for(Integer s : sources){
            for(Integer t: targets){
                int bus = BusBFS(vertexs.get(s),vertexs.get(t));
                if(bus < minbus){
                    minbus = bus;
                }
            }
        }

        if(minbus == Integer.MAX_VALUE){
            return -1;
        }
        return minbus;
    }

    private static int BusBFS(Vertex<Integer> s, Vertex<Integer> t) {
        Queue<Vertex<Integer>> queue = new ArrayBlockingQueue<>(100);
        int des=0;
        queue.add(s);
        while (!queue.isEmpty()){
            Vertex<Integer> now= queue.poll();
            if(now.val==t.val){
                return des;
            }
            if(!now.visited){
                now.visited=true;
                if(now!=s){
                    des++;
                }
                for(Vertex<Integer> v:now.adj){
                    if(v.val==t.val){
                        return ++des;
                    }
                    else now.adj.forEach(queue::offer);
                }
            }
        }
        return Integer.MAX_VALUE;
    }


    public static void busRoutsHelper(){
        int[][] ques = {{0,1,6,16,22,23},{14,15,24,32},{4,10,12,20,24,28,33},{1,10,11,19,27,33},{11,23,25,28},{15,20,21,23,29},{29}};
        int source=4;
        int taget=21;
        System.out.println(numBusesToDestination(ques,source,taget));
    }

}
