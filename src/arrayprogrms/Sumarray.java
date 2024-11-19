package arrayprogrms;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
	     int[] numbers = new int[4];
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += numbers[i];
        }

     
        System.out.println("The sum of the array is: " + sum);
		
	

	}

}
