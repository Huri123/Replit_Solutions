package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
 If no consecutive 5s or no 5s are detected in your code then print false.

nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
 */
public class _104ArraysHas55_LoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
for (int i =0;i<nums.length-1;i++) {
    if (nums[i] == 5 && nums[i + 1] == 5) {
        System.out.println("true");
        System.exit(0);
    }
}
        System.out.println("false");

        */
       /*
       105. Arrays - print first-last char II_Loop, Array
       Instructions from your teacher:
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
        */
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String b[]=new String[words.length];
        for (int i =0;i<words.length;i++) {
            b[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }
        System.out.println(Arrays.toString(b));

    }
}

