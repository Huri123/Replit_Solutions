package Methods;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char

 */
public class _146Methods8_SplitPersonInfo_VoidMethods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {
        //your code here
        String[] str=info.split(",");
        // System.out.println(Arrays.toString(str));
        System.out.println("person name: "+str[0]+" last name: "+str[1]+" age: "+str[2]);

    }//end person

}
