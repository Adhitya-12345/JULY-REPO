package assignment;

import java.util.Scanner;

public class Charactercount {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();  
	        
	        int characterCount = s.length();  
	        
	        System.out.println("Total number of characters: " + characterCount);  
	   
	    }
	}