package test;

import java.util.Objects;
import java.util.Scanner;

public class LongestWords {

    public static void longestWordsHelper(){
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a sentence: \n");
        do {
            String str = s.nextLine();
            if(Objects.equals(str, "stop")){
                break;
            }
            String str_re = longestWords(str);
            System.out.println(str_re);
            System.out.println("please enter a sentence(enter 'stop' to end the loop): \n");
        }
        while(s.hasNext());

        System.out.println("end of LongestWord - byeee");


    }

    public static String longestWords(String str){
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        String longest = "";
        for(String s:arr){
            if(s.length()>longest.length()){
                longest = s;
            }
        }
        sb.append(longest);
        for(String s:arr){
            if(s.length()==longest.length() && !(s.equals(longest))){
                sb.append(", "+s);
            }
        }
        return sb.toString();
    }
}
