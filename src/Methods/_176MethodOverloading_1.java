package Methods;

import java.util.Arrays;

/*
Instructions from your teacher:
In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
 First method should work with array of integers (int[]) and return int, and second method should work
 with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */
public class _176MethodOverloading_1 {
    public static int findMax(int arr[]) {

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        return max;
    }

    public static double findMax(double d[]) {
        Arrays.sort(d);
        double max = d[d.length - 1];
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        double d[] = {1.2, 4.5, 3.5, 9.5};

        System.out.println(findMax(arr));

    }
}
