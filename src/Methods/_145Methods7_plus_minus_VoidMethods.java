package Methods;

import java.util.Scanner;

/*
Instructions from your teacher:
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
 */
public class _145Methods7_plus_minus_VoidMethods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus(int arr[]){
        int countn=0;
        int countp=0;
        int countz=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i]>0){
                countp++;
            }
            else if (arr[i]<0){
                countn++;
            }else{
                countz++;
            }
        }
        System.out.println("positives:"+countp+", negatives:"+countn+", zeros:"+countz);
    }



}
