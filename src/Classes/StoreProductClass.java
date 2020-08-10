package Classes;

/*
Instructions from your teacher:
1. Complete the StoreProduct.java class:

Include the following class variables:
* label
* price (as an integer)
* category
* hasExpiration (as a boolean)
* stock (represents how many the store has available)
All class variables should be declared case sensitive

Write four constructors:
* The default constructor
* A secondary constructor that does not have a category or an expiration (category defaults to "misc", hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, or stock (stock defaults to 0)
* A secondary constructor that just does not have stock

2. Test your code with the Main.java class:
Create several StoreProduct objects using all Constructors and print their fields/states to make sure it's correct.

3. Include the following methods:

* public void expired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.  Otherwise, nothing happens.

* public boolean sale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.

* public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) and return that number.
 */
public class StoreProductClass {
     /*
    2. Test your code with the Main.java class:
Create several StoreProduct objects using all Constructors and print their fields/states to make sure it's correct.

     */

    public static void main(String[] args) {
        StoreProduct product1 = new StoreProduct();
        StoreProduct product2 = new StoreProduct("shirt", 30, 2);
        StoreProduct product3 = new StoreProduct("jean", 20);
        StoreProduct product4 = new StoreProduct("disney", 10, "t-shirt", false);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }
}

class StoreProduct {
    /*
    Include the following class variables:
    * label
    * price (as an integer)
    * category
    * hasExpiration (as a boolean)
    * stock (represents how many the store has available)
    All class variables should be declared case sensitive
     */
    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;

    /*
    Write four constructors:
* The default constructor
* A secondary constructor that does not have a category or an expiration
(category defaults to "misc", hasExpiration defaults to false)
* A secondary constructor that does not have a category, expiration, or stock
(stock defaults to 0)
* A secondary constructor that just does not have stock
     */
    public StoreProduct() {
    }

    public StoreProduct(String label, int price, int stock) {

        this.label = label;
        this.price = price;
        this.stock = stock;
        category = "misc";
        hasExpiration = false;
    }

    public StoreProduct(String label, int price) {

        this.label = label;
        this.price = price;
        int stock = 0;
        category = "misc";
        hasExpiration = false;

    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {

        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        stock = 0;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return "Label: " + label + ", Price: " + price + ", Stock: " + stock + ", Category: " + category +
                ", Expiration: " + hasExpiration;
    }

    /*
    3. Include the following methods:

* public void expired(boolean hasExpired)
If the product has an expiration date and hasExpired is true, then it should set the stock to 0.
Otherwise, nothing happens.
     */
    public void expired(boolean hasExpired) {

        if (hasExpired) {
            stock = 0;
        }
    }

    /*
    * public boolean sale(int quantity)
Check if the quantity (being bought) is available given the stock.  If there is enough, then make the sale
by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough,
return false instead.
     */
    public boolean sale(int quantity) {

        if (stock >= quantity) {
            stock -= quantity;
            return true;
        } else {
            return false;
        }
    }

    /*
    * public double getDiscountedPrice(double discount)
The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.
Multiply the product's price by the (1 - discount) and return that number.
     */
    public double getDiscountedPrice(double discount) {

        return price * (1 - discount);
    }
}
