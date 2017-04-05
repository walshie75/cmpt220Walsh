
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) { 
			System.out.println("Please use format java exercise 12_01 operand1 OPERATOR (+ or - or * or /) operand2 ");
			System.exit(0);
		}
		int result = 0;
		int a,b;
		a = Integer.valueOf(args[0].charAt(0))-48;
		b = Integer.valueOf(args[0].charAt(2))-48;
		
		try { 
			switch (args[0].charAt(1)) { 
			
			case '+': result = a+b;
			break;
			case '-': result = a-b;
			break;
			case '*': result = a*b;
			break;
			case '/': result = a/b;
			break;
			}
			if(Character.isDigit(args[0].charAt(0))&&Character.isDigit(args[0].charAt(2))&&(args[0].charAt(1) == '+' || args[0].charAt(1)=='-' || args[0].charAt(1)=='*' || args[0].charAt(1)=='/')) { 
				System.out.print(a + "" + args[0].charAt(1) + " " + b + " = " + result );
			}
			else if (Character.isLetter(args[0].charAt(0)) || args[0].charAt(0) == '+' || args[0].charAt(0)== '-' || args[0].charAt(0)== '*'|| args[0].charAt(0)=='/') {
				System.out.println("Wrong input: " + args[0].charAt(0));
			}
			else if (Character.isDigit(args[0].charAt(0)) && Character.isLetter(args[0].charAt(1))) { 
				System.out.println("Wrong input: " +args[0].charAt(0) + "" + args[0].charAt(1));
			}
			else if (Character.isDigit(args[2].charAt(2)) && Character.isLetter(args[0].charAt(1)) || Character.isDigit(args[0].charAt(1))) { 
				System.out.println("Wrong input: " + args[0].charAt(1)+ "" +args[0].charAt(2));
			}
			else if (Character.isLetter(args[0].charAt(2)) || args[0].charAt(2) =='+' || args[0].charAt(2)=='-' || args[0].charAt(2)== '*' || args[0].charAt(2)=='/') { 
				System.out.println("Wrong Input: " + args[0].charAt(2));
			}
		}
		catch (NumberFormatException fne) { 
			String message = fne.getMessage();
			System.out.println(message);
		}
	}

}
