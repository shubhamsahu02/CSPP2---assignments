import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
public static void rootsOfQuadraticEquation(int a, int b, int c) {
	int t = 4;
	double result = ((b * b) - t * a * c);
	double root1 = (-b + Math.sqrt(result)) / (2 * a);
	double root2 = (-b - Math.sqrt(result)) / (2 * a);
    System.out.println(root1 + " " + root2);
}
}


