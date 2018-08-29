import java.util.Scanner;
/** class begins.
 **/
public final class Solution {
    /**
     * Class.
     **/
    private Solution() {
        /**
        it is a constructor
        **/
    }
    /**
    * @param string.
    * @param args */
    public static void main(final String[] args) {
        /**
         * @brief [brief description.
         * @details [long description.
         * @param  base long
         * @param  exponent long
         * @return long
         */
        Scanner s = new Scanner(System.in);
        long base = s.nextLong();
        long exponent = s.nextLong();
        // power(base,exponent);
        System.out.println(power(base, exponent));
    }
    /*
    Need to write the power function and print the output.
    */
    /**
     * @param  base long.
     * @param exponent long.
     * @return power.
     */
public static long power(final long base, final long exponent) {
    /**
    * main fubction of class
     */
    if (exponent == 0) {
        return 1;
    } else {
        return base * power(base, exponent - 1);
    }
    }
}
