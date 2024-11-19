package controlstmnts;

public class Reverseno {

	public static void main(String[] args) {
        int num = 121;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev= rev * 10 + digit;
            num /= 10;
        }
        if(num==rev)
        {
        	System.out.println(num + "palindrome");
        }
        else
        {

       System.out.println(num+  "not");
        }
	}
}
    

		// TODO Auto-generated method stub

	


