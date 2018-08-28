import java.util.Scanner;
import java.lang.*;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	public static void rootsOfQuadraticEquation(int a,int b,int c) {
		double d = (b*b)-(4*a*c);
		double result = -b+(Math.sqrt(d));
		result = result / (2*a);
		double result1 = -b-(Math.sqrt(d));
		result1 = result1 / (2*a);
		System.out.println(result+" "+result1);

	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
}
