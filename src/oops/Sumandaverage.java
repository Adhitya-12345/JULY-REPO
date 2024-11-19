package oops;

import java.util.Scanner;

public class Sumandaverage {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 5;
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number; 
        }

        double average = (double) sum / count;


        System.out.println("Sum of the 5 numbers: " + sum);
        System.out.println("Average of the 5 numbers: " + average);

	}

}
