import java.util.Scanner;
/**FIBONACCI.**/
/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 */
final class Fibonacci {
    /**
    * @brief [brief description]
    * @details [long description]
    */
    private Fibonacci() { }
    /**
     * @param n [description]
     * @return value
     */
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
