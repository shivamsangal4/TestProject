import java.io.File;
import java.util.Scanner;

public class FileClass 
{
	public static void main(String[] args) 
	{
		int option;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter path->");
		
		String path= sc.nextLine();
		
		File f = new File(path);
		
		if(f.exists())
		{
			if(f.isDirectory())
			{
				System.out.println("its a directory");
				System.out.println("do you wish to make a directory inside the given directory press 1 and enter");
				option = sc.nextInt();
				if(option==0)
				{
					System.out.println("enter file name");
					String name= sc.next();
					File f1 = new File(path+"\\"+name);
					if(f1.mkdir())
					{
						System.out.println("folder created");
					}
				}
				//for calculating size of folder in mb
				while(option==0)
				{
					option =1;
				}
				
			}
			else if(f.isFile())
			{
				System.out.println("its a file");
				System.out.println("size of file in mb");
				System.out.println(f.length()/1024/1024);
				System.out.println("time at which file was modified->");
				System.out.print(f.lastModified());
				
			}
			else
			{
				System.out.println("path does not exist");
			}
		}
		else
		{
			System.out.println("wrong path");
		}
	}
}
