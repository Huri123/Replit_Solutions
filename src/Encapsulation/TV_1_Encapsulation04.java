package Encapsulation;

import sun.management.snmp.jvminstr.JvmOSImpl;

/*
Instructions from your teacher:
 Write a custom class TV that has 4 instance variables: int channel=1, int volumeLevel=1,
 boolean on = false, String brand = "undefined".
Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".
Also, create one more constructor that defines instance variable brand, and displays message:
"Creating TV object using 1 arg - constructor".
Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel)
and brand (getBrand/setBrand) instance variables.
Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If tv is already on,
no need to turn it on again, display message: "TV is already ON". If tv is already off, then no need to
turn it off again, display message: "TV is already OFF".
Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
Volume can be only in the range between 1 and 7. You may change volume only if TV is on. Otherwise, display message:
"ERROR: TV is either OFF or invalid Volume level". Create isOn() method that will check tv status.
 */
public class TV_1_Encapsulation04 {

    public static void main(String[] args) {

    }
}

class TV {

    //Write a custom class TV that has 4 instance variables: int channel=1, int volumeLevel=1,
    // boolean on = false, String brand = "undefined".
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    //Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".
    public TV() {

        System.out.println("Creating TV object using no Args- constructor");
    }

    //Also, create one more constructor that defines instance variable brand, and displays message:
    //"Creating TV object using 1 arg - constructor".
    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    //Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel)
    //and brand (getBrand/setBrand) instance variables.
    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    //Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
    //If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
    //Volume can be only in the range between 1 and 7. You may change volume only if TV is on. Otherwise, display message:
    //"ERROR: TV is either OFF or invalid Volume level". Create isOn() method that will check tv status.
    public void setChannel(int channel) {
        if (on) {
            if (channel > 0 && channel <= 120) {
                this.channel = channel;
            } else {

                System.out.println("ERROR: TV is either OFF or invalid Channel");
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void setVolumeLevel(int volumeLevel) {
        if (on){
            if(volumeLevel<=7&&volumeLevel>=1){
                this.volumeLevel=volumeLevel;
            }
            else {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }

        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }



    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Declare methods channelUp() to increase variable channel by one
    public void channelUp() {
        channel += 1; //channel++; de olabilir
    }

    //and channelDown() to decrease variable channel by one.
    public void channelDown() {
        channel -= 1; //channel--; de olabilir
    }

    //Declare methods volumeUp() to increase variable volume by one
    public void volumeUp() {
        volumeLevel += 1; //volumeLevel++; de olabilir
    }

    //and volumeDown() to decrease variable volume by one.
    public void volumeDown() {
        channel -= 1; //burasi channel--; de olabilir
    }

    //Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If tv is already on,
    //no need to turn it on again, display message: "TV is already ON". If tv is already off, then no need to
    //turn it off again, display message: "TV is already OFF".
    public boolean isOn() {

        return on;
    }

    public void turnOn() {
        if (isOn()) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }

    public void turnOff() {
        if (!isOn()) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }
    }
}


/*
public class TV {
    int channel=1; int volumeLevel=1; boolean on = false;
    String brand = "undefined";
    public TV(){
        System.out.println("Creating TV2 object using no Args- constructor");
    }
    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV2 object using 1 arg - constructor");
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel) {
        if(on) {
            if (volumeLevel > 0 && volumeLevel <= 7) {
                this.volumeLevel = volumeLevel;
            }
        } else{
            System.out.println("ERROR: TV2 is either OFF or invalid Volume level");
        }
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        if(on){
        if(channel>0 && channel<=120){
            this.channel=channel;
        } else{
            System.out.println("ERROR: TV2 is either OFF or invalid Channel");
        }}
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void channelUp(){
        this.channel=channel+1;
    }
    public void channelDown(){
        this.channel=channel-1;
    }
    public void volumeUp(){
        this.volumeLevel=volumeLevel+1;
    }
    public void volumeDown(){
        this.volumeLevel=volumeLevel-1;
    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(isOn()) {
            System.out.println("TV2 is already ON");
        }else{
            on = true;
        }
    }
    public void turnOff() {
        if(!isOn()) {
            System.out.println("TV2 is already OFF");
        } else {
            on = false;
        }
    }
 */

