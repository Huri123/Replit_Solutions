package Methods;

/*
Instructions from your teacher:
The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false
 */
public class _160MethodsWithReturn5HamletLogic {
    public static void main(String[] args) {
        boolean a=hamletQuote(true,false);
        System.out.println(a);
    }
    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        boolean result;
        if (toBe ==false&& notToBe==false) {
            result= false;
        } else  {
            result= true;

        }
        return result;
    }
}
