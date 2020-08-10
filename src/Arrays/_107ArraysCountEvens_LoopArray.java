package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
public class _107ArraysCountEvens_LoopArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       /* int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
        */
/*
==========================================================================================================================
109. Arrays - printing 01_Loop, String

Instructions from your teacher:
The code provided in your main method will take in five Strings and save them into an array called arr.
 Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr
 is at least 3 letters long.
Example:
arr -> ["apple", "banana"]
 prints: app
         ban
 */
       /* String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        String result[]=new String[arr.length];

        for (int k=0;k<arr.length;k++){
            result[k]=""+arr[k].substring(0,3);


            }
        System.out.println(Arrays.toString(result));

        */
        /*
        =============================================================================================================
        114. Arrays - find non-duplicate _ Loop

        Instructions from your teacher:

        Given an array nums with 7 integers every element is repeated twice - except one.
         Find that element and print it to console.

        Example:

        nums -> [1, 1, 2, 3, 4, 3, 4]
         2

         */
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt()};


        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {

                if (nums[i] == nums[k]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }

        }

    }
}
