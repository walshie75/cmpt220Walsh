
public class Problem810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = new int[4][4];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j< matrix.length; j++)
			{
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		System.out.println("Elements in the matrix are" );
		for (int i=0; i< matrix.length; i++)
		{
			for (int j=0; j< matrix.length; j++)
			{ 
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		int largestRow = largestRowOnes(matrix);
		int largestColumn = largestColumnOnes(matrix);
		System.out.println("\n The largest row index: " + largestRow);
		System.out.println(" The largest column index: " + largestColumn);
	}

	private static int largestRowOnes(int[][] matrix) {
		// TODO Auto-generated method stub
		int maxRowOnes = 0;
		int largestRow = 0;
		for (int row = 0; row < matrix.length; row++)
		{
			int count = 0;
			for (int column = 0; column < matrix.length; column++)
			{
				if(matrix[row][column] == 1) count++;
			}
			if(maxRowOnes < count)
			{ 
				maxRowOnes = count;
				largestRow = row;
			}
		}
		return largestRow;
	}
	private static int largestColumnOnes(int[][] matrix) {
		// TODO Auto-generated method stub
		int maxColumnOnes = 0;
		int largestColumn = 0;
		for (int column = 0; column < matrix.length; column++)
		{
			int count = 0;
			for (int row =0; row < matrix.length; row++)
			{
				if(matrix[row][column] == 1) count++;
			}
			if(maxColumnOnes < count)
			{
				maxColumnOnes = count;
				largestColumn = column;
			}
		}
		return largestColumn;
	}

}
