package test;

import java.util.Scanner;

public class Polindrom {

    public static void polindromHelper(){
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a string to check whether it's a Polindrom:\n");
        do {
            String str = s.nextLine();
            if (str.equals("stop"))
                break;
            String res = polindrom(str);
            if(res.equals("true"))
                System.out.println("The string is a Polindrom :) \n");
            else if(res.equals("false"))
                System.out.println("The string is NOT a Polindrom :( \n");
            else System.out.println("incorrect input \n");

            System.out.println("please enter a string to check whether it's a Polindrom (enter 'stop' to end):\n");

//            switch (res) {
//                case "true":
//                    System.out.println("The string is a Polindrom :) \n");
//                    break;
//                case "false":
//                    System.out.println("The string is NOT a Polindrom :( \n");
//                      braek;
//                default:
//                    System.out.println("incorrect input \n");
//          }

        }while (s.hasNext());

        System.out.println("end of Polinoms - byeee");
    }

    public static String polindrom(String str){
        int len = str.length();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<len/2;i++){
            if (sb.charAt(i) != sb.charAt(len-1-i)){
                return "false";
            }
        }
        return "true";
    }

}
