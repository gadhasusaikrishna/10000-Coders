package operators;

import java.util.Scanner;

public class QUE_REM {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int divisor;
		int dividend;
		int Quotient;
		int Remainder;	
		System.out.println("Enter the Divisor: ");
		divisor = scanner.nextInt();	
		System.out.println("Enter the Dividend: ");
		dividend = scanner.nextInt();	
		Quotient = dividend/ divisor;
		Remainder = dividend - (divisor * Quotient);
		
		System.out.println("THE VALUE OF QUOTIENT: " +Quotient);
		System.out.println("THE VALUE OF REMAINDER: "+Remainder);
		
	}

}
