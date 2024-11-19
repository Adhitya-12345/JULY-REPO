package controlstmnts;

public class Calculator {

	public static void main(String[] args) {
		int a=3,b=4;
		char op='+';
		switch(op)
		{
		case '+':
			System.out.println("result is" +(a+b));
			break;
		case '-':
			System.out.println("result is" +(a-b));
			break;
		case '*' :
			System.out.println("result is" +(a*b));
			break;
		case '/':
			System.out.println("result is" +(a/b));
			break;
		default:
			System.out.println("invalid choice");
			break;
			
			
		}
		// TODO Auto-generated method stub

	}

}
