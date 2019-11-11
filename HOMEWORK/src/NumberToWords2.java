import java.util.Scanner;

public class NumberToWords2 {
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
		    if (i>2){
			for (int j =k.length ; j > 0; j--) 
			{   if((j%2!=0)||j <k.length)
				{if(j!=3)
				{
				if(j<k.length)
				{if((k[j-1]>0)&&(k[j]>0))
				{if(k[j-1]==1)
				{System.out.print(" "+Two1[k[j-2]-1]);
				j--;}
				else if((j!=1)&&((j%2==1)||(j==2)))
				System.out.print(" "+Two1[k[j-1]+8]);
				else
				System.out.print(" "+Two[k[j-1]]);
				}
				}
				else if((k[j-1]>0)&&(k[j-2]>0))
				if(k[j-1]==1)
				{System.out.print(" "+Two1[k[j-2]-1]);
				j--;}
				else if((j!=1)&&((j%2==1)||(j==2)))
				System.out.print(" "+Two1[k[j-1]+8]);
				}
				else
				System.out.print(" "+Two[k[j-1]]);}
				else
				System.out.print(" "+Two[k[j-1]]);
				if((j==4)||(j==3)||(j==6)||(j==8))
				{ System.out.print(" "+hun[j-1]);}
				
			}}
else if(k[1]!=1)			
for (int j =k.length ; j > 0; j--)
{ if(k[1]!=1){
if(j==2)
System.out.print(" "+Two1[k[j-1]+8]);
if(j==1)
System.out.print(" "+Two[k[j-1]]);}}
else{
System.out.print(" "+Two1[k[0]-1]);

}
}
}

