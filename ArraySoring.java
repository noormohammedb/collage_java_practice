import java.util.Scanner;

public class ArraySoring {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int[] myArray = new int[99];
    int i, j, temp = 0, arrayLength;
    System.out.print("enter array length : ");
    arrayLength = myScanner.nextInt();
    System.out.println("Enter Array Elementes : ");
    // myArray = [8,3,2,4];
    for (i = 0; i < arrayLength; i++)
      myArray[i] = myScanner.nextInt();

    for (i = 0; i < arrayLength; i++) {
      for (j = i + 1; j < arrayLength; j++) {
        if (myArray[i] < myArray[j]) {
          temp = myArray[j];
          myArray[j] = myArray[i];
          myArray[i] = temp;
        }
      }
    }

    for (i = 0; i < arrayLength; i++)
      System.out.print(myArray[i] + " ");

    myScanner.close();
  }
}