import java.io.*;
public class BinaryToDecimal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try { 
			BufferedReader bf =  new BufferedReader (new InputStreamReader(System.in));
			System.out.print("Enter the Binary value: " );
			String str = bf.readLine();
			int i = binaryToDecimal(str);
			System.out.println("Decimal := " +i);
		}
		catch (NumberFormatException ex) { 
			System.out.println("Number Format Exception occured. Program will now exit");
			System.out.println(ex.getMessage());
			System.exit(0);
		}
	}
	private static int binaryToDecimal(String binaryString) {
		// TODO Auto-generated method stub
		int decimalValue = 0;
		for(int i = 0; i < binaryString.length(); i++) { 
			Character binaryChar = binaryString.charAt(i);
			String tempStr = binaryChar.toString();
			int tempInt = Integer.parseInt(tempStr);
			if(tempInt !=0 && tempInt!= 1) { 
				System.out.println("Invalid binary number. Program will not exit. ");
				System.exit(0);
			}
			decimalValue = decimalValue * 2 + tempInt;
		}
		return decimalValue;
	}

}
