package Methods;

import java.util.Scanner;

/*
Instructions from your teacher:
Complete a method isPalindrome() that will check if number is a palindrome.
 Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */
public class _154Methods16CheckIfNumberIspalindrome_VoidMethodsMyR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        String str = "" + num;
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        boolean rev=true;
        if (reverse.equalsIgnoreCase(str)){
            rev=true;
        }else{
            rev=false;
        }
        System.out.println(rev);
    }
}
