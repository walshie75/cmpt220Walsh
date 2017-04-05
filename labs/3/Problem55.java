import java.text.DecimalFormat;
public class Problem55 {

	public static void main(String[] args) {
		System.out.println("Kilograms Pounds Pounds Kilograms");
		
		double k,p;
		
		DecimalFormat dec = new DecimalFormat("###.##");
		
		//loop
		for (int i=1, j=20; i<=199;i=i+2,j=j+5);
		{
			double i = 0;
			k= i *2.2;
			double j = 0;
			p=j/2.2;
			
			System.out.println(i + "\t\t" + dec.format(k) + "\t\t" + j + "\t" + dec.format(p));
			
		}

	}

}
