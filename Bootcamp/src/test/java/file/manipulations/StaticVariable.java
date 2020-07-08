package file.manipulations;

public class StaticVariable {

	static String a = "apple";
	String b = "plum";

	public static void main(String[] args) {
//
//		System.out.println(a);
//		a();
//		b();
//		System.out.println(a);
		StaticVariable sv = new StaticVariable();
		sv.c();
		sv.d();
	}

	public static void a() {
		a = "pear";
		System.out.println("Method a " + a);
	}

	public static void b() {
		System.out.println("Method b " + a);
	}

	public void c() {
		b = "apricot";
		System.out.println("Method c " + b);
	}

	public void d() {
		System.out.println("Method d " + b);
	}
}
