
public class NumberToWords {
public static void main(String[] args) 
{
		String[] a= {"zero","one","two","three","four","five","six",
				"seven","eight","nine","ten",
				"eleven","twelve","thirteen","forteen","fifteen",
				"sixteen","seventeen","eighteen",
				"nineteen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		String[] h = {"hundred","thausand","lakh","crore"};
				
		
		int n=25232;
		int i=0;
		int w=n;
			for ( i = 0; n!=0; i++) 
			{
				n=n/10;
			}
			int[] k =new int[i];
			for ( int l = 0; w!=0; l++) 
			{   k[l]=w%10;
				w=w/10;
			}
			for (int j = 0; j < k.length; j+=2) 
			{
				if(k[j]>=1) 
				{
				 	if((j==2)||((j-1)==3)||(j==5)||(j==7)) 
					{
				
						System.out.println(h[((j+1)/2)-1]);
					}
					System.out.println(a[k[j]]);
					
				}
				if(j+1<k.length)
				if(k[j+1]>=1) 
				{
					System.out.println(a[18+k[j+1]]);
				}
			}
		}
}

