
import java.util.Scanner;
public class Problem719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int size = input.nextInt();
		int [] array = new int[size];
		for(int i=0; i<array.length; i++)
			array[i] = input.nextInt();
		boolean result = isSorted(array);
		
		System.out.println("\nThe number of elements in the list: " + size);
		System.out.print("\nThe elements in the list: ");
		for (int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
		if(result)
			System.out.println("\n \n The list is already sorted");
		else
			System.out.println("\n \n The list is not sorted");
		
	}

	public static boolean isSorted(int[] list) {
		// TODO Auto-generated method stub
		boolean result = true;
		
		for(int i=0; i< list.length - 1; i ++)
		{
			if(list[i] > list [i+1])
			{
				result = false;
			}
		}
		return result;
	}

}
