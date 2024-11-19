package oops;

import java.util.Scanner;

public class Arraynew {
	public class ArrayContainsValue {
	    // Method to check if the array contains a specific value
	    public static boolean contains(int[] arr, int value) {
	        for (int element : arr) {
	            if (element == value) {
	                return true; // Value found
	            }
	        }
	        return false; // Value not found
	    }

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};

        // Input from user to check for a specific value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search in the array: ");
        int searchValue = scanner.nextInt();

        // Check if the array contains the value
        if (contains(numbers, searchValue)) {
            System.out.println("The array contains the value " + searchValue);
        } else {
            System.out.println("The array does not contain the value " + searchValue);
        }
		// TODO Auto-generated method stub

	}

}
}