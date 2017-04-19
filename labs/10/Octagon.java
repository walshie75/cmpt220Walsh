
class Octagon extends GeometricObject implements Comparable, Cloneable {
	private double side;
	public Octagon(){ 
	}
	public Octagon (double side) { 
		this.side = side;
	}
	public void setSide(double side) { 
		this.side=side;
	}
	public double getSide() { 
		return side;
	}
	public double getArea(){
		return(2+(4/Math.sqrt(2)))*side*side;
	}
public double getPerimeter() { 
	return 8*side;
}
public int compareTo(Object obj) { 
	if(getArea() == ((Octagon )obj).getArea()) 
		return 0;
	else if (getArea() > ((Octagon)obj).getArea())
		return 1;
	else
		return -1;
}
public Object clone() throws CloneNotSupportedException { 
	return super.clone();
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
		return "created on " + dateCreated+ " \ncolor: " + color + " and filled: "+filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}