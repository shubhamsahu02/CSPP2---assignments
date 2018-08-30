import java.util.Scanner;
/**
 *this is import.
 */

final class Solution {
    /**
     * this is a class.
     */
    private Solution() { }
    /**
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        gcd(n, m);
        System.out.println(gcd(n, m));
    }

    /**
     * @param n num
     * @param m num
     * @return [description]
     */

    public static int gcd(final int n, final int m) {
        if  (m == 0) {
            return n;
        } else {
        return gcd(m, (n % m));
    }

    }
}
