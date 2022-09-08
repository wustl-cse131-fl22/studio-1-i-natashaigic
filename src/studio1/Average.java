package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first integer:");
		int n1 = in.nextInt();
		System.out.print("Enter second integer:");
		int n2 = in.nextInt();
		double sum = (double) (n1 + n2);
		double average = (double) (sum/2);
		System.out.print("The average of " + sum + " is: " + average);
	}

}
