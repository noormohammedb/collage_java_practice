/*
    Program to find odd or even
*/
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.print("enter number : ");
		Scanner myScanner = new Scanner(System.in);
		Integer myNumber = myScanner.nextInt();

        if (myNumber%2 == 0) {
            System.out.println(myNumber+" is even");
        } else {
            System.out.println(myNumber+" is odd");
        }
        myScanner.close();
    }
}
