package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
The code provided in your main method will take in five Strings and save them into an array called arr.
 Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is
 at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
 */
public class _100ArraysPrinting01_LoopArrays {
    /* public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String[] arr = new String[5];
         for (int i = 0; i < 5; i++) {
             arr[i] = input.nextLine();
         }
         //leave above alone!  write your code below.
         //Create another loop for your solution!
         for (int a=0;a<arr.length;a++){
             System.out.println(arr[a].substring(0,3));
         }

          */
        /*
        101. Arrays - print first-last char I_Loop, Arrays, String

        Instructions from your teacher:
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        for (int i=0;i<words.length;i++){
            System.out.println(""+words[i].charAt(0)+words[i].charAt(words[i].length()-1));

        }

    }
}
