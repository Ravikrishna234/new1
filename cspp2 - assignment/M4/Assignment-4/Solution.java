import java.util.Scanner;
/**REVERSE.**/
final class Solution {
    /**
    * Do not modify the main function.
    **/
    private Solution() { }
    /**
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * @param str String
     * @return rev rev
     */
    public static String reverseString(final String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + Character.toString(ch);

        }
        return reverse;
    }
}
