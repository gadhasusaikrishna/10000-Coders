package operators;

public class Area_ofRectangle {
	static int length = 20;
	static int breadth = 180;
	static int AREA;
	static int PERIMETER;
	
	public static void main (String[] args) {
		
		AREA = (length * breadth);
		PERIMETER = 2*(length + breadth);
		
		System.out.println("THE AREA OF RECTANGLE: " +AREA);
		System.out.println("THE PERIMETER OF RECTANGLE: "+PERIMETER);
		
		
	}

}
