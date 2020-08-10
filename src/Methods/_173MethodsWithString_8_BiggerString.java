package Methods;

/*
Instructions from your teacher:
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class _173MethodsWithString_8_BiggerString {
    public static String biggerS(String a, String b) {
        String max = "";
        if (a.length() < b.length()) {
            max = b;
        } else if (b.length() < a.length()) {
            max = a;
        }
        return max;
    }

    public static void main(String[] args) {
        String bigger = biggerS("apple", "orange");
        System.out.println(bigger);
    }
}
