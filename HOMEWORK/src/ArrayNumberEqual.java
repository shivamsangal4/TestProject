import java.util.Scanner;

public class ArrayNumberEqual {
public static void main(String[] args) 
{
	System.out.println("enter the size of array1=");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int[] a1= new int[n];
	for (int i = 0; i < a1.length; i++) 
	{
		System.out.println("element"+i+"=");
		a1[i]=sc.nextInt();	
	}
	System.out.println("enter the size of array 2=");
	int m= sc.nextInt();
	int[] a2= new int[m];
	for (int i = 0; i < a2.length; i++) 
	{
		System.out.println("element"+i+"=");
		a2[i]=sc.nextInt();	
	}
	int count =0;
	for (int i = 0; i < a1.length; i++) 
	{
		for (int j = 0; j < a2.length; j++) 
		{
		if(a2[j]==a1[i])
		{
			count++;
			j=a2.length;
		}
		}
	}
	if(count==a1.length)
	{
		System.out.println("all element of a1 is in a2");
	}
	else
	{
		System.out.println("not all element of a1 is in a2");
	}
}
}
