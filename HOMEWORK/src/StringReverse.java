import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) 
{
	String s,k="" ;
	System.out.println("enter the string you want to reverse");
	Scanner sc = new Scanner(System.in);
	s=sc.nextLine();
	for (int i = 0; i < s.length(); i++) 
	{
		k=s.charAt(i)+k;
	}
    System.out.println(k);
}
}
