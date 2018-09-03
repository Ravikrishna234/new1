import java.util.Scanner;
/**VALIDATEINPUT.**/
final class InputValidator {
    /**
     *@param str value
     */
    private String data;
    private int len;
    /**
     * @param str value
     */
    InputValidator(final String str) {
        data = str;
        len = str.length();
    }
    /**
     * @return value
     */
    boolean validateData() {
        final int six = 6;
        if (len >= six) {
            return true;
        }
            return false;
    }
}
/**class.*/
final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     */
    private Solution() { }
    /**
     * @param args value
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}

