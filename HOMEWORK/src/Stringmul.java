	import java.util.Scanner;
			public class Stringmul
			{
				public static void main(String[] args) 
				{	System.out.println("enter num1(num>1digit)=");
					String s1,s2,ans ="";
					Scanner sc = new Scanner(System.in);
					String[] s= new String[1000];
					s1=sc.nextLine();
					System.out.println("enter num2(num>1digit)=");
					s2=sc.nextLine();
					int max =0;
					for (int i = 0; i < s.length; i++) 
					{s[i]="";
					for (int j = 0; j < i; j++) 
						s[i]=s[i]+"0";	
					}
					int count =0;
					for (int j =s2.length()-1; j >=0; j--) 
					{	int sum=0;
						for (int i = s1.length()-1;i >=0; i--) 
						{
							int k =(s1.charAt(i)-48)*(s2.charAt(j)-48)+sum;
							sum=k/10;
							if(i!=0)
							k=k%10;
							s[count]=k+s[count];
							}
						if(count!=0)
						if(s[count].length()>=s[count-1].length())
							max=s[count].length();
						count++;
					}
					for (int i = 0; i < s.length; i++) 
						for (int j = s[i].length(); j <= max; j++) 
							s[i]=0+s[i];
					int sum=0;
						for (int i = max; i >= 0; i--) 
					{
							for (int j=0; j < s2.length() ; j++) 
								sum=sum+(s[j].charAt(i)-48);
						ans=(i!=0)?(sum%10)+ans:sum+ans;
						sum=sum/10;
					}
						System.out.println("answer="+ans);
				}
			}
