import java.util.Scanner;
public class Porblem81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double matrix[] [] = new double [3] [4];
		System.out.println("Enter a " + matrix.length + "-by- " + matrix[0].length + " matrix row by row: ");
		for (int row=0; row < matrix.length; row++)
		{
		for (int column = 0; column < matrix[row].length; column++)
		{
			matrix[row][column] = input.nextDouble();
		}
		}
		System.out.println("\n Elements in the matrix are");
		for (int row=0; row <matrix.length; row++)
		{
			for(int column = 0; column < matrix[row].length; column++)
			{
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int column = 0; column < matrix[0].length; column++)
		{
			double sum = sumColumn(matrix, column);
			System.out.println("The Sum of the elements in column " + column + " is " + sum);
		}
	}

	public static double sumColumn(double[][] matrix, int columnIndex) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int row = 0; row < matrix.length; row++)
		{
			sum += matrix[row][columnIndex];
		}
		return sum;
	}

}
