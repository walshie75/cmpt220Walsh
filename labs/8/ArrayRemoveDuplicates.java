import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ten Integers: ");
		for (int i = 0; i < 10 ; i++ ) { 
			list.add(scanner.nextInt());
		}
		removeDuplicate(list);
		System.out.print("The Distinct Integers are " );
		for (int i = 0; i < list.size(); i++) { 
			System.out.print(list.get(i));
		}
	}

	public static void removeDuplicate(ArrayList list) { 
		for (int i = 0; i < list.size()-1; i++) { 
			for (int j = i + 1 ; j<list.size(); j ++) { 
				if(list.get(i) == list.get(j)) { 
					list.remove(j);
				}
			}
		}
	}
}
