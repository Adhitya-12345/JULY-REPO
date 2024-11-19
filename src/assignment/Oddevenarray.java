package assignment;

public class Oddevenarray {

	public static void main(String[] args) {
	     int[] numbers = {12, 7, 9, 4, 15, 22, 30, 11, 6};
	        System.out.println("Even numbers:");
	        for (int number : numbers) {
	            if (number % 2 == 0) {  
	                System.out.print(number + " "); 
	            }
	        }

	        System.out.println("\nOdd numbers:");
	        for (int number : numbers) {
	            if (number % 2 != 0) {  
	                System.out.print(number + " "); 
	            }
	        }
	    }
	}