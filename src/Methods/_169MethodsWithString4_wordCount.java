package Methods;

/*
Instructions from your teacher:
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */
public class _169MethodsWithString4_wordCount {

    public static int wordCount(String words) {

        int count = 0;
        String[] str = words.split(" ");
        for (int i = 0; i < str.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count = wordCount("I like java");
        System.out.println(count);
    }
}
