import java.io.*;
import java.util.*;
public class Average{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		int sum = 0;
		for(int i = 0;i<a.length;i++){
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		int avg = sum/size;
		System.out.println("The avg value"+avg);
	}
}