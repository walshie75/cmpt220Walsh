import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfIntegers pf = new StackOfIntegers();
		int count = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer " );
		int num=scan.nextInt();
		System.out.println("The prime factors for the given number " 
		+ num + " is " );
		int factor = 2;
		while (factor <= num) {
			if(num % factor == 0) {
				num = num / factor;
				pf.push(factor);
				count++;
			}
			else { 
			factor++;
			}
		}
		for(int i = 0; i <= count; i++)
			System.out.print(pf.pop() + " ");
	}

}
