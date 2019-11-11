import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class StringLength {
public static void main(String[] args) {
	String s;
	int count =0;
	Scanner sc = new Scanner(System.in);
	s=sc.nextLine()+0;
	for (int i = 0; i!=-1; ) 
	{
	if(!(s.substring(i).equals("0")))	
	{
		i++;
		count++;
	}
	else
	i=-1;
	}
	System.out.println("length="+count);
}
}
