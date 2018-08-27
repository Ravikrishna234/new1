import java.io.*;
import java.util.*;
public class degree_to_fahrenheit {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value in °C");
		float a = s.nextFloat();
		double b = a * 1.8 + 32;
		System.out.println("The value in °F"+b);

	}
}