package Methods;

/*
Instructions from your teacher:
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that checks if its the last or first iteration of the loop
(so you will know whet to print "*" or " ")
 */
public class _143Methods5_SimplePrintPattern_VoidMethods {
    public static void printHollowRect() {
        // write your code here:
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5; i++) {
                if (k == 0 || k == 4 || i == 0 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }


}
