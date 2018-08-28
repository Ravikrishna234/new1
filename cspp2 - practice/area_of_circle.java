import java.io.*;
import java.util.*;
class Area_of_circle {
	public static double area(double x) {
		return pi()*x*x;

	}
	public static double pi() {
		return 3.14;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double a = s.nextDouble();
	System.out.println(area(a));
}
}