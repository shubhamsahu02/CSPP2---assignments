import java.util.Scanner;
public class Solution {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String Name = sc.nextLine();
		System.out.println("Enter your roll number : ");
		int Roll = sc.nextInt();
		System.out.println("Hello "+Name);
		System.out.println("Your roll number is "+Roll);
	}
}