package pkg;

public class Dog {
	   private String name;
	    private String color;
	    public Dog(String name, String color) {
	        this.name = name;
	        this.color = color;
	    }

	    // Method to display the values of name and color
	    public void displayDetails() {
	        System.out.println("Dog's Name: " + name);
	        System.out.println("Dog's Color: " + color);
	    }


	public static void main(String[] args) {
		  Dog myDog = new Dog("Buddy", "Brown");

	        // Displaying the dog's details
	        myDog.displayDetails();
		// TODO Auto-generated method stub

	}

}
