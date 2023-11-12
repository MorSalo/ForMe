package test;

import java.util.*;
import java.io.*;

class TreeConst {

    public static String TreeConstructor(String[] strArr) {
        // code goes here

        //Building a hashmap with all the nodes in the tree as key
        //and the number of times they are in the array as value

        HashMap<String,Integer> hs = new HashMap();
        for(String str:strArr){
            //separating and converting to string
            String son = ((Character)str.charAt(1)).toString();
            System.out.println(son);
            String fath = ((Character)str.charAt(3)).toString();
            System.out.println(fath);

            //add or update son
            if(hs.containsKey(son)){
                Integer prev = hs.get(son);
                hs.replace(son,prev+1);
            }
            else{
                hs.put(son,1);
            }
            //add or update father
            if(hs.containsKey(fath)){
                Integer prev = hs.get(fath);
                hs.replace(fath,prev+1);
            }
            else{
                hs.put(fath,1);
            }
        }
        hs.forEach((k,v)->System.out.print("("+k+","+v+"), "));


        //Going through every key and checking
        //whether it apears more than 3 times
        //if it does return false
        // Boolean flag = true;
        // hs.forEach((k,v)->{
        //   if(v>3) flag=false;
        // });
        // if(!flag) return "false";
        Integer[] arraval =hs.values().toArray(new Integer[]{});

        for(Integer i :arraval){
            if(i>3){
                return "false";
            }
        }

        return "true";
    }

    //not responsive
    public static void TreeConstructorHelper() {
        Scanner s = new Scanner(System.in);
//        String str = "new String[] "+s.nextLine();
        System.out.print(TreeConstructor(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
    }

}