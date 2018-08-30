import java.io.*;
import java.util.*;
public class firstLast6{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++){
			a[i] = s.nextInt();
		}
		if(a[0] == 6 || a[size - 1] == 6){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}