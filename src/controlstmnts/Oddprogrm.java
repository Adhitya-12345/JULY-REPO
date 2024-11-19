package controlstmnts;

import java.util.Scanner;

public class Oddprogrm {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		if(number%2==0)
		{
		    System.out.println(number + " is even");
			
		}
		else
		{
		    System.out.println(number + " is odd");
		}
	
	}


	}


