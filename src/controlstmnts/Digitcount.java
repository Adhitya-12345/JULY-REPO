package controlstmnts;

public class Digitcount {

	public static void main(String[] args) {
		int n=2345;
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
			
		}
		System.out.println("count=" +c);
		// TODO Auto-generated method stub

	}

}
