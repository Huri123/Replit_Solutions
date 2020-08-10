package Classes;

/*
Instructions from your teacher:
Write a class named ParkingMeter containing:
Two instance variables named timeLeft and maxTime of type int.
The value of timeLeft should be initialized to 0.
A constructor accepting a single integer parameter whose value is
used to initialize the maxTime instance variable.
A method named add that accepts an integer parameter. If the value
of the parameter is equal to 25, the value of timeLeft is increased
by 30; otherwise no increase is performed. Furthermore, the increase
occurs only if the value of timeLeft will not exceed the value of maxTime.
add returns a boolean value: true if timeLeft was increase, false otherwise.
A method named tick that accepts no parameters and returns no value.
tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
A method named isExpired that accepts no parameters. isExpired returns
a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
 */
public class parking_meeter {
    public static void main(String[] args) {

    }
}

class ParkingMeter {

    //Two instance variables named timeLeft and maxTime of type int.
    //The value of timeLeft should be initialized to 0.
    public int timeLeft = 0;
    public int maxTime;

    //A constructor accepting a single integer parameter whose value is
    //used to initialize the maxTime instance variable.
    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    //A method named add that accepts an integer parameter. If the value
    //of the parameter is equal to 25, the value of timeLeft is increased
    //by 30; otherwise no increase is performed. Furthermore, the increase
    //occurs only if the value of timeLeft will not exceed the value of maxTime.
    //add returns a boolean value: true if timeLeft was increase, false otherwise.
    public boolean add(int a) {
        boolean isIncreased = false;
       if (timeLeft < maxTime) {
            if (a == 25) {
                timeLeft += 30;
                isIncreased = true;
            } else {
                timeLeft = timeLeft;
                isIncreased = false;
            }

        }
        return isIncreased;
    }

    //A method named tick that accepts no parameters and returns no value.
    //tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
    public void tick() {
        if (timeLeft > 0) {
            timeLeft -= 1;
        }
    }

    //A method named isExpired that accepts no parameters. isExpired returns
    //a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
    public boolean isExpired() {
        boolean isExpired = false;
        if (timeLeft == 0) {
            return true;
        }
        return isExpired;
    }
}