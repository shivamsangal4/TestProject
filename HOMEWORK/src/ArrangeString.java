import java.util.Scanner;

class show
{
	public String[] Assending(String[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length-i-1; j++) 
			{
				if(0<array[j].compareTo(array[j+1]))
				{
					String swap;
					swap =array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}
	
		}
		return array;
	}
	public void Deccending(String[] array)
	{
		for (int i = array.length-1; i >= 0; i--) 
		{
			System.out.print("-"+array[i]);
		}
	}
}
public class ArrangeString 
{
	public static void main(String[] args) 
	{
	System.out.println("enter the String =");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String p =" ";
	String[] k =s.split(p);
	int count=0;
	for (int i = 0; i < k.length; i++) 
	{
	if(!k[i].equals(""))
	{	count++;
	}
	}
	if(count>=10)
	{
		String[] a = new String[count];
		for (int i = 0, j=0; i < k.length; i++) 
		{
			if(!k[i].equals(""))
			{a[j]=k[i];
			j++;
			}
			}
		
		show sh =new show();
		sh.Assending(a);
		System.out.println("assending");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print("-"+a[i]);
		}
		System.out.println("\nDecending");
		sh.Deccending(a);
	}
	else
		System.out.println("String Should have more then 10 letter");
	}
	}

