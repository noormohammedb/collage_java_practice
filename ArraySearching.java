import java.util.Scanner;

public class ArraySearching {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int[] myArray = new int[99];
    int i, searchKey, arrayLength;

    System.out.print("Enter Array Length : ");
    arrayLength = myScanner.nextInt();

    System.out.print("Enter elementes : ");

    for (i = 0; i < arrayLength; i++)
      myArray[i] = myScanner.nextInt();

    System.out.println("Enter Search Key");
    searchKey = myScanner.nextInt();

    for (i = 0; i < arrayLength; i++) {
      if (myArray[i] == searchKey) {
        System.out.println("search key found at : " + (i + 1));
        break;
      }
    }

    myScanner.close();
  }
}