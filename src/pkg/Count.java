package pkg;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            if (array[i] > 0) {
	                positiveCount++;
	            } else if (array[i] < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }
	        }
	        System.out.println("Number of positive numbers: " + positiveCount);
	        System.out.println("Number of negative numbers: " + negativeCount);
	        System.out.println("Number of zeros: " + zeroCount);
	        
	        	    }
	}