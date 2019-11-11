import java.util.Scanner;
class money
{
	int money (int a,int k) 
	{
		if(a>=k) 
		{System.out.println("No of "+k+" notes="+a/k);
		 a=a%k;
		}
		return a;
	}
}
public class ATM 
{
public static void main(String[] args) 
{
int a;
Scanner sc = new Scanner(System.in);
System.out.println("enter the amount =");
a= sc.nextInt();

money m = new money();
a=m.money(a, 2000);
a=m.money(a, 500);
a=m.money(a, 200);
a=m.money(a, 100);
a=m.money(a, 50);
a=m.money(a, 20);
a=m.money(a, 10);
a=m.money(a, 5);
a=m.money(a, 2);
a=m.money(a, 1);
}
}
