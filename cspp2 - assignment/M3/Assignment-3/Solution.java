
import java.util.Scanner;
/*
    Do not modify this main function.
    */
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     * 
     * @param args [description]
     */
    private Solution(){}
    /**
     * @brief [brief description]
     * @details [long description]
     * 
     * @param args [description]
     */

    public static void main(String[] args) {
        int result;
        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        result = gcd(n1,n2);
        System.out.println(result);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * 
     * @param int [description]
     * @param int [description]
     * 
     * @return [description]
     */
    public static int gcd(final int a,final int b) {
        int remainder=0;
        
       for(int i=1;i<=a && i<=b;i++)
       {
        if(a%i ==0 && b%i ==0) {
            remainder = i;
        }

       }
       return remainder;
        
}
}