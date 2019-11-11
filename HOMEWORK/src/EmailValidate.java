import java.util.Scanner;
public class EmailValidate 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Email=");
		Scanner sc =new Scanner(System.in);
		String s= sc.nextLine();
		  System.out.println(  (s.contains("@")&&((s.contains(".com")||s.contains(".co.in"))))
	    	?((s.indexOf("@")==s.lastIndexOf("@"))&&(s.indexOf("@")!=0))
	    	?(s.indexOf(".com")==s.lastIndexOf(".com")&&((s.lastIndexOf(".com")==-1)||(s.lastIndexOf(".com")==s.length()-4)))
	    	?(s.indexOf(".co.in")==s.lastIndexOf(".co.in")&&((s.lastIndexOf(".co.in")==-1)||(s.lastIndexOf(".co.in")==s.length()-6)))
	    	?((s.indexOf("@")!=(s.indexOf(".co.in")-1)))
	    	?((s.indexOf("@")!=(s.indexOf(".com")-1)))
		    ?"valid":"invalid":"invalid"
		    :"invalid":"invalid":"invalid":"invalid");
		  
		}
}
