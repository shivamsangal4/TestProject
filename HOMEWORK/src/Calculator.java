import java.util.Scanner;

public class Calculator	extends Remainder
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 int a,b;
		 System.out.println("enter the num1=");
		 a=sc.nextInt();
		 System.out.println("enter the num2=");
		 b=sc.nextInt();
		 System.out.println("enter the choice =");
		 System.out.println("1.addition\n2.subtraction\n3.multiplication\n3.division\n4.remainder");
		 int ch = sc.nextInt();
		 Calculator c=new Calculator();
		 switch (ch) {
		case 1:System.out.println(c.add(a,b));
				break;
		case 2:System.out.println(c.sub(a,b));
				break;
		case 3:System.out.println(c.div(a,b));
				break;
		case 4:System.out.println(c.rem(a,b));
				break;
		default:
			break;
		}
	}
}
