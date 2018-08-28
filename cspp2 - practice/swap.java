import java.io.*;
import java.util.*;
public class swap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give a value");
		int a = s.nextInt();
		System.out.println("Give b value");
		int b = s.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("The a and b values");
		System.out.println(a+" "+b);
	}
}