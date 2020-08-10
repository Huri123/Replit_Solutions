package Methods;

import java.util.Scanner;

/*
Instructions from your teacher:
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
public class _139Methods1SimpleCalculator_VoidMethods {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println("result: "+sum);


    }


}
