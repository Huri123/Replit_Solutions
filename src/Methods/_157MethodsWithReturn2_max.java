package Methods;

/*
Instructions from your teacher:
max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */
public class _157MethodsWithReturn2_max {
    public static void main(String[] args) {
        int a=max(40,20);
        System.out.println(a);
    }

    public static int max(int x, int y) {
        int max = 0;
        if (x >= y) {
            max = y;
        } else {
            max = x;
        }
        return max;
    }
}

