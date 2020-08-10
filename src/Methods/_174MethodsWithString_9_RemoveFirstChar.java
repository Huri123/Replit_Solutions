package Methods;

/*
Instructions from your teacher:
The method gets a string and returns a string minus the first letter.

for example:

removeFirst("aaa")
returns "aa"

 */
public class _174MethodsWithString_9_RemoveFirstChar {
    public static String removeFirst(String target) {
        String rem = "";
        rem = target.substring(1, target.length());

        return rem;
    }

    public static void main(String[] args) {
        String rem = removeFirst("aaa");
        System.out.println(rem);
    }
}
