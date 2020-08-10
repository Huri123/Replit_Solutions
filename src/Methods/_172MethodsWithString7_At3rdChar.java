package Methods;

/*
Instructions from your teacher:
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"


 */
public class _172MethodsWithString7_At3rdChar {
    public static String at3(String target, String word) {
        String insert = "";
        insert += "" + target.substring(0, 3) + word + target.substring(3, target.length());

        return insert;
    }

    public static void main(String[] args) {
        String result = at3("longword", "foo");
        System.out.println(result);
    }
}
