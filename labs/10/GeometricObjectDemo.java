
public class GeometricObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GeometricObject circle1 = new Circle(5);;
			GeometricObject circle2 = new Circle(6);
			GeometricObject rectangle1 = new Rectangle(2,8);
			GeometricObject rectangle2 = new Rectangle(3.5, 4);
			GeometricObject maxCircle = (GeometricObject)
			GeometricObject.max(circle1, circle2);
			GeometricObject maxRectangle = (GeometricObject)
			GeometricObject.max(rectangle1, rectangle2);
			System.out.println("Cirlce 1:");
			printGeometricObject(circle1);
			System.out.println("Circle 2: ");
			printGeometricObject(circle2);
			System.out.println("Largest Circle: " );
			printGeometricObject(maxCircle);
			System.out.println("Rectangle 1: ");
			printGeometricObject(rectangle1);
			System.out.println("Rectangle 2: ");
			printGeometricObject(rectangle2);
			System.out.println("Largest Rectangle");
			printGeometricObject(maxRectangle);
	}

	private static void printGeometricObject(GeometricObject obj) {
		// TODO Auto-generated method stub
		System.out.println("Area: " + obj.getArea());
		System.out.println("Perimeter: " + obj.getPerimeter());
		System.out.println();
	}
	public int compareTo(Object obj) {
		if(getArea() >((GeometricObject)obj).getArea()) { 
			return 1;
		}
		else if(getArea() < ((GeometricObject)obj).getArea()){
			return -1;
		}
		else { 
			return 0;
		}
	}

	private int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

abstract class GeometricObject { 
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	protected GeometricObject() { 
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) { 
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() { 
		return color;
	}
	public void setColor(String color) { 
		this.color = color;
	}
	public boolean isFilled() { 
		return filled;
	}
	public void setFilled(boolean filled) { 
		this.filled = filled;
	}
	public java.util.Date getDateCreated() { 
		return dateCreated;
	}
	public String toString() { 
		return "created on" + dateCreated + " \ncolor: " + color + " and filled: "
				+ filled; 
	}
	public abstract double getArea();
	public abstract double getPerimeter();


	public static Comparable max(Comparable obj1, Comparable obj2) { 
		GeometricObjectDemo obj;
		if(obj.compareTo(obj2)>=0) { 
			return obj1;
		}
		else {
			return obj2;
		}
	}
	}

