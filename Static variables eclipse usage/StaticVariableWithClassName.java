package task_static;

public class StaticVariableWithClassName {
	static String name = "SAIKRISHNA";
	static byte Weight = 80;
	static char currency = '$';
	static long age = 24;
	static double GPA = 6.6;
	
	public static void main (String[] args) {
		System.out.println("ENTER YOUR NAME: " +StaticVariableWithClassName.name);
		System.out.println("Enter Your WEIGHT: "+StaticVariableWithClassName.Weight);
		System.out.println("ENTER USA CURRENCY: "+StaticVariableWithClassName.currency);
		System.out.println("ENTER YOUR age: "+StaticVariableWithClassName.age);
		System.out.println("Enter your GPA: "+StaticVariableWithClassName.GPA);
	
	}
}
