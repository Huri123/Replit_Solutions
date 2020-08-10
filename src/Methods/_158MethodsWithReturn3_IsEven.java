package Methods;

/*
Instructions from your teacher:
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
 */
public class _158MethodsWithReturn3_IsEven {
    public static void main(String[] args) {
        boolean a= isEven(8);
        System.out.println(a);
    }
    public static boolean isEven(int n) {
        boolean isEven=false;
        if (n%2==0){
            isEven=true;
        }
        return isEven;
    }
}
