package Arrays;

/*
Instructions from your teacher:
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */
import java.util.Arrays;
public class switch_Elements {
    public static void main(String[] args) {
        int i[]={1,2,3,4};

        System.out.println(Arrays.toString( do_switch(i)));
    }
    public static int[] do_switch(int[] i)
    {
        int zero=i[0];
        int l=i[i.length-1];
        i[0]=l;
        i[i.length-1]=zero;
        return i;
    }
}
