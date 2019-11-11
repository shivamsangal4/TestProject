import java.util.Scanner;

public class ReverseTheString 
{
public static void main(String[] args) 
{
	System.out.println("Enter the String=");
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	char[] c = s.toCharArray();
	System.out.println("First Reverse=");
	for (int i =c.length-1; i >= 0; i--)
	System.out.print(c[i]);
	System.out.println("\nSecond Reverse=");
	String p =" ";
	String[] k =s.split(p);
	for (int i = 0; i < k.length; i++) 
	{
		char[] c1 = k[i].toCharArray();
		for (int j = k[i].length()-1; j >=0; j--) 
		{
		System.out.print(c1[j]);
		}
		System.out.print(" ");
	}
}
}
