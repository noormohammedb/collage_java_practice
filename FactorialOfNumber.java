import java.util.Scanner;

public class FactorialOfNumber {
  public int getFactorial(int userInput) {
    int i, factorial = 1;
    for (i = 1; i <= userInput; i++)
      factorial *= i;
    return factorial;
  }

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("enter a number : ");
    int factorial, userValue = myScanner.nextInt();
    FactorialOfNumber fact = new FactorialOfNumber();
    factorial = fact.getFactorial(userValue);
    System.out.println(factorial);

    myScanner.close();
  }

}
