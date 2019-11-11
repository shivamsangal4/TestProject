import java.util.Scanner;

public class Frequency 
{
public static void main(String[] args) 
{   int s;
    int m=0;
    System.out.println("enter the number of elements =");
    Scanner sc = new Scanner(System.in);
    s= sc.nextInt();
	int[] element= new int[s];
	int[] repeat= new int[s];
	for (int i = 0; i < repeat.length; i++) 
	{
	repeat[i]=-1;	
	}
	for (int i = 0; i < element.length; i++) 
	{ 
		System.out.println("element"+i+"=");
		element[i]= sc.nextInt();
		for (int k = 0; k < repeat.length; k++) 
		{
			if(repeat[k]==element[i])
				break;
			else if(repeat[k]==-1)
			{
				repeat[m]=element[i];
				m++;
				break;
			}

		}
		
	}
	for (int i = 0; i < m; i++) 
	{ int count=0;
		for (int j = 0; j < element.length; j++) 
		{
			if (element[j]==repeat[i])
			{
				count++;
			}
		}
		if (count>1) 
		{
			System.out.println(repeat[i]+" COMES "+count+" TIMES ");
		}
		else
		{
			System.out.println(repeat[i]+" COMES "+count+" TIME ");
		}
	}
	
}
}
