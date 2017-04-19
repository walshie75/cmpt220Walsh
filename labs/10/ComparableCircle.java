
public class ComparableCircle extends Circle implements Comparable {

	public ComparableCircle(double rad) {
		super(rad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(getArea() > ((ComparableCircle)o).getArea())
			return 1;
		else if (getArea() < ((ComparableCircle)o).getArea())
		return -1;
		else
			return 0;
	}

}
