package test;

import java.io.Console;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static test.QuestionMarks.QuestionsMarks;
import static test.QuestionMarks.QuestionsMarksHelper;
import static test.Reverse.ReverseHelper;
import static test.Polindrom.polindromHelper;
import static test.Factorial.factorialHelper;
import static test.LongestWords.longestWordsHelper;
import static test.TreeConst.TreeConstructor;
import static test.MedianSortedArrays.findMedianSortedArrays;
import static test.TreeConst.TreeConstructorHelper;

public class Main {
    public static void main(String[] args)  {
        mainHelper();
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
                    "enter '5' for Median Sorted Arrays game \n"+
                    "enter '6' for Question Marks game \n" +
                    "enter '7' for Tree Constructor game \n"+
                    "enter '8' for DFS \n"+
                    "enter '9' for BFS \n"+
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
                case "5":
                    MedianSortedArrays.findMedianSortedArraysHelper();
                    break;
                case "6":
                    QuestionsMarksHelper();
                    break;
                case "7":
                    TreeConstructorHelper();
                    break;
                case "8":
                    DFS.DFSHelper();
                    break;
                case "9":
                    BFS.BFSHelper();
                    break;
                case "stop":
                    return;
                default:
                    System.out.println("incorrect input");
            }

        }while(flag);
    }


}

