import java.util.Scanner;

public class Problem710 {

	public static void main(String[] args) {
		java.util.Scanner  input = new java.util.Scanner(System.in);
		double[] numbers = new double[5];
		int indexofminnumber;
		System.out.println("Enter five numbers:");
		
		for (int i=0;i<5;i++)
		{
		numbers[i]=input.nextDouble();
		}
		indexofminnumber=indexOfSmallestElement9(numbers);
		}

	public static int indexOfSmallestElement9(double[] numbers) {
		// TODO Auto-generated method stub
		double minimum = numbers[0];
		int indexOfMin = 0;
		for(int i=1;i<5;i++)
			{
			if(numbers[i]<minimum);
			{
				minimum = numbers[i];
				indexOfMin=i;
				
			}
			}
		return indexOfMin;
	}

}
