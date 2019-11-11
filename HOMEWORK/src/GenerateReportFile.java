import java.io.FileInputStream;
import java.util.Scanner;

public class GenerateReportFile 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the path");
		String path ;
		int num=0,lines=0,words=0,alphabet=0;
		Scanner sc = new Scanner(System.in);
		path=sc.nextLine();
		try
		{
			FileInputStream f = new FileInputStream(path);
			byte[] i = new byte[f.available()];
			f.read(i);
			
			System.out.print("alphabets=[Uppercase=");
			for (int j = 0; j < i.length; j++) 
			{
				if((i[j]>=65)&&(i[j]<=91))
				{
					alphabet++;
					System.out.print((char)i[j]+",");
				}
			}
			System.out.print("]\n[lowercase=");
			for (int j = 0; j < i.length; j++) 
			{
				if((i[j]>=97)&&(i[j]<=113))
				{
					alphabet++;
					System.out.print((char)i[j]+",");
				}
			}
			System.out.print("]\n[numbers=");
			for (int j = 0; j < i.length; j++) 
			{
				if(i[j]==13)
					lines++;
				if((i[j]>=48)&&(i[j]<57))
				{
					num++;
					System.out.print((char)i[j]+",");
				}
			}	
			System.out.print("]\n"+"lines="+lines+"\nwords="+words+"\nnumber="+num+"\nalphabets="+alphabet);
		}
		
		catch (Exception e) 
		{
			System.out.println("wrong file path");
		}

		
	}
}
