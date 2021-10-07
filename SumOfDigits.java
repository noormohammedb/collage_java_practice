import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("enter number : ");
    int number, sumOfNumber = 0, userValueCopy, userValue = myScanner.nextInt();
    userValueCopy = userValue;
    while (userValue > 0) {
      number = userValue % 10;
      sumOfNumber = sumOfNumber += number;
      userValue /= 10;
    }
    System.out.println("sum of " + userValueCopy + " is : " + sumOfNumber);
    myScanner.close();
  }
}
