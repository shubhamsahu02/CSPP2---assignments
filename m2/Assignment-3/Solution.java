import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        // power(base,exponent);
        System.out.println(power(base, exponent));
	}
	/*
	Need to write the power function and print the output.
	*/
public static int power(final int base, final int exponent) {
	if (exponent == 0) {
		return 1;
	}
	// else if (exponent == 1) {
	// 	return base;
	// }
	else {
		return base * power(base, exponent - 1);
	}
	}
}

