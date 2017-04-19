
 class Circle extends GeometricObject {
	 public double radius;
	 public Circle (double radius) { 
		 this.radius = radius ;
	 }

	@Override
	public double geArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	public boolean equals (Object obj) {
		if(this.radius == ((Circle)obj).radius)
			return true;
		return false;
	}
 

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius ;
	}
	

}
