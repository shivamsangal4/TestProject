import java.util.Random;

public class Random06 
{
public static void main(String[] args) 
{
	System.out.print("OTP=");
	Random r = new Random();
	for(int w=0; w<8;w++)
	{
	switch(r.nextInt(3))
	{
	case 0: System.out.print(r.nextInt(10));
	        break;
	case 1: System.out.print((char)(r.nextInt(26)+65));
            break;
    case 2: System.out.print((char)(r.nextInt(26)+97));
            break;
	}
	}
}
}
