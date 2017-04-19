
public class Octagontest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
			Octagon test1= new Octagon (5.0);
			Octagon test2 = (Octagon)test1.clone();
			System.out.println("The Area of the first object="+test1.getArea());
			System.out.println("The Perimeter of the first object="+test1.getPerimeter());
			System.out.println("The Area of the clone object="+test2.getArea());
			System.out.println("The Perimeter of the clone object="+test2.getPerimeter());
			System.out.println("\nCompare the two objects:");
			
			switch(test1.compareTo(test2)) { 
			case 1: 
				System.out.println("The first object is larger than the clone");
				break;
			case 0 : 
				System.out.println("Those objects are equal" );
				break;
			case(-1):
				System.out.println("The first object is smaller than the clone");
			break;
			}			
	}

}
