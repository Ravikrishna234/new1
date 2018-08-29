import java.util.Scanner;
/**Do not modify this main function.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args [description]
     */
    public static void main(final String[] args) {
        int result;
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        result = gcd(n1, n2);
        System.out.println(result);
    }
    /**
     * @param a variable1
     * @param b variable2
     * @return remainder
     **/
    public static int gcd(final int a, final int b) {
        int remainder = 0, i;
        for (i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
            remainder = i;
        }
    }
       return remainder;
}
}