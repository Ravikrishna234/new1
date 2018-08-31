import java.util.Scanner;
/**BINARYTODECIMAL.**/
public class Solution
{
	/*
	Do not modify this main function.
	*/
	private Solution() { }
	/**
	 * @param args [description]
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String res = "";
		for(int i = 0; i < n; i++){
			String s = sc.nextLine();
			res = binaryToDecimal(s);//Write binaryToDecimal function	
			System.out.println(res);
		}
	}
	/**
	 * @param str String
	 * @return value value
	 */
	public static String binaryToDecimal(String str) 
	{
		int decimal=0;
		int base = 1;
		for(int i = str.length() - 1; i >= 0; i--)
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
