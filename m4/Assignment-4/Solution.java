import java.util.Scanner;

public class Solution {


    Solution() {}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String reverse = reverse(s);
        System.out.println(reverse);
    }


    public static String reverse(String s) {
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }

}

