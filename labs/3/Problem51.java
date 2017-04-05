import java.text.DecimalFormat;
import java.util.Scanner;
public class Problem51 {

	public static void main(String[] args) {
		
		//create a scanner
		Scanner scan = new Scanner(System.in);
		
		//variables
		int total = 0;
		double average = 0.0;
		int numOfNeg = 0;
		int numOfPos = 0;
		int numOfValues = 0;
		int value;
		
		//prompt user
		System.out.print("Enter an integer, the input end if it is 0: ");
		do{
		value = scan.nextInt();
		if(value > 0)
		{
				numOfPos++;
				numOfValues++;
				total += value;
		}
		else if (value < 0)
		{
				numOfNeg++;
				numOfValues++;
				total += value;
		}
	}while (value != 0 );
		DecimalFormat dec = new DecimalFormat("###.###");
		
		average = total / (numOfValues * 1);
		
		System.out.println("The number of positives is " + numOfPos );
		System.out.println("The number of negatives is "  + numOfNeg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + dec.format(average));
	}

}
