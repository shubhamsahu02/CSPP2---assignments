
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s=sc.nextLine();
			int res=binaryToDecimal(s);  //Write binaryToDecimal function
			System.out.println(res);
		}
	}

		public static int binaryToDecimal (String s) {
			double res = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'i') {
					res = res + Math.pow(2, s.length()-1-i);

				}
			}
			return (int) res;
		}	
		}

