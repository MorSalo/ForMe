package test;

import java.io.Console;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static test.QuestionMarks.QuestionsMarks;
import static test.Reverse.ReverseHelper;
import static test.Polindrom.polindromHelper;
import static test.Factorial.factorialHelper;
import static test.LongestWords.longestWordsHelper;
import static test.TreeConst.TreeConstructor;
import static test.MedianSortedArrays.findMedianSortedArrays;
public class Main {
    public static void main(String[] args)  {
        //mainHelper();
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.println(TreeConstructor(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));

//        Scanner s = new Scanner(System.in);
//        String in =s.nextLine();
//        String str = QuestionsMarks(in);
//        System.out.println(str);

        int[] nums1 = new int[]{1,3,4};
        int[] nums2 = new int[]{2};
        if(findMedianSortedArrays(nums1,nums2)==2.5){
            System.out.println("greap "+ findMedianSortedArrays(nums1,nums2));
        }
        else System.out.println("fuck you got "+ findMedianSortedArrays(nums1,nums2));


        System.out.println("see yaaaa");
    }

    public static void mainHelper(){
        Scanner s = new Scanner(System.in);
        boolean flag=true;
        do {
            System.out.println("Hi and welcome to the game ;) \n" +
                    "enter '1' for Polindrom game \n" +
                    "enter '2' for Reverse game \n" +
                    "enter '3' for Factorial game \n" +
                    "enter '4' for Longest Word game \n" +
                    "enter 'stop' to end the game");
            String sin = s.nextLine();

            switch (sin){
                case "1":
                    polindromHelper();
                    break;
                case "2":
                    ReverseHelper();
                    break;
                case "3":
                    factorialHelper();
                    break;
                case "4":
                    longestWordsHelper();
                    break;
                case "stop":
                    return;
                default:
                    System.out.println("incorrect input");
            }

        }while(flag);
    }


}

