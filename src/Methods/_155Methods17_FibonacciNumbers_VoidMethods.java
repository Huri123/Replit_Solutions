package Methods;

import java.util.Scanner;

/*
Instructions from your teacher:
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
 */
public class _155Methods17_FibonacciNumbers_VoidMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int[] fib = new int[num+1];
        fib[0]=0;
        fib[1]=1;
        for (int i=2;i<=fib.length-1;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[num]);

    }
}
    /*
    int[] fib = new int[num+1];
     fib[0]=0;
     fib[1]=1;
     for (int i=2;i<=num;i++){
       fib[i]=fib[i-1]+fib[i-2];
     }
    System.out.println(fib[num]);
  }
     */

