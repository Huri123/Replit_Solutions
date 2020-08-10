package NewReplits;

import java.util.Scanner;

/*
Instructions from your teacher:
 For you to do:

Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
 */
public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        String result="";
        if(word.endsWith("ey")){ //because endswith(ey) is more specific bu yuzden ilk yazdik. yoksa y hepsini kapiyor
            result+="-eys";
        }else if(word.endsWith("y")){
            result+="-ies";
        }else if(word.endsWith("ife")){
            result+="-ives";
        }else {
            result+="s";
        }
        System.out.println(result);
    }
}

