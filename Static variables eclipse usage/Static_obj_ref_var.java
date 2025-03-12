package task_static;

public class Static_obj_ref_var {
	static String name = "SAIKRISHNA";
	static float Salary = 1111111111;
	static char Currency = '$';
	static int years = 39;
	static boolean isSeniorRecuriter = true;
	
	public static void main(String[] args) {
		Static_obj_ref_var obj = new Static_obj_ref_var();
		
		System.out.println("ENTER YOUR NAME: "+obj.name);
		System.out.println("MY SALARY: "+obj.Salary);
		System.out.println("I CONVERT MY " + obj.Currency + " CURRENCY IN TO INDIAN RUPEES");
		System.out.println("I HAVE EXPERIENCE OF MORE THEN YOUR AGE " +obj.years);
		System.out.println("I THINK YOU ARE SENIOR EMPLOY OF THIS OFFICE " +obj.isSeniorRecuriter);
	}
}
