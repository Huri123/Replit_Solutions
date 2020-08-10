package Methods;

import java.util.Scanner;

/*
Instructions from your teacher:
Given method called cube. Write all required code inside this method in order  to asks the user for a number
and then prints the cubed value of that number:


Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
public class _141Methods3FindCube_VoidMethods {
    public static void cube(int a) {
        //your code here
        int cube = a * a * a;
        System.out.println(cube);

    }//end cube

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        cube(a);

    }
}
