import java.util.Scanner;
public class Problem87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Points: ");
		int numberOfPoints = input.nextInt();
		
		double[][] points = new double [numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i=0; i < points.length; i++)
			{
			System.out.print("Enter X Index of the point " + ( i + 1) + ": ");
			points[i][0] = input.nextDouble();
			System.out.print("Enter Y Index of the point " + ( i + 1) + ": ");
			points[i][1] = input.nextDouble();
			System.out.print("Enter Z Index of the point " + ( i + 1) + ": ");
			points[i][2] = input.nextDouble();
			}
		int p1 = 0, p2 = 1;
		double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1], points[p2][2]);
		
		for (int i =0; i < points.length; i++)
		{
			for(int j = i + 1; j < points.length; j++ )
			{
				double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1], points[j][2]);
				if(shortestDistance > distance)
				{
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		System.out.println("The Closes two points are (" + points[p1][0] + " , " + points[p1][1] +  "," +  points[p1][2] +  ") and ( "  + points[p2][0] +  ","
		+ points[p2][1] +  ","  + points[p2][2] + ")");
	}
	public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
	{
		return Math.sqrt(((x2 - x1) * (x2-x1)) + ((y2 - y1) * (y2 - y1)) + ((z2 -z1) * (z2 - z1)));
	}

}
