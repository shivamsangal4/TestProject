import java.util.Random;
import java.util.Scanner;

public class Random04 {
	public static void main(String[] args) 
	{
		int n;
	
		System.out.println("Enter the number of digit otp=");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    if (n<6)
	    {
	    	System.out.println("TOO SMALL");
	    }
	    else if(n>10)
	    {
	    	System.out.println("TOO BIG");
	    }
	    else
	    {   System.out.print("OTP=");
	    	Random r= new Random();
	    	
	    	for (int k=0;k<n;k++)
	    	{
	    		System.out.print(r.nextInt(10));
	    		
	    	}
	    }
	}

}
