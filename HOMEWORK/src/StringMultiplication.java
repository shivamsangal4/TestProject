import java.util.Scanner;
public class StringMultiplication 
{
	public static void main(String[] args) 
	{	String s1,s2,ans ="";
	 	int max =0,count =0;
		Scanner sc = new Scanner(System.in);
		
		//enter String one
		System.out.println("enter num1(num>1digit)=");
		s1=sc.nextLine();
		//enter String two
		System.out.println("enter num2(num>1digit)=");
		s2=sc.nextLine();
		
		//string array where we perform one by one multiplication
		//and stored it in this array
		String[] s= new String[s2.length()];
		
		//loop to initialize every string with empty string""
		for (int i = 0; i < s.length; i++) 
		{	s[i]="";
					
				//store all the string with end zero for addition 
				for (int j = 0; j < i; j++) 
					s[i]=s[i]+"0";	
		}
		
		//loop to get all the string values and we use max here to find 
		//the string with max length 
		for (int j =s2.length()-1; j >=0; j--) 
		{	int sum=0;
			for (int i = s1.length()-1;i >=0; i--) 
			{
				int k =(s1.charAt(i)-48)*(s2.charAt(j)-48)+sum;
				//store output
				sum=k/10;
				if(i!=0)
				//Remainder
				k=k%10;
				//get the output of the each string
				s[count]=k+s[count];
				}
			if(count!=0)
				
				// here we calculate the length of max arrays of string 
			if(s[count].length()>=s[count-1].length())
				max=s[count].length();
			count++;
		}
		
		//loop for Putting zeros in front of arrays of string
		//so that all the array are of same length and we can easily
		//add all the string 
		for (int i = 0; i < s.length; i++) 
			for (int j = s[i].length(); j <= max; j++) 
				s[i]=0+s[i];
				int sum= 0;
				
				//loop to add all the string
			for (int i = max; i >= 0; i--) 
		{
				//add all the array string at each index
				for (int j=0; j < s2.length() ; j++) 
					//store it in sum
					sum=sum+(s[j].charAt(i)-48);
			ans=(i!=0)?(sum%10)+ans:sum+ans;
			sum=sum/10;
		}
			//get the answer
			System.out.println("answer="+ans.substring(1));
	}
}