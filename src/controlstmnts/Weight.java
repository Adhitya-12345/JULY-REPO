package controlstmnts;

public class Weight {

	public static void main(String[] args) {
		int age=24,weight=60;
	
		if(age>=18)
			if(weight>50)
			{
				System.out.println("elgible for blood donation");
				
			}
		
			else
			{
				System.out.println(" not elgible to donate blood,underweight");
			}
		else
		{
			System.out.println("minimum age is18");
		}
		

	}

}
