import java.util.Scanner;

public class frequency1 {
public static void main(String[] args) 
{
    System.out.println("enter the number of elements =");
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
	int[] element= new int[s];
	for (int i = 0; i < element.length; i++) 
	{ 
		System.out.println("element"+i+"=");
		element[i]= sc.nextInt();}
	System.out.println("enter the element =");
	int e =sc.nextInt();
	int count=0,first=-1,last=-1;
	for (int i = 0; i < element.length; i++) 
	{
	if(element[i]==e)
		{if(count==0)
		    first=i;
		last=i;
		count++;
		}
	}
	System.out.print("First index=");
	if(first==-1)
		System.out.println("Not Applicble");
	else
		System.out.println(first);
	System.out.print("Last index=");
	if(last==-1)
		System.out.println("Not Applicble");
	else
		System.out.println(last);
	System.out.println("frequency="+count);
}
}
