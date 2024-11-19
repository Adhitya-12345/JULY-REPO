package controlstmnts;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter first no");
	    int a=sc.nextInt();
	    System.out.println("enter second no");
	    int b=sc.nextInt();
	    System.out.println("first number is "+a );
	    System.out.println("second number is" +b);
	    int sum = a+b;
	    System.out.println("sum="+sum);
	    }
	} 
