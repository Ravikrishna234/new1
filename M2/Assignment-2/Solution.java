
import java.util.Scanner;
/**This is a program.**/

final class Solution {
    /**
    *Do not modify this main function.
    **/
    private Solution() { }
    /**
    * @param args comment
    **/ 
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsEquation(a, b, c);
    }
    /**
    * @param a a
    * @param b b
    * @param c c
    **/
    public static void rootsEquation(final int a, final int b, final int c) {
        final int TWO = 2;
        double d = (b * b) - (TWO * TWO * a * c);
        double result = - b + (Math.sqrt(d));
        result = result / (TWO * a);
        double result1 = -b - (Math.sqrt(d));
        result1 = result1 / (TWO * a);
        System.out.println(result + " " + result1);

    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}
