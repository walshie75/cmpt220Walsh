public class StackOfIntegers {
private int[] a;
private int arraysize;
public static final int defaultarraysize = 16;
public StackOfIntegers() {
	this(defaultarraysize);
		}
public StackOfIntegers(int capacity) {
	a = new int[capacity];
	}
	public int push(int number) { 
		if(arraysize>= a.length) {
			int[] b = new int [a.length * 2];
			System.arraycopy(a,  0 , b , 0, a.length);
			a=b;
		}
		return a[arraysize++]=number;
	}
	public int pop() {
		return a[--arraysize];
	}
	public int peek() {
		return a[arraysize - 1];
	}
	public boolean empty() {
		return arraysize == 0;
	}
	public int getSize() { 
		return arraysize;
	}
}


	
