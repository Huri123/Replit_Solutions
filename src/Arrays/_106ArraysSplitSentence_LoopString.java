package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
public class _106ArraysSplitSentence_LoopString {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String words[]=sentence.split(" ");
        for(String each:words){
            System.out.println(each);
        }
        /*
       ============================================================================
        110. Arrays - countEvens_Loop
        nstructions from your teacher:
        Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.
        Note: MUST USE For Each Loop

        nums → [2, 1, 2, 3, 4]) → 3
        nums → [2, 2, 0, 3, 5]) → 3
        nums → [1, 3, 5, 7, 9]) → 0

         */


      /*  Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: Write your code below

        int count = 0;
        for (int each:nums) {
            if (each % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        /*
        ==========================================================================================================

        113. Print even from 80 to 20_Loop
        Instructions from your teacher:
Write a for loop that prints all the even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
         */
        int arr[]=new int[61];
        int a=0;
        for (int i=80;i>=20;i--){
            arr[a]=i;
            a++;
        }
        for (int each:arr){
            if(each%2==0){
                System.out.println(each+" ");
            }
        }

    }
}
