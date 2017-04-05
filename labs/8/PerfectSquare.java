import java.util.ArrayList;
import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer m: " );
		int m = scanner.nextInt();
		ArrayList integerFactors = new ArrayList();
		computeIntegerFactors(m, integerFactors);
		getOddNumberedFactors(integerFactors);
		int smallestNumber = 1;
		for (int i = 0 ; i < integerFactors.size(); i ++) { 
			smallestNumber = smallestNumber * integerFactors.get(i);
			}
		System.out.println("The smallest number n for m * n to be a perfect square is "
			+ smallestNumber);
		System.out.println("m*n is" + ( m * smallestNumber));
	}
	private static void computeIntegerFactors(int m, ArraryList integerFactors) {
		int factor = 2;
		while (factor <= m) { 
			if(m % factor == 0) { 
				integerFactors.add(factor);
				m /= factor; 
			}
			else { 
				factor ++;
			}
		}
	}
	public static void getOddNumberedFactors ( ArrayList list ) { 
		for (int i = 0 ; i < list.size()-1; i++) { 
			for(int j = i + i; j < list.size(); j++) { 
				if(list.get(i) == list.get(j)) { 
					list.remove(j);
					list.remove(i);
				}
			}
		}
	}

}
