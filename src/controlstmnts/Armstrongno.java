package controlstmnts;

public class Armstrongno {

	public static void main(String[] args) {
		int n = 123;
		int originalnumber = n;
        int digit1 = n / 100;
        int digit2 = (n/ 10) % 10;
        int digit3 = n% 10;
        int sum = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
        if (sum == originalnumber) {
            System.out.println(originalnumber + " is an Armstrong number.");
        } else {
            System.out.println(originalnumber + " is not an Armstrong number.");
        }

	}

}
