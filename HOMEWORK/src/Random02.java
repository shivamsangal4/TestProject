import java.util.Random;

public class Random02 
{
public static void main(String[] args) 
{
Random r = new Random();
int i,m=0;
for(int k=0;k<20;k++) {
	i=r.nextInt();
	if (i<=0)
	{
	System.out.println(	-i);
	}
	
}
}
}
