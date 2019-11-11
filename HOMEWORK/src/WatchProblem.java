import java.util.Scanner;

class Watch
{
	int h,m,s;
	Watch(int h1,int m1,int s1)
	{
		h=h1;
		m=m1;
		s=s1;
	}
	void showTime12F()
	{   String c="a";
		if(h<=11)
		{
			System.out.print(h+":");
			c="AM";
		}
		else if(h==12)
		{
			System.out.print("12:");
			c="NOON";
		}
		else if(h<=23)
		{
			System.out.print((h-12)+":");
			c="PM";
		}
		else if(h==24)
		{
			System.out.print("0:");
			c="MidNight";
		}
		System.out.println(m+":"+s+" "+c);
		
	}
	void showTime24F() 
	{
		System.out.println(h+":"+m+":"+s+"HOURS");
	}
}
public class WatchProblem 
{
public static void main(String[] args) 
{   int a,b,c,d;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Hour =");
	a= sc.nextInt();
	while(!(a<25))
	{System.out.println("Wrong enter again =");
	a= sc.nextInt();
	}
	System.out.println("Enter Minute =");
	b= sc.nextInt();
	while(!(b<60))
	{System.out.println("Wrong enter again =");
	b= sc.nextInt();
	}
	System.out.println("Enter Second =");
	c= sc.nextInt();
	while(!(c<60))
	{System.out.println("Wrong enter again =");
	c= sc.nextInt();
	}
	Watch w = new Watch(a,b,c);
	System.out.println("Enter 1 for 12H format and 2 for 24H format=");
	
	d=sc.nextInt();
	if(d==1)
	{
		w.showTime12F();
	}
	else if(d==2)
	{
		w.showTime24F();
	}
	
}
}
