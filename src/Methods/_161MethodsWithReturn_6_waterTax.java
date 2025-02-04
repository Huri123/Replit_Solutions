package Methods;

/*
Instructions from your teacher:
This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)
returns 30

waterTax(55)
returns 49.5

waterTax(101)
returns 140.9

waterTax(151)
returns 235.9

the regular calculation under 50 is
bill = units * 0.60;
above 50 is:
bill = units * 0.90;

above 100 the calculation is like above 50 but with a 50 as fine

and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .

 */
public class _161MethodsWithReturn_6_waterTax {
    public static double waterTax(double units) {
        double bill = 0.0;

        //your code here
        if (units <= 50) {
            bill = units * 0.60;
        } else if (units > 50&&units<100) {
            bill = units * 0.90;
        } else if (units >= 100 && units < 150) {
            bill = (units * 0.90) + 50;
        } else {
            bill = (units * 0.90) + 100;

        }//end waterTax

        return bill;
    }
    public static void main(String[]args){
        double result= waterTax(50);
        System.out.println(result);


    }
}
