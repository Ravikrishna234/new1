import java.util.Scanner;
/**MATRIXROUND.**/
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    static int[][] roundHundred(final int[][] a, final int rows, final int columns) {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(a[i][j]>=0 && a[i][j]<=49)
                {
                    a[i][j] = 0;
                }
                else if(a[i][j]>=50 && a[i][j]<=150)
                {
                    a[i][j] = 100;
                }
                else if(a[i][j]>=151 && a[i][j]<=249)
                {
                    a[i][j] = 200;
                }
                else if(a[i][j]>=250 && a[i][j]<=350)
                {
                    a[i][j] = 300;
                }
                else if(a[i][j]>=351 && a[i][j]<=449)
                {
                    a[i][j] = 400;
                }
                else if(a[i][j]>=450 && a[i][j]<=549)
                {
                    a[i][j] = 500;
                }
                }
            }
            return a;
        }
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
