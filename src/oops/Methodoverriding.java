package oops;
class Father
{
	public void education()
	{
		System.out.println("bsc");
		
		
	}
	public void job()
	{
		System.out.println("engineer");
	}
	
	
	
}
class Son extends Father
{

	@Override
	public void education() {
		System.out.println("btech");
		// TODO Auto-generated method stub
		super.education();
	}

	@Override
	public void job() {
		System.out.println("designer");
		// TODO Auto-generated method stub
		super.job();
	}
	}

public class Methodoverriding {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.education();
		ob.job();
		

	}

}
