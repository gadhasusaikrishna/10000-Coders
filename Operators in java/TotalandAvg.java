package operators;

public class TotalandAvg {
	static float subject1 = 53;
	static float subject2 = 45;
	static float subject3 = 66;
	static float subject4 = 88;
	static float subject5 = 99;
	static float subject6 = 96;
	static float Total;
	static float Avg;
	public static void main (String[] args) {
		
		Total = (subject1+subject2+subject3+subject4+subject5+subject6);
		Avg = Total /6;
		
		System.out.println("TOTAL MARKS: "+Total);
		System.out.println("AVERAGE MARKS OBTAINED BY STUDENT: "+Avg);
	}

}
