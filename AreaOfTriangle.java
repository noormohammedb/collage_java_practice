import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("enter 3 sides ");

    float sideOne = myScanner.nextFloat();
    float sideTwo = myScanner.nextFloat();
    float sideThree = myScanner.nextFloat();

    float s = (sideOne + sideTwo + sideThree) / 2;
    // System.out.println("s : " + s);
    float sideCalc = (s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    // System.out.println("sideCalc : " + sideCalc);
    if (sideCalc > 0) {
      double area = Math.sqrt(sideCalc);
      System.out.println("Area Of Triangle : " + area);
    } else {
      System.out.println("triangle side invalid");
    }

    myScanner.close();
  }
}
