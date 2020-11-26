class A {
	String a = "Aa";
	String b = "Ab";

	public void sharedMethod() {
		System.out.println("Not Overrided");
	}

	public void uniqueA() {
		System.out.println("unique A");
	}
}

class B extends A {
	String a = "Ba";
	String c = "Bc";

	public void sharedMethod() {
		System.out.println("Overrided");
	}

	public void uniqueB() {
		System.out.println("unique B");
	}
}

public class Casting {

	public static void main(String[] args) {

		// 'A' class reference variable used to hold 'A' class object

		System.out.println("-----A-----");
		A a = new A();
		System.out.println(a.a + ", " + a.b);
		a.sharedMethod();
		a.uniqueA();

		System.out.println("----A-B-----");
		A c = new B();
		System.out.println(c.a + ", " + c.b);
		c.sharedMethod();
		c.uniqueA();

		System.out.println();

		System.out.println("-----B-----");
		B b = new B();
		System.out.println(b.a + ", " + b.b + ", " + b.c);
		b.sharedMethod();
		b.uniqueA();
		b.uniqueB();

		System.out.println("----B-A----");
		B d = (B) c;
		System.out.println(d.a + ", " + d.b + ", " + d.c);
		d.sharedMethod();
		d.uniqueA();
		d.uniqueB();
	}

}
