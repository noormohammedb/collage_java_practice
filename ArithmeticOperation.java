import java.util.Scanner;

public class ArithmeticOperation {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int num1, num2, option;
    System.out.println("enter 2 numbers : ");
    num1 = myScanner.nextInt();
    num2 = myScanner.nextInt();

    // System.out.println(num1 + " " + num2);

    System.out.println("1. addition : \n2. subtraction : \n3. Multiplication : \n4. Division :");

    option = myScanner.nextInt();

    switch (option) {
      case 1:
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        break;
      case 2:
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        break;
      case 3:
        System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
        break;
      case 4:
        System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
        break;

      default:
        System.out.println("Invalid Option");
    }

    myScanner.close();
  }
}
