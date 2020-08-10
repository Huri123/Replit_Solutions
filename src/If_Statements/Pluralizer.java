package If_Statements;
/*
Instructions from your teacher:
 Two horses. Five monkeys. Twenty flies. One cat. Nine lives. Despite the English language being one of
 the most commonly used languages around the world, it is also quite complicated to learn if you are not a native
 speaker. Taking a noun and converting it to its plural form has a dozen rules and even more special cases.

In this project, you will be creating a program that takes a given non-negative integer and a given singular noun
as a String.  You will have to print out the number, followed by the string in its plural form (unless the number is 1).

The given inputs are:
int amt;
String word;

For example, let's say your inputs are as follows:
# in: 4
word: apple
Your program should print out "4 apples"

# in: 0
word: apple
Your program should print out "0 apples"

# in: 1
word: apple
Your program should print out "1 apple" Be prepared to handle the following rules:
 */

import java.util.Scanner;

public class Pluralizer {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        String result = "";
        if (word.endsWith("fe")) {
            result = amt + " " + word.substring(0, word.length() - 2) + "ves";
        } else if (word.endsWith("sh") || word.endsWith("ch") || word.endsWith("o")) {
            result = amt + " " + word.substring(0, word.length()) + "es";
        } else if (word.endsWith("us")) {
            result = amt + " " + word.substring(0, word.length() - 2) + "i";
        } else if (word.endsWith("uy") || word.endsWith("oy") || word.endsWith("ay") || word.endsWith("ey")) {
            result = amt + " " + word.substring(0, word.length()) + "s";
        } else if (word.endsWith("y")) {
            result = amt + " " + word.substring(0, word.length() - 1) + "ies";
        } else {
            result = amt + " " + word + "s";

        }
        if (amt == 1) {
            result = amt + " " + word;
        }
        System.out.println(result);
    }
}
