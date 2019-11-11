import java.util.Random;

public class Random05 {
	public static void main(String[] args) 
	{
        System.out.print("OTP =");
        Random r = new Random();
        
        for(int k=0;k<4;k++)
        {   
        	int i= r.nextInt(26)+65;
          char c = (char)i;
        	System.out.print(c);
        }
        for(int k=0;k<4;k++)
        {   
        	int i= r.nextInt(10);
        	System.out.print(i);
        }
	}

}
