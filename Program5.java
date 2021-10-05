/*
	Program5-Read Keyboard Input - reading intiger values
 */

import java.util.Scanner;

public class Program5 {

	public static void main(String args[]) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter Roll No : ");
		Integer rollNo = myScanner.nextInt();
		System.out.print("Enter Your Name : ");
		String name = myScanner.next();
		System.out.println("My Name : " + name + "\nRoll No: " + rollNo);
		myScanner.close();

	}

}
