import java.util.Random;

public class Random03 
{
	public static void main(String[] args) 
	{
	Random r = new Random();
	int i,m=0, c = 0;

	for(int k=0;k<20;) 
	{
		i=r.nextInt()%10000;
		
	k++;
			System.out.println(i);
		
		c++;
	}

	System.out.println("total iterations are "+c);
}
}