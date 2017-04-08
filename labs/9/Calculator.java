
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JA
		if(args.length!=3) { 
			System.out.println("Please use format java exercise 12_01 operand1 OPERATOR (+ or - or * or /) operand2 ");
			System.exit(0);
		}
		int result = 0;
		int a,b;
		// JA
		a = Integer.valueOf(args[0]);
		b = Integer.valueOf(args[2]);
		
		try { 
			// JA
			switch (args[1].charAt(0)) { 
			
			case '+': result = a+b;
			break;
			case '-': result = a-b;
			break;
			case '*': result = a*b;
			break;
			case '/': result = a/b;
			break;
			}
			// JA
//			if(Character.isDigit(args[0].charAt(0))&&Character.isDigit(args[0].charAt(2))&&(args[0].charAt(1) == '+' || args[0].charAt(1)=='-' || args[0].charAt(1)=='*' || args[0].charAt(1)=='/')) { 
				System.out.print(a + " " + args[1] + " " + b + " = " + result );
//			}
//			else if (Character.isLetter(args[0].charAt(0)) || args[0].charAt(0) == '+' || args[0].charAt(0)== '-' || args[0].charAt(0)== '*'|| args[0].charAt(0)=='/') {
//				System.out.println("Wrong input: " + args[0].charAt(0));
//			}
//			else if (Character.isDigit(args[0].charAt(0)) && Character.isLetter(args[0].charAt(1))) { 
//				System.out.println("Wrong input: " +args[0].charAt(0) + "" + args[0].charAt(1));
//			}
//			else if (Character.isDigit(args[2].charAt(2)) && Character.isLetter(args[0].charAt(1)) || Character.isDigit(args[0].charAt(1))) { 
//				System.out.println("Wrong input: " + args[0].charAt(1)+ "" +args[0].charAt(2));
//			}
//			else if (Character.isLetter(args[0].charAt(2)) || args[0].charAt(2) =='+' || args[0].charAt(2)=='-' || args[0].charAt(2)== '*' || args[0].charAt(2)=='/') { 
//				System.out.println("Wrong Input: " + args[0].charAt(2));
//			}
		}
		catch (NumberFormatException fne) { 
			String message = fne.getMessage();
			System.out.println(message);
		}
	}

}
