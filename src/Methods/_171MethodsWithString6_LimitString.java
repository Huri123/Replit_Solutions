package Methods;

/*
Instructions from your teacher:
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)
 */
public class _171MethodsWithString6_LimitString {
    public static String limit(String text, int maxLength) {

        return text.substring(0,maxLength);
    }

    public static void main(String[] args) {
        String str=limit("abcd", 2);
        System.out.println(str);

    }
}
