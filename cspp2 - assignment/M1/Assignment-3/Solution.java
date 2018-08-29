import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double degreesCelsius = scan.nextDouble();
		calculateFromDegreesToFarenheit(degreesCelsius);
	}
	public static void calculateFromDegreesToFarenheit(double degreecelcius)
	{
		double fahrenheit = (degreecelcius * 1.8) + 32;
		System.out.println(fahrenheit);

	/*
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*/
}
}