package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = in.nextInt();
		double firstRule = (year % 4);
		double secondRule = (year % 100); 		
		double thirdRule = (year % 400) ;
		boolean result = ((firstRule == 0) && (secondRule != 0) || (thirdRule==0));
		System.out.print( year +  " is a Leap year: " + result);
	}

}
