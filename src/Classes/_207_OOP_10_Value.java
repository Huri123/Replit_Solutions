package Classes;

/*
Instructions from your teacher:
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
it getVal returns the last value passed to setVal. Otherwise if the "single int parameter"
constructor was used to create the object, getVal returns the value passed to that  constructor.
Otherwise getVal returns 0.
 */
public class _207_OOP_10_Value {
    public static void main(String[] args) {
        Value v1 = new Value(100);
        System.out.println("current value of val is " + v1.getVal());
        System.out.println("current value of modified is " + v1.wasModified());
        v1.setVal(200);
        System.out.println("current value of val is " + v1.getVal());
        System.out.println("current value of modified is " + v1.wasModified());
    }
}

class Value {
    private int val = 0;
    private boolean wasModified = false;
    //WRITE YOUR CODE HERE

    public Value(int val) {
        this.val = val;
    }

    public Value() {
    }

    public void setVal(int v) {
        this.val = v;
        wasModified = true;
    }

    public boolean wasModified() {
        return wasModified;
    }

    public int getVal() {
        return val;
    }


}