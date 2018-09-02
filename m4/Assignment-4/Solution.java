
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution {
/*
    Do not modify the main function 
    */
    /**
     * @brief [brief description]
     * @details [long description]
     * 
     * @param args [description]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function

public static String reverseString(String s) {
    String reverse = "";
    //This block of code does the reverse for a given string
    for (int i = s.length() - 1; i >= 0; i--) {
        reverse = reverse + s.charAt(i);
    }
    return reverse;
    }
}
