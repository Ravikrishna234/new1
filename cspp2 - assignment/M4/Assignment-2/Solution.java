import java.util.Scanner;
/**MATRIX ADDITION.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     *Fill the main function to print resultant of addition of matrices
     **/
    private Solution() { }
    /**
     * @param args [description]
    **/
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int row1 = s.nextInt();
        int col1 = s.nextInt();
        int[][] a = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int row2 = s.nextInt();
        int col2 = s.nextInt();
        int[][] b = new int[row2][col2];
        //System.out.println(row1+" "+row2+" "+col1+" "+col2);
        if (row1 == row2 && col1 == col2) {
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = s.nextInt();
            }
        }
        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = a[i][j] + b[i][j];

            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
        if (j < col2 - 1) {
        System.out.print(result[i][j] + " ");
            } else {
        System.out.print(result[i][j]);
            }
         }
    System.out.print("\n");
        }
} else {
System.out.println("not possible");
}
}
}

