
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	static String binaryToDecimal(String str) 
	{
		int decimal=0;
		int base = 1;
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			int num = Integer.parseInt(str.valueOf(ch));
			decimal = decimal + num * base; 
			base = base * 2;

		}
		String value = Integer.toString(decimal);
		return value;
	}
}
