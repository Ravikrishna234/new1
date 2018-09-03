import java.util.*;
class InputValidator
{
	int len;
	/*Write the atrributes and methods for InputValidator*/
	InputValidator(String str) {
		len = str.length();
	}
	boolean validateData() {
		if(len>=6)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
	public class Solution {
	public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	InputValidator i=new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
