import java.io.*;
import java.util.*;
public class quotient_remainder {
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a,b");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a/b;
		System.out.println("Quotient"+c);
		c = a % b;
		System.out.println("Remainder"+c);
	}
}