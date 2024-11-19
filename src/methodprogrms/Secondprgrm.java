package methodprogrms;

public class Secondprgrm {

	public static void main(String[] args) {
		Secondprgrm a=new Secondprgrm();
		a.sub(6, 5);
		int m=a.multiply();
		System.out.println("multiply="+m);
		double d=a.div(44, 2);
		System.out.println("division="+d);
		
		// TODO Auto-generated method stub

	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub="+c);
	}
	public int multiply()
	{
		int a=3,b=4,c;
		c=a*b;
		return c;
	}
	public double div(double a,double b)
	{
		double c=a/b;
		return c;
	}

}
