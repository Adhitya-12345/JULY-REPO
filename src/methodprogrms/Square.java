package methodprogrms;

public class Square {

	public static void main(String[] args) {
		Square a=new Square();
		int d=a.area(4);
		System.out.println("area="+d);

	}
	public int area(int a)
	{
		int c=a*a;
		return c;
	}

}


