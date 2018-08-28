import java.io.*;
import java.util.*;
class Calculator {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;

	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println("1.add\n 2.sub \n3.mul\n4.div");
		switch(c){
			case 1:System.out.println(add(a,b));
					break;
			case 2:System.out.println(sub(a,b));
					break;
			case 3:System.out.println(mul(a,b));
					break;
			case 4:System.out.println(div(a,b));
					break;
		
		}
	}
}