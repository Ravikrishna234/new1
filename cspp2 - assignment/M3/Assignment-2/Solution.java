import java.util.Scanner;
/**Do not modify this main function.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     **/
    private Solution() { }
    /**
     * @param args [description]
    **/
    public static void main(final String[] args) {
        int count = 0;
        final int ten = 10, seven = 7;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                int k;
                k = j % ten;
                if (k == seven) {
                    count += 1;
                }
                j = j / ten;
            }
        }
        System.out.println(count);
    }
}
