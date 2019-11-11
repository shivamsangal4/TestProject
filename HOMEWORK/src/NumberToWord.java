import java.util.Scanner;

class num2word
{   
	String[] Two= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] Two1= {"","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	String[] hun = {"","","hundred","","thousand","","","lakh","","","crore"};
	public int num(int a, int b,int i)
	{
		System.out.println(hun[i]);
	i=i+2;
	if(i==4)
	{   a=0;
		i++;
	}
	if((a*10+b)<20)
	{
		System.out.println(Two[(a*10+b)]);
	}
	else
	{
		System.out.println(Two[a]);
		System.out.println(Two[b]);
	}
	return i;
	}
}
public class NumberToWord {
public static void main(String[] args) {
	num2word num = new num2word();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number ");
	int n=sc.nextInt();
	int i=0;
	int w=n;
	System.out.println("ANS=");
	if(w==0)
	System.out.print("zero");
		for ( i = 0; n!=0; i++) 
		n=n/10;
		int[] k =new int[i];
		for ( int l = 0; w!=0; l++) 
		{   k[l]=w%10;
			w=w/10;
			}
		int q=0;
		while(q>i)
		{
			q=num.num(k[i-1],k[i-2],q);
		}
}
}
