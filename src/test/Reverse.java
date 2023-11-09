package test;

import java.util.Objects;
import java.util.Scanner;

public class Reverse {
    public static void ReverseHelper() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a string to reverse: \n");
        do {
            String str = s.nextLine();
            if(Objects.equals(str, "stop")){
                break;
            }
            String str_re = FirstReverse(str);
            System.out.println(str_re);
            System.out.println("please enter a string to reverse(enter 'stop' to end the loop): \n");
        }
        while(s.hasNext());

        System.out.println("end of Reverse - byeee");
    }
    public static String FirstReverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length();i>0;i--){
            sb.append(str.charAt(i-1));
        }
        return sb.toString();
    }
}
