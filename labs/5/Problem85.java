import java.util.Scanner;
public class Problem85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] array1 = new double[3][3];
		double[][] array2 = new double[3][3];
		double[][] result = new double[3][3];
		String num;
		
		System.out.print("Enter matrix1: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{ 
				num = input.next();
				array1[i][j] = Double.parseDouble(num);
			}
		}
		System.out.print("Enter matrix2: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{ 
				num = input.next();
				array2[i][j] = Double.parseDouble(num);
			}
	}
		result = addMatrix(array1, array2);
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(result[i][j] + "\t");
			}
			System.out.print("\n");
		}

}

	public static double[][] addMatrix(double[][] array1, double[][] array2) {
		// TODO Auto-generated method stub\
		double[][] c = new double[3][3];
		for(int i=0; i<3; i++)
		{ 
			for (int j=0; j<3; j++)
			{
				c[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return c;
	}
}