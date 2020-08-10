package Classes;
/*
Instructions from your teacher:

There are number of ways to describe color to computers, smart phones, tablets, browsers etc.
One of the popular ways is to use RGB (red, green, blue) value.

More info: https://en.wikipedia.org/wiki/RGB_color_model
RGB chart:  https://www.rapidtables.com/web/color/RGB_Color.html

In this task, we are going to write a simple Color class, that can represent only few major colors.

Available colors are already initialized to static final arrays.

We will practice :
overloading constructors
this() keyword
comparing arrays
overriding toString method

Examples:
Color color = new Color();
System.out.println(color.toString() ) ; // prints "white"

Color color2 = new Color(255, 0, 0);
System.out.println(color2.toString() ) ; // prints "red"

Color color3 = new Color(255, 44, 88);
System.out.println(color3.toString() ) ; // prints "n/a"

Color color4 = new Color(192, 192, 192);
System.out.println(color4 ) ; // prints "light gray"
 */
import sun.plugin.dom.css.Rect;

import java.util.*;

public class color {

    public static void main(String[] args) {

        Color color = new Color();
        System.out.println(color.toString() ) ; // prints "white"

        Color color2 = new Color(255, 0, 0);
        System.out.println(color2.toString() ) ; // prints "red"

        Color color3 = new Color(255, 44, 88);
        System.out.println(color3.toString() ) ; // prints "n/a"

        Color color4 = new Color(192, 192, 192);
        System.out.println(color4 ) ; // prints "light gray"
    }
}


/**
 * represents basic Color class example
 */
 class Color {
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    /**
     * Available colors - ready with rgb code
     */

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
    public Color(int r, int g, int b){
        //TODO
        rgb[0]=r;
        rgb[1]=g;
        rgb[2]=b;
    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * try to use this() keyword to call above constructor to set white color
     */
    public Color() {
        //TODO
        this(255,255,255);
    }

    /**
     * Override toString(from Object class).
     * Provides string description of the color like "red" ,"blue" based on
     * rgb value.
     * Compare value of rgb array with static color code arrays
     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
     * to compare 2 int arrays
     * @returns a String color name like
     * "white" or "blue"
     * If rgb values does not match any available combinations, return "n/a"
     *
     * Ex:
     * Color color = new Color();
     * System.out.println(color.toString() ) ; // prints "white"
     *
     * Color color = new Color(255, 0, 0);
     * System.out.println(color.toString() ) ; // prints "red"
     *
     * Color color4 = new Color(192, 192, 192);
    System.out.println(color4 ) ; // prints "light gray"
     */
    public String toString() {


        //TODO

        String str="";

        if (Arrays.equals(rgb,WHITE)){
            str="white";
        }else if(Arrays.equals(rgb,LIGHT_GRAY)){
            str="light gray";
        }else if(Arrays.equals(rgb,GRAY)){
            str="gray";
        }else if(Arrays.equals(rgb,DARK_GRAY)){
            str="dark gray";
        }else if(Arrays.equals(rgb,BLACK)){
            str="black";
        }else if(Arrays.equals(rgb, RED)){
            str="red";
        }else if(Arrays.equals(rgb,PINK)){
            str="pink";
        }else if(Arrays.equals(rgb,YELLOW)){
            str="yellow";
        }else if(Arrays.equals(rgb,ORANGE)){
            str="orange";
        }else if(Arrays.equals(rgb,GREEN)){
            str="green";
        }else if(Arrays.equals(rgb,MAGENTA)){
            str="magenta";
        }else if(Arrays.equals(rgb,CYAN)){
            str="cyan";
        }else if(Arrays.equals(rgb,BLUE)){
            str="blue";
        }else {
            str="n/a";
        }

        return str;
    }

}



