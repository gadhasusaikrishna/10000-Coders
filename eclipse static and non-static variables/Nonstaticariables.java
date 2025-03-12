package demo;
public class NonStatic {
	String n1;
	byte b1;
	int i1;
	short s1;
	long L1;
	float f1;
	double d1;
	char ch;
	boolean bool;
	public static void main(String[] args) {
		NonStatic obj = new NonStatic();
		System.out.println(obj.b1);
		System.out.println(obj.n1);
		System.out.println(obj.i1);
		System.out.println(obj.s1);
		System.out.println(obj.L1);
		System.out.println(obj.f1);
		System.out.println(obj.d1);
		System.out.println(obj.ch);
		System.out.println(obj.bool);
	}
}