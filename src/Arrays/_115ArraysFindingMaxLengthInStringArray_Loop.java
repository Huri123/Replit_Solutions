package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
Given the array words, it will print the word with the largest length.
 Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
public class _115ArraysFindingMaxLengthInStringArray_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        int max = words[0].length();
        String longest = "";
        for (int a = 0; a < words.length; a++) {
            if (words[a].length() > max) {
                max = words[a].length();
                longest = words[a];
            }
        }
        System.out.println(longest);
        /*
        =========================================================================================================

        102. Arrays - Reverse Sentence_Loop, Array

        Instructions from your teacher:
        Given a String variable sentence, write code to type each word in separate lines in a reverse order.
        Example:
        sentence -> "Java is fun"
        Print
        fun
        is
        Java
         */
       /*
        String sentence = input.nextLine();


        String[] arr = sentence.split(" ");



            for (int i = arr.length-1;i>=0;i--) {
                System.out.println(arr[i]);

            }
            /*
            ==========================================================================================================
            103. Arrays - Reverse Sentence 2_Loop, Array
            Instructions from your teacher:
            Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

            Example:
            sentence -> "Java is fun"
            reversed -> "fun is Java"


             */
        String sentence = input.nextLine();
        String reversed = "";
        String str[] = sentence.split(" ");
        String[] a = new String[str.length];
        for (int i = str.length - 1; i >= 0; i--) {
            reversed += str[i] + " ";

        }
        reversed = reversed.substring(0, reversed.length());


        //End your code here. do not modify below statement
        System.out.println(reversed);


    }

}
