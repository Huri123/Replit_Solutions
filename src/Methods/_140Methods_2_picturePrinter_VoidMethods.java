package Methods;

import java.util.Scanner;

/*
Instructions from your teacher:
Fill out the main method so that it will output:


select image:
 1)sunset
 2)earth
 3)desert

it will get an int as a scanner input

if its 1 call  printSunset() method
if its 2 call  printEarth() method
if its 3 call  printDesert() method
 */
public class _140Methods_2_picturePrinter_VoidMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if (num==1){
            printSunset();
        }else if(num==2){
            printEarth();
        }else if(num==3){
            printDesert();
        }


    }

    public static void printSunset()
    {
        System.out.print("_\\/_                 |                _\\/_\r\n" +
                "/o\\\\             \\       /            //o\\\r\n" +
                " |                 .---.                |\r\n" +
                "_|_______     --  /     \\  --     ______|__\r\n" +
                "1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
    }//end print_sunset

    public static void printEarth()
    {

        System.out.print("22        _____\r\n" +
                "    ,-:` \\;',`'-, \r\n" +
                "  .'-;_,;  ':-;_,'.\r\n" +
                " /;   '/    ,  _`.-\\\r\n" +
                "| '`. (`     /` ` \\`|\r\n" +
                "|:.  `\\`-.   \\_   / |\r\n" +
                "|     (   `,  .`\\ ;'|\r\n" +
                " \\     | .'     `-'/\r\n" +
                "  `.   ;/        .'\r\n" +
                "jgs `'-._____.");

    }//print_earth

    public static void printDesert()
    {

        System.out.print(" 33   .    _    +     .  ______   .          .\r\n" +
                " (      /|\\      .    |      \\      .   +\r\n" +
                "     . |||||     _    | |   | | ||         .\r\n" +
                ".      |||||    | |  _| | | | |_||    .\r\n" +
                "   /\\  ||||| .  | | |   | |      |       .\r\n" +
                "__||||_|||||____| |_|_____________\\__________\r\n" +
                ". |||| |||||  /\\   _____      _____  .   .\r\n" +
                "  |||| ||||| ||||   .   .  .         ________\r\n" +
                " . \\|`-'|||| ||||    __________       .    .\r\n" +
                "    \\__ |||| ||||      .          .     .\r\n" +
                " __    ||||`-'|||  .       .    __________\r\n" +
                ".    . |||| ___/  ___________             .\r\n" +
                "   . _ ||||| . _               .   _________\r\n" +
                "_   ___|||||__  _ \\\\--//    .          _\r\n" +
                "     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" +
                "_  ^      .  -    . \\.|");

    }//end



}
