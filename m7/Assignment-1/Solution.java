import java.util.*;
class InputValidator
{
	/*Write the atrributes and methods for InputValidator*/
	private String strCheck;
	private int len;
	InputValidator(String strCheck1) {
		strCheck = strCheck1;
		len = strCheck1.length();
	}

	public boolean validateData() {
		int b = 6;
		if(len >= b) {
			return true;
		}
		return false;
	}

}
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	InputValidator i=new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}