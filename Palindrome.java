import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("enter number : ");
    int remainder, reverseNumber = 0, userValueCopy, userValue = myScanner.nextInt();
    userValueCopy = userValue;
    while (userValue != 0) {
      remainder = userValue % 10;
      reverseNumber = (reverseNumber * 10) + remainder;
      userValue /= 10;
    }
    if (userValueCopy == reverseNumber) {
      System.out.println(userValueCopy + " is Palindrome");
    } else {
      System.out.println(userValueCopy + " is not Palindrome");
    }

    myScanner.close();
  }
}
