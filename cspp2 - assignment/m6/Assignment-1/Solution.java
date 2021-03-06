import java.util.Scanner;
/**COMPOSITENUMBERS.**/
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param n value
     */
    public static void oddComposites(final int n) {
        int j;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        }
        /**
         * @param args value
         */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

