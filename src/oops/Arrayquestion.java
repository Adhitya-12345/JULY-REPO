package oops;

import java.util.Scanner;

public class Arrayquestion {
	 public static boolean contains(int[] arr, int value) {
	        for (int element : arr) {
	            if (element == value) {
	                return true; 
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search in the array: ");
        int searchValue = scanner.nextInt();
        if (contains(numbers, searchValue)) {
            System.out.println("The array contains the value " + searchValue);
        } else {
            System.out.println("The array does not contain the value " + searchValue);
        }

	}

}
