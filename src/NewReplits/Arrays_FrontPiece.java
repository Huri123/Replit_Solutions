package NewReplits;

/*
Instructions from your teacher:
Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2,
use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */

import java.util.*;

public class Arrays_FrontPiece {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if (num.length >= 2) {
            int[] arr = new int[2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = num[i];
            }
            System.out.println(Arrays.toString(arr));
        } else if (num.length == 1) {
            System.out.println(Arrays.toString(num));
        }



        /*if (num.length >= 2) {
            int[] arr = new int[2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = num[i];
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println(Arrays.toString(num));
        }
       */

    }
}

       /*


        if (num.length >= 2) {
            int arr[] = new int[2];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = num[i];
            }
            System.out.println(Arrays.toString(arr));
        } else {
            int arr[] = new int[1];
            arr[0] = num[0];
            System.out.println(Arrays.toString(arr));
        }
    }}
        */

