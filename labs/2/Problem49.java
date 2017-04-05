import java.util.Scanner;
public class Problem49 {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    System.out.println("enter character");

		    String a = input.nextLine();
		    char ch = a.charAt(0);
		    if (a.length() == 1){
		    System.out.println("The character entered is " + ch);
		    System.out.println(" the Unicode for character " + ch + " " + ((int) ch));
		    }
		    else
		    System.out.println("complain about the number of characters.");
		 }

		

	}


