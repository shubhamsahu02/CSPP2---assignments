
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < n; i++) {
			if (i < n-1) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > temp) {
					temp = arr[i];
				}
			}
		}
		if (arr[n-1] > temp) {
			temp = arr[n-1];
		}else {
			temp = temp;
		}
	}
	System.out.println(temp);

	}
}
