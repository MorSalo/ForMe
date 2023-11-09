package test;

import java.util.*;
public class Fizzbazz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new LinkedList<>();
        boolean div3 = false;
        boolean div5 = false;
        for (Integer i = 1; i < n + 1; i++) {
            if (i % 3 == 0) {
                div3 = true;
            }
            if (i % 5 == 0) {
                div5 = true;
            }
            if (div3 == true && div5 == true) {
                res.add("FizzBuzz");
                continue;
            }
            else if(div3==true && div5==false){
                res.add("Fizz");
                continue;
            }
            else if(div3==false && div5==true){
                res.add("Buzz");
                continue;
            }
            else{
                res.add(i.toString());
            }
        }
        return res;
    }
}
