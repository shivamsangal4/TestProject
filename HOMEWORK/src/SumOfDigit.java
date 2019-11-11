
public class SumOfDigit {
	public static void main(String[] args) 
	{
	int i =22222;
	int n,s=10;
	while(s>9)
	{ s=0;
		while(i>0)
	{
		n=i%10;
		s=s+n;
		i=i/10;
		
	}
	i=s;
	}
	System.out.println(i);
	}

}
