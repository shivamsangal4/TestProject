import java.util.Arrays;
import java.util.Random;

public class Shuffler 
{
	public void doShuffle(int[] a)
	{	int w=a.length;
		Random r = new Random();
		for (int i = 0; i < w; i++) 
		{
			int r1 = r.nextInt(a.length);
			System.out.print("'"+a[r1]);
			int temp=a[r1];
			a[r1]=a[a.length-1];
			a[a.length-1]=temp;
			a=Arrays.copyOf(a, a.length-1);
		}
		
	}
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		Shuffler s = new Shuffler();
		s.doShuffle(a);
		System.out.println();
		s.doShuffle(a);
		System.out.println();
		s.doShuffle(a);
	}
}
