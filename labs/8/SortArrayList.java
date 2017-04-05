import java.util.*;
import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: " );
					int i = 0;
					while (i<5) {
	list.add(input.nextInt());
	i++;
			}
	sort(list);
	System.out.print("List after the sorting: " );
	for (int j=0; j < list.size(); j++);
	}

	public static void sort(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int temp;
		for (int i=0; i < list.size() ; i++) {
			for (int j=i+1;j<list.size()-1;j++){
				if(list.get(i)>list.get(j)){
					temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
