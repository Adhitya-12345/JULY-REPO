package controlstmnts;

import java.util.Scanner;

public class Sixthprogrm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		  if (num1 < num2 && num2 < num3) {
	            System.out.println("Increasing");
	        } else if (num1 > num2 && num2 > num3) {
	            System.out.println("Decreasing");
	        } else {
	            System.out.println("Neither increasing nor decreasing");
	        }

	    }
	}
		
	