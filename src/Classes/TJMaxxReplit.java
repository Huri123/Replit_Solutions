package Classes;

import java.util.ArrayList;
import java.util.List;

/*
Instructions from your teacher:

In this assignment you will practice:
inheritance
constructors and calling parent class constructor
overriding
list with custom classes

Please follow the instructions on top of each method.

Work on this flow:
Item > OnSaleItem > TJMaxx
 */
public class TJMaxxReplit {
    public static void main(String[] args) {
    }
}

/**
 * SubClass of Item
 */
class OnSaleItem extends Item {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount      - Calls Super class constructor by passing name,quantity,catalogNumber,price
     *                      - it will assign the price after deducting(minus) discount from the price
     *                      - assigns discount
     */
    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
        super(name, quantity, catalogNumber, price - price * (discount / 100));
        this.discount = discount;
    }

    /**
     * getter for discount
     *
     * @return
     */
    public double getDiscount() {
        //TODO
        return discount;
    }

    /**
     * setter for discount
     *
     * @param discount
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     * * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     */
    @Override
    public String toString() {
        return "OnSaleItem{discount=" + discount + "%, name=" + getName() + ", price=" + getPrice() + "}";
    }
}

class Item {

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price         assigns to values to instance variables
     */
    public Item(String name, int quantity, int catalogNumber, double price) {
        this.name = name;
        this.quantity = quantity;
        this.catalogNumber = catalogNumber;
        this.price = price;


    }

    /**
     * setter for name instance variable
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter for private price
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter for price
     *
     * @return
     */
    public double getPrice() {

        return price;
    }

    /**
     * getter for name
     *
     * @return
     */
    public String getName() {


        return name;
    }


    public int getQuantity() {
        //TODO
        return quantity;

    }

    public void setQuantity(int quantity) {
        //TODO
        this.quantity = quantity;
    }

    public int getCatalogNumber() {
        //TODO
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {

        this.catalogNumber = catalogNumber;
    }

    /**
     * Override toString:
     *
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        return "Regular Item{name='" + name + "', catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price=" + price + "}";
    }

}


/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private ArrayList<Item> regularItems;
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     *
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);

    }

    /**
     * adds OnSaleItem object to onSaleItems list
     *
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);

    }

    /**
     * getter for regularItems
     *
     * @return
     */
    public ArrayList<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     *
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     *
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     *
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     *
     * @return
     */
    public List<String> getAllItemNames() {
        ArrayList<String> allList = new ArrayList<>();
        for (int i = 0; i < regularItems.size(); i++) {
            allList.add(regularItems.get(i).getName());
        }
        for (int k = 0; k < onSaleItems.size(); k++) {
            allList.add(onSaleItems.get(k).getName());
        }

        return allList;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     *
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {

        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                return regularItems.get(i).getPrice();
            }
        }
        for (int k = 0; k < onSaleItems.size(); k++) {
            if (onSaleItems.get(k).getCatalogNumber()==catalogNumber){
                return onSaleItems.get(k).getPrice();
            }
        }
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     *
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {


        for (int k = 0; k < onSaleItems.size(); k++) {
            if (onSaleItems.get(k).getName()==name){
                return onSaleItems.get(k);
            }
        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     *
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for (int i = 0; i < regularItems.size(); i++) {
            if (regularItems.get(i).getCatalogNumber() == catalogNumber) {
                regularItems.remove(regularItems.get(i));
            }
        }
        for (int k = 0; k < onSaleItems.size(); k++) {
            if (onSaleItems.get(k).getCatalogNumber() == catalogNumber){
                onSaleItems.remove(onSaleItems.get(k));
            }
        }

    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     * - decrease the count of the Item by 1
     * - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber below method is already completed
     */
    public void buyItem(int catalogNumber) {
        for (Item c : regularItems) {
            if (c.getCatalogNumber() == catalogNumber) {
                int q = c.getQuantity() - 1;
                if (q == 0) {
                    removeItem(c.getCatalogNumber());
                } else {
                    c.setQuantity(q);
                }
                break;
            }
        }

        for (Item s : onSaleItems) {
            if (s.getCatalogNumber() == catalogNumber) {
                int qo = s.getQuantity() - 1;
                if (qo == 0) {
                    removeItem(s.getCatalogNumber());
                } else {
                    s.setQuantity(qo);
                }
                break;
            }
        }


    }

}
