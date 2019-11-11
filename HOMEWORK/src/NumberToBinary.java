import java.util.Scanner;

class NumberSystem
{
	String decimalToBinary(int num)
	{
		String s="";
		for(;num!=0;)
		{	
			s=num%2+s;
			num=num/2;
		}
		return s;
	}
	String decimalToOctal(int num)
	{
		String s="";
		for(;num!=0;)
		{	
			s=num%8+s;
			num=num/8;
		}
		return s;
	}
	String decimalToHex(int num)
	{
		String s="";
		for(;num!=0;)
		{	int k=num%16;
		    if(k<10)
			s=k+s;
		    else
		    s=(char)(k+55)+s;	
			num=num/16;
		}
		return s;
	}
}
public class NumberToBinary 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Number =");
	int num = sc.nextInt();
	NumberSystem n = new NumberSystem();
	System.out.println("enter Choice\n1.Binary\n2.Octal\n3.HexaDecimal");
	int choice = sc.nextInt();
	String s;
	switch(choice)
	{
	case 1: s=n.decimalToBinary(num);
			break;
	case 2: s=n.decimalToOctal(num);
	  		break;
	case 3: s=n.decimalToHex(num);  		
		    break;
    default : s="Invalid Choice";		    
	}
	System.out.println(s);
	
}
}
