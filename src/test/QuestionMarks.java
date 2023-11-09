package test;

import java.util.*;
import java.io.*;

public class QuestionMarks {
    public static String QuestionsMarks(String str) {
        // code goes here
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<str.length()-1;i++){
            char cc= sb.charAt(i);
            int c = cc;
            //System.out.println(sb.charAt(i) +" = "+c);
            if(c>47 && c<58) {
                int j=i;
                char next='?';
                do{
                    j++;
                    next = sb.charAt(j);
                }while(next == '?' && j<str.length());

                if(next>47 && next<58){
                    Integer mynum = Integer.parseInt(((Character)cc).toString());
                    Integer nextnum = Integer.parseInt(((Character)next).toString());
                    if((mynum+nextnum)==10){
                        if((j-i)==3){
                            return "true";
                        }
                        else return "false";
                    }
                }
            }
        }
        return "false";
    }
}
