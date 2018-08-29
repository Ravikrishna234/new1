
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {
    	int count = 0;
        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        
        for(int i =1;i<=n;i++) {
        	int j = i;
        	while(j!=0){
        		int k;
        		k = j%10;
        		if(k==7) {
        			count += 1;
        		}
        		j = j/10;
        	}
        	i++;

        }
        System.out.println(count);

        
       
        
    }
}