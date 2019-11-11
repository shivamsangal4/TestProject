
public class Pattern {
public static void main(String[] args) 
{
	for (int i = 10; i > 0; i--) 
	{
		for (int k = 0; k < 10-i; k++) 
			System.out.print(" ");
		System.out.print("*");
		for (int j = 0; j < i; j++) 
			System.out.print("  ");
		System.out.println("*");
		for (int j = 0; j < i; j++) 
			System.out.print(" ");
		System.out.println("*");
		
	}
	
	 // the line below this gives an output 
    // \u000d System.out.println("comment executed"); 
}
}
