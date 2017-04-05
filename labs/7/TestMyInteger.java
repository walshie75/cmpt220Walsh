import java.util.Scanner;

public class TestMyInteger {	
			
			private static Scanner input;

			public static void main(String[] args) {
				input = new Scanner(System.in);
				System.out.println("Enter a number  ");
				int a=input.nextInt();
				MyInteger i1 = new MyInteger(a);
				System.out.println( a+ " is even ? " +i1.isEven());
				System.out.println( a+ "is odd? " +i1.isOdd());
				System.out.println( a+ " is prime? " +i1.isPrime());
				System.out.println("17 is Prime? " + MyInteger.isPrime(17));
				char[] c={'1' , '2' , '3'  , '4'};
				System.out.println("charachters " +MyInteger.parseInt(c));
				String s="123456789";
				System.out.println("String is " +MyInteger.parseInt(s));
				System.out.println("19 is off? " +MyInteger.isOdd(19));
				System.out.println("10 is even? " +MyInteger.isEven(10));
				System.out.println( a+ " is equal to 24? " +i1.equals(24));
			}
		}

		
