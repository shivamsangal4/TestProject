import java.util.Scanner;

public class NumberToWords3 {
	public static void main(String[] args) {
		String[] Two= {"","one","two","three","four","five","six","seven","eight","nine"};
		String[] Two1= {"eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String[] hun = {"","","hundred","thousand","","lakh","","crore"};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		int i=0;
		int w=n;
		if(w==0)
		System.out.print("zero");
		System.out.println("ANS=");
			for ( i = 0; n!=0; i++) 
			n=n/10;
			int[] k =new int[i];
			for ( int l = 0; w!=0; l++) 
			{   k[l]=w%10;
				w=w/10;
				}
		for (int j =k.length ; j > 0; j--) 
		{
			
		}
}
}
