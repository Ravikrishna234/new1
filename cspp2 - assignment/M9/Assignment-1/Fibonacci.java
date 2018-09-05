import java.util.Scanner;
/**FIBONACCI.**/
final class Fibonacci {
    /**
    * @brief [brief description]
    * @details [long description]
    */
    private Fibonacci() { }
    /**
     * @param n value
     * @return value
    **/
    public static List fib(final int n) {
        List l = new List(n);
        int a = 0;
        int b = 1;
        l.add(a);
        l.add(b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            l.add(c);
            a = b;
            b = c;
        }
        return l;
    }
    /**
     * @param args value
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
