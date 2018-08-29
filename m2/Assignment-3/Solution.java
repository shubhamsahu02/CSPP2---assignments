import java.util.Scanner;
/** 
 * @param args.
 */
public final class Solution {
	/*
	Do not modify this main function.
	*/
	/**
	 * @param string.
	 */
	private Solution() {
		/**
		it is a constructor
		**/
	}
	/**
	 * @param string.
	 */
	public static void main(String[] args) {
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
	 * @param base.
	 * @param exponent.
	 * @return power.
	 */
public static long power(final long base, final long exponent) {
	if (exponent == 0) {
		return 1;
	} else {
		return base * power(base, exponent - 1);
	}
	}
}

