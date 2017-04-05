
public class Problem61 {

		public static void main(String[] args) {
			
			int n=100;
			int count=0;
			
			for (int i=1; i<=n; i++)
			{
				
				System.out.printf("%-7d",getPentagonalNumber(i));
				count++;
				if(count==10);
				{
					System.out.println();
					count=0;
				}		
			}
		 }


 			public static int getPentagonalNumber(int n)
 			{	
 				return n*(3*n-1)/2;
 			}
}
 			