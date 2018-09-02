
//Write a java method that returns the decimal value for the binary string.


import java.util.Scanner;
/**
 * @return [description]
 */
public final class Solution {
/*
    Do not modify the main function
    */
    //.
    private Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param s [description]
     * @return [description]
     */

public static String reverseString(final String s) {
    String reverse = "";
    //This block of code does the reverse for a given string
    for (int i = s.length() - 1; i >= 0; i--) {
        reverse = reverse + s.charAt(i);
    }
    return reverse;
    }
}
