import java.util.Random;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionTest {
public static void main(String[] args ) { 
	Scanner input = new Scanner (System.in);
	final int SIZE = 100;
	Random rand = new Random();
	int[] arr = new int[SIZE];
	for (int i = 0; i < SIZE ; i++) { 
	arr[i] = 1 + rand.nextInt(100);
}
		System.out.print("Enter the index of the array: " );
		int index = input.nextInt();
		
		try {
			int value = arr[index];
			System.out.println("Corresponding value at index" + index + " is " + value );
		}
		catch (ArrayIndexOutOfBoundsException ex ) { 
			System.out.println("Out Of Bounds");
		}
}
}
