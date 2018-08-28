import java.util.Scanner;
/**SQUARE OF SQUARES.**/
final class Solution {
    /**
    * Do not modify this main function.
    */
    private Solution() { }
    /**
     * @param args comment
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
    * @param base a
    * @param exponent b
    * @return
    **/
    public static long power(final int base, final int exponent) {
        if (exponent == 0) { return 1; }
        else if (exponent == 1) { return base; }
        else {
            return base * power(base, exponent - 1);
        }
    }
}

