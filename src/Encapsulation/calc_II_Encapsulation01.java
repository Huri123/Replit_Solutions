package Encapsulation;

/*
Instructions from your teacher:
This assignment is about another calculator class. this time we will calculate two attributes
x and y and put the result in an attribute named result.

x, y and results are all private attributes of int type.

3 Instance variables:
  1) names: x, y, result
      type: int
      Visibility/Access modifier: private

Instance Methods:
   - getResult() - getter method for private result
   - setY(int y) - setter method for private y
   - setX(int x) - setter method for private x
 -  void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result
example:
  Calc a = new Calc();
  a.setX(10);
  a.setY(5);
  a.minus();

  System.out.println(a.getResult());
  prints: 5

  a.plus();

  System.out.println(a.getResult());
  prints: 15
 */
public class calc_II_Encapsulation01 {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = " + a.getResult());//1+1 = 2

    }
}

class Calc {
    /*
    3 Instance variables:
      1) names: x, y, result
          type: int
          Visibility/Access modifier: private
     */
    private int x;
    private int y;
    private int result;

    /*
    Instance Methods:
   - getResult() - getter method for private result
   - setY(int y) - setter method for private y
   - setX(int x) - setter method for private x
 -  void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result
example:
  Calc a = new Calc();
  a.setX(10);
  a.setY(5);
  a.minus();

  System.out.println(a.getResult());
  prints: 5

  a.plus();

  System.out.println(a.getResult());
  prints: 15
     */
    public int getResult() {
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus() {
        result = x + y;
    }

    public void minus() {
        result = x - y;
    }

}
