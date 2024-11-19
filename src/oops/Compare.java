package oops;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String string1 = scanner.nextLine();

	        System.out.print("Enter the second string: ");
	        String string2 = scanner.nextLine();
	        if (string1.equalsIgnoreCase(string2)) {
	            System.out.println("The strings are equal (ignoring case).");
	        } else {
	            System.out.println("The strings are not equal.");
	        }


	}

}
