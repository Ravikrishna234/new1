import java.util.Scanner;
/**MATRIXROUND.**/
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * @param a [][]
     * @param row rows
     * @param col columns
     * @return value
     */
    static int[][] roundHundred(final int[][] a, final int row, final int col) {
        final int number1 = 0;
        final int number2 = 49;
        final int number3 = 50;
        final int number4 = 150;
        final int number5 = 151;
        final int number6 = 249;
        final int number7 = 250;
        final int number8 = 350;
        final int number9 = 351;
        final int number10 = 449;
        final int number11 = 450;
        final int number12 = 549;
        final int number13 = 0;
        final int number14 = 100;
        final int number15 = 200;
        final int number16 = 300;
        final int number17 = 400;
        final int number18 = 500;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] >= number1 && a[i][j] <= number2) {
                    a[i][j] = number13;
                } else if (a[i][j] >= number3 && a[i][j] <= number4) {
                    a[i][j] = number14;
                } else if (a[i][j] >= number5 && a[i][j] <= number6) {
                    a[i][j] = number15;
                } else if (a[i][j] >= number7 && a[i][j] <= number8) {
                    a[i][j] = number16;
                } else if (a[i][j] >= number9 && a[i][j] <= number10) {
                    a[i][j] = number17;
                } else if (a[i][j] >= number11 && a[i][j] <= number12) {
                    a[i][j] = number18;
                }
                }
            }
            return a;
        }
        /**
         * @param args value
         */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
