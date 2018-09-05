import java.util.Scanner;

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */

/**
 *
 */
final class Fibonacci {
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */

/**
 * @brief [brief description]
 * @details [long description]
*/
    private Fibonacci() {

    }

/**
 * @brief [brief description]
 * @details [long description]
 *
 * @param n [description]
 * @return [description]
 */
    public static List fib(final int n) {
        int a = 0, b = 1, c;
        final int d = 3;
        List obj = new List();
        obj.List(n);
        if (n == 1) {
            obj.add(a);
        } else if (n == 2) {
            for (int i = 0; i < 2; i++) {
                obj.add(a);
                a = a + 1;
            }
        } else {
            obj.add(a);
            obj.add(b);
            for (int i = d; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            obj.add(c);
        }
    }
    return obj;
}

/**
 * @brief [brief description]
 * @details [long description]
 * @param args [description]
 */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
