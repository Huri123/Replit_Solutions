package Constructor;

/*
Instructions from your teacher:
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings,
the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping, and
the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */
public class PizzaReplit {
    public static void main(String[] args) {

       // System.out.println("Hello world!");
        Pizza pizza=new Pizza("small", 5,4,2);
        System.out.println(pizza.getDescription());


    }
}

class Pizza {
    private String size;
    private int numOfcheese;
    private int numOfPepperoni;
    private int numOfHam;

    public Pizza(String size, int numOfcheese, int numOfPepperoni, int numOfHam) {
        this.size = size;
        this.numOfcheese = numOfcheese;
        this.numOfPepperoni = numOfPepperoni;
        this.numOfHam = numOfHam;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfcheese() {
        return numOfcheese;
    }

    public int getNumOfPepperoni() {
        return numOfPepperoni;
    }

    public int getNumOfHam() {
        return numOfHam;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfcheese(int numOfcheese) {
        this.numOfcheese = numOfcheese;
    }

    public void setNumOfPepperoni(int numOfPepperoni) {
        this.numOfPepperoni = numOfPepperoni;
    }

    public void setNumOfHam(int numOfHam) {
        this.numOfHam = numOfHam;
    }

    /*
    A public method named calcCost( ) that returns a double that is the cost of the pizza.
    Pizza cost is determined by:
    Small: $10 + $2 per topping
    Medium: $12 + $2 per topping
    Large: $14 + $2 per topping
     */
   public double calcCost() {

       if (size.equals("Small")) {
         return (numOfPepperoni + numOfHam + numOfcheese) * 2 + 10;
       } else if (size.equals("Medium")) {
           return  (numOfPepperoni + numOfHam + numOfcheese) * 2 + 12;
       } else  {
          return  (numOfPepperoni + numOfHam + numOfcheese) * 2 + 14;
       }

   }


/*
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping, and
the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */
public String getDescription(){
    return size+" Pizza with "+numOfcheese+" Cheese toppings, "+numOfPepperoni+" Pepperoni toppings, and "
            +numOfHam+" Ham toppings."+"\nTotal Price: "+calcCost();
}

}

/*
 private String size;
    private int numberOfCheese;
    private int numberOfPepperoni;
    private int numberOfHam;
//    Constructor(s) that set all of the instance variables.
    public Pizza(String size, int numberOfCheese, int numberOfPepperoni, int numberOfHam){
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
        this.numberOfHam = numberOfHam;
    }
    //Public methods to get and set the instance variables.
    public String getSize() {
        return size;
    }
    public int getNumberOfCheese(){
        return numberOfCheese;
    }
    public int getNumberOfPepperoni(){
        return numberOfPepperoni;
    }
    public int getNumberOfHam(){
        return numberOfHam;
    }
    public void setSize(String size){
        this.size = size;
    }
    public void setNumberOfCheese(int numberOfCheese){
        this.numberOfCheese = numberOfCheese;
    }
    public void setNumberOfPepperoni(int numberOfPepperoni){
        this.numberOfPepperoni = numberOfPepperoni;
    }
    public void setNumberOfHam(int numberOfHam){
        this.numberOfHam = numberOfHam;
    }

        A public method named calcCost( ) that returns a double that is the cost
    of the pizza.
    Pizza cost is determined by:
    Small: $10 + $2 per topping
    Medium: $12 + $2 per topping
    Large: $14 + $2 per topping

public double calcCost(){
    if(size.equals("small")){
        return (numberOfPepperoni + numberOfCheese + numberOfHam) * 2 + 10;
    }else if(size.equals("medium")){
        return (numberOfPepperoni + numberOfCheese + numberOfHam) * 2 + 12;
    }else{
        return (numberOfPepperoni + numberOfCheese + numberOfHam) * 2 + 14;
    }
}

    A public method named getDescription() that returns a String containing
the pizza size, quantity of each topping, and the pizza cost as calculated
 by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0

    public String getDescription(){
        return size+ " Pizza with "+numberOfCheese+" Cheese toppings, "+numberOfPepperoni
                +" Pepperoni toppings, and "+numberOfHam+" Ham toppings."+"\nTotal Price: "+calcCost();
    }
 */