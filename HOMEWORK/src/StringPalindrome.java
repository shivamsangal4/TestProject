import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)==s.charAt(s.length()-i-1))
		{
			count++;
		}
	}
	if (count==s.length())
	{
		System.out.println("palindrone");
	}
	else
		System.out.println("not palindrone");
}
}
