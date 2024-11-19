package oops;

import pkg.Dog;

public class Dog1 {
	   private String name;
	    private String color;
	    public void Dog(String name, String color) {
	        this.name = name;
	        this.color = color;
	    }
	    public void displayDetails() {
	        System.out.println("Dog's Name: " + name);
	        System.out.println("Dog's Color: " + color);
	    }


	public static void main(String[] args) {
		 Dog myDog = new Dog("Tommy", "Brown");
	        myDog.displayDetails();

	}

}