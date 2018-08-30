import java.util.Scanner;
/**MAX ELEMENT.**/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     *Fill this main function to print maximum of given array
     */
    private Solution() { }
    /**
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
        }
        System.out.println(max);
    }
}

