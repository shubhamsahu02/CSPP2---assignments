import java.util.Scanner;
/**
 * The main class.
 */
public class Solution {
    /**
     * empty constructor.
     **/
    protected Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param args [description]
     **/
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * @param a [description]
     * @param b [description]
     * @param c [description]
    Need to write the rootsOfQuadraticEquation function and print the output.
    **/
public static void rootsOfQuadraticEquation(
    final int a, final int b, final int c) {
    final int t = 4;
    double result = ((b * b) - t * a * c);
    double root1 = (-b + Math.sqrt(result)) / (2 * a);
    double root2 = (-b - Math.sqrt(result)) / (2 * a);
    System.out.println(root1 + " " + root2);
}
}










