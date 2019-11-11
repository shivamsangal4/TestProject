import java.util.Scanner;

public class SortingMinMax {
public static void main(String[] args) 
{    
	int size;
	System.out.println("enter no. of elements = ");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < arr.length; i++) 
	{
	    System.out.println("element"+i+"=");	
	    arr[i]=sc.nextInt();
	}
	int smin=arr[0],min=arr[0],max=-999999,smax=-999999,count=0;
	for (int i = 0; i < arr.length; i++) 
	{
		if(min>=arr[i])
		{   
			smin =min;
			min = arr[i];
     		count++;
			
		}

	}
		if (count<2)
		{  min=arr[arr.length-1];
			for (int i = arr.length-1; i >= 0; i--) 
			{   
				if(min>=arr[i])
				{   
					smin =min;
					min = arr[i];
				}
	}
		}
			
			for (int i = 0; i < arr.length; i++) 
			{  
				if(max<=arr[i])
				{   
					smax =max;
					max = arr[i];
					
				}
				else if((arr[i]>=smax)&&(max>=arr[i]))
				smax = arr[i];
			}
				
	System.out.println("Minimum="+min);
	System.out.println("Second Minimum="+smin);
	System.out.println("Maximum="+max);
	System.out.println("Second Maximum="+smax);
	for (int i = 0; i < arr.length; i++) 
	{
	for (int j = 0; j < arr.length-i-1; j++) 
	{  if (arr[j]>=arr[j+1])
		{int temp;
		temp =arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;}
	}	
	}
	System.out.print("sorted Acending=");
	for (int i = 0; i < arr.length; i++)
	{
	System.out.print(arr[i]+"-");	
	}
    int k = arr.length;
	for (int i = 0; i <= k; i++)
	{
		int temp;
		temp =arr[i];
		arr[i]=arr[k-1];
		arr[k-1]=temp;	
		k--;
	}
	System.out.print("\nsorted decending=");
	for (int i = 0; i < arr.length; i++)
	{
	System.out.print(arr[i]+"-");	
	}
	
}
}


