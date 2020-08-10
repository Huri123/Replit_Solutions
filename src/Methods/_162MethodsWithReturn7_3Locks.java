package Methods;

/*
Instructions from your teacher:
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table
 */
public class _162MethodsWithReturn7_3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return a==true&&b==true||c==true?true:false;
    }//end threeLocks

}