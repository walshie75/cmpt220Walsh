import java.util.Scanner;
public class Problem63 {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//Declare the variables
		int num;
		boolean ispalindrome;
		
		//read input value
		System.out.println("Enter an integer: ");
		num = input.nextInt();
		ispalindrome = ispalindrome(num);
		//read number to check if palindrome
		if(ispalindrome)
			System.out.println(num + " is a palinedrome number");
		else
			System.out.println(num + " is not a palindrome number");

	}

	private static boolean ispalindrome(int num) {
		
		int rev = reverse(num);
		if (rev == num)
			return true;
		else 
			return false;
	}

	private static int reverse(int num) {
		int rev = 0;
		int rem;
		//loop to find reverse
		while(num > 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		return rev;
	}

}
