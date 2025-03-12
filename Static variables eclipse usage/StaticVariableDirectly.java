package task_static;

public class StaticVariableDirectly {
	static String name = "Saikrishna";
	static int age = 24;
	static double height = 5.8;
	static boolean isStudent = true;
	static short maximum = 6;
	
	public static void main (String[] args) {
		
		System.out.println("enter your name : " +name);
		System.out.println("enter your age: " +age);
		System.out.println("enter your height: " +height);
		System.out.println("ARE YOU A STUDENT (true/false): " +isStudent);
		System.out.println( name +" hits a "+maximum+ " in crucial time to win a match" );
	}
}
