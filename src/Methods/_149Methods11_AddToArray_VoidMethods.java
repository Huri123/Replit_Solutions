package Methods;

import java.util.Arrays;
import java.util.Scanner;

/*
Instructions from your teacher:
add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */
public class _149Methods11_AddToArray_VoidMethods {
    public static void add_to_r(int[] r, int n) {
        //create new array with one more position.
        int array[] = new int[r.length + 1];
        for (int i = 0; i < array.length; i++) {
            if(i==r.length){
                array[r.length]=n;
                continue;
            }
            array[i] = r[i];
        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
/*Muhtar'in kodu:
import java.util.Scanner;

public class A95_GetSandwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int countBread = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("bread")) {
                countBread++;
            }
        }

        if (countBread == 1 || countBread < 10) {
            System.out.println("nothing");
        } else if (countBread > 2) {
            System.out.println(str.substring(str.indexOf("d") + 1, str.lastIndexOf("b")));
        }

    }
}

 */
