
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {

    public static void main(String[] args) {
        int result;
        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        result = gcd(n1,n2);
        System.out.println(result);
    }
    /*
	Need to write the gcd function and print the output.
	*/
    public static int gcd(int a,int b) {
        int numerator,denominator,remainder=0;
        if(a>b) {
            numerator = a;
            denominator = b;
        }
        else {
            numerator = b;
            denominator = a;
        }
        remainder = numerator % denominator;
        if(remainder==0 || remainder == 1) {
            return remainder;
        }
        while(remainder!=0) {
        numerator = denominator;
        denominator = remainder;
        remainder = numerator % denominator;
    }
        
        return remainder;
        }
        
}
