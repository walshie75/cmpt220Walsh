import java.text.DecimalFormat;
import java.util.Scanner;
public class problem516 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for pos int
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		//find small factors
		System.out.println("The factors for " + number + " is");
		int factor = 2;
		while (factor <= number)
		{
			if (number%factor == 0)
			{
				number =  number / factor;
				System.out.println(factor);
			}
			else 
			{
				factor++;
			}
		}
		
	}

}
