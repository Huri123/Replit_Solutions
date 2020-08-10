package Inheritance;

/*
Instructions from your teacher:
Assume the existence of a BankAccount class.
Define a subclass, SavingsAccount that contains the following:
A double instance variable, interestRate.
A method getInterestRate that returns a value of interestRate.
A constructor that accepts a parameter of type double which is used to initialize the instance variable.
 */
public class Inheritance_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class SavingsAccount extends BankAccount {
    public double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;

    }
}

class BankAccount {
    // you dont need to make any changes in this class
}