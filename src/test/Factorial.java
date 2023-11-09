package test;

import java.util.Objects;
import java.util.Scanner;

public class Factorial {
    public static void factorialHelper() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number to be factorized: \n");
        do {
            String str = s.nextLine();
            if(Objects.equals(str, "stop")){
                break;
            }
            Long num_re = factorialnumber(Long.parseLong(str));
            System.out.println(num_re);
            System.out.println("please enter a number to be factorized (enter 'stop' to end the loop): \n");
        }
        while(s.hasNext());

        System.out.println("end of Factorial - byeee");

    }
    public static Long factorialnumber(Long i){
        if(i==1)
            return (long) 1;
        return i*factorialnumber(i-1);
    }
}
