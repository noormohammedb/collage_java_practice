import java.util.Scanner;

public class CheckPrimeOrNot {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("enter number : ");
    int flag = 0, i, userValue = myScanner.nextInt();

    for (i = 2; i <= userValue; i++) {
      if (userValue % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag == 0) {
      System.out.println(userValue + " is not prime");
    } else {
      System.out.println(userValue + " is prime");
    }

    myScanner.close();
  }
}
