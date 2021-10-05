/*
	Program4-Read Keyboard Input - Method-1
*/

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("enter name : ");
		String name = myScanner.nextLine();
		System.out.println("name : " + name);
		myScanner.close();
	}

}
