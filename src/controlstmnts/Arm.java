package controlstmnts;

public class Arm {

	public static void main(String[] args) {
		 int number = 153;
		int sum = 0;
		for (int i = number; i > 0; i = i / 10)
		    {
		        int remainder = i % 10;
		        sum = sum + remainder*remainder*remainder;
		    }

		    if(sum==number)
		    {
		        System.out.println("\n" + number + " is an Armstrong Number\n");
		    }
		// TODO Auto-generated method stub

	}

}
