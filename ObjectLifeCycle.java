package june3;

public class ObjectLifeCycle {
	static int a;//declaration
	public static void main(String ar[]) {
		a = 10;//initialization
		
		Customer shubham;//declaration of a reference variable
		shubham = new Customer();//initialization
		Integer b;
		b = new Integer(10);
		Integer c;
		c = new Integer(10);
		System.out.println(a);
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(shubham);
	}
}
