
/*
    temperature convertions

    faren heat to celcius
    celcius to faren heat
*/
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("convert to\n1. Fahrenheit :  \n2. Celsius : ");
        int option = myScanner.nextInt();
        System.out.print("enter temp : ");
        float userValue = myScanner.nextFloat();

        if (option == 1) {
            float farenHeat = (userValue * 1.8f) + 32;
            System.out.println("Faren Heat : " + farenHeat);

        } else if (option == 2) {
            float celcius = (userValue - 32) * 5 / 9;
            System.out.println("Celcius : " + celcius);
        } else {
            System.out.println("Invalid Selection");
        }
        myScanner.close();
    }
}

// System.out.println(((Object)VARIABLE).getClass().getName());
// get type of a variable