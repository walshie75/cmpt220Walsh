import java.lang.Math;
public class Circle2D {
		double x;
		double y;
		double radius;
		final double PI=3.14;
		public Circle2D() { 
			x=0;
			y=0;
			radius=1;
		}	
		public Circle2D(double x, double y, double r) {
			this.x=x;
			this.y=y;
			this.radius=r;
		}
		public double getRadius() {
			return radius;
		}
		public double getArea() { 
			return PI * radius * radius;
		}
		public double getPerimeter() { 
			return 2 * PI * radius;
		}
		public double getDistance(double otherX, double otherY) { 
			return Math.sqrt((otherX-x) * (otherX-x) + (otherY-y) * (otherY-y));
		}
		public boolean contains(double otherX, double otherY) { 
			if(getDistance(otherX,otherY)<this.radius)
				return true;
			else
				return false;
		}
		public boolean contains(Circle2D cirlce) { 
			if(this.radius<getDistance(circle.x,cirlce.y) && circle.radius>getDistance(circle.x,cirlce.y))
				return true;
			else
				return false;
		}
		public boolean overlaps(Circle2D cirlce) { 
			if(getDistance(cirlce.x,circle.y)<circle.radius)
				return true;
			else
				return false;
		}
}
