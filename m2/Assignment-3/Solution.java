import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
        long base = s.nextLong();
        long exponent = s.nextLong();
        // power(base,exponent);
        System.out.println(power(base, exponent));
	}
	/*
	Need to write the power function and prdouble the output.
	*/
public static long power(final long base, final long exponent) {
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

