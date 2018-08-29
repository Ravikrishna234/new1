import java.io.*;
import java.util.*;
public class SumofNNumbers{
	 public static void main(String[] args) {
	 	Scanner s= new Scanner(System.in);
	 	int n = s.nextInt();
	 	int sum =0,i = 0;
	 	while(i<=n) {
	 		sum = sum + i;
	 		i =i+1;
	 	}
	 	System.out.println(sum);
	 }
}