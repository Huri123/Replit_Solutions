package Methods;

/*
Instructions from your teacher:
This method gets two strings (text and badWord)  and returns a string.

basicly what it doEs is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)


 */
public class _170MethodsWithString_5_CleanString {
    public static String clean(String text, String badWord) {

        String str = "";
        if (text.contains(badWord)) {
            str += text.replace(badWord, "");
        } else {
            str = text;
        }

        return str;

    }

    public static void main(String[] args) {
        String a = "he said bla bla bla";
        String b = "bla";
        String result = clean(a, b);
        System.out.println(result);
    }
}
