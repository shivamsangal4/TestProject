import java.util.Random;

public class Random01 
{
public static void main(String[] args) 
{
Random r = new Random();
int i,m=0;
for(int k=0;k<20;k++) {
	System.out.println(i=r.nextInt());
	if (i<0)
	{
	m++;	
	}
	
}
System.out.println("number of negative "+m);

System.out.println("number of positive "+(20-m));
}
}
