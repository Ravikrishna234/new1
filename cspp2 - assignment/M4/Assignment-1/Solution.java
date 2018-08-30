import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}
		}
		System.out.println(max);
	}
}
