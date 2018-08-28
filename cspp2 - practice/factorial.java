import java.io.*;
import java.util.*;
public class factorial {
	public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	else if(n==1) {
		return n;
	}
	else {
		return n * fact(n-1);
	}
}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	int a = s.nextInt();
	int result = fact(a);
	System.out.println("The factorial"+result);
}
}