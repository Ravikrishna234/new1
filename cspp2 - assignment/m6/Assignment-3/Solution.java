import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a java program to replace each element
 *  of the given char array that matches the given
 *  character with the given replacement.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * @param charArray value
     * @param oldChar value
     * @param newChar value
     * @return [description]
     */
    static char[] replaceAll(final char[] charArray,
        final char oldChar, final char newChar) {
        for (int i = 0; i < charArray.length; i++) {
            if (oldChar == charArray[i]) {
                charArray[i] = newChar;
            }
        }
        return charArray;
        }
    /**
     * @param args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] charArray = new char[n];
        for (int i = 0; i < n; i++) {
            charArray[i] = scan.next().charAt(0);
        }
        char oldChar = scan.next().charAt(0);
        char newChar = scan.next().charAt(0);
        char[] newCharArray = replaceAll(charArray, oldChar, newChar);
        System.out.println(Arrays.toString(newCharArray));
    }
}
