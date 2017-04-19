
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;

	protected GeometricObject() {
	}

	protected GeometricObject(String color, boolean filled) {
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

	public abstract double geArea();

	public abstract double getPerimeter();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static GeometricObject max(GeometricObject circle1, GeometricObject circle2) {
		// TODO Auto-generated method stub
		return null;
	}

}
	
 


public abstract class GeometricObject implements Comparable {
			// TODO Auto-generated method stub
			return null;
		}}
