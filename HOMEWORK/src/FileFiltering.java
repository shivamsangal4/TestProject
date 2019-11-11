import java.io.File;

public class FileFiltering 
{
	public static void main(String[] args)
	{
		File f = new File("C:\\Users\\shiva\\Desktop");
		File[] g =f.listFiles();
		String[] s = new String[10];
		String prev;
	for (int i = 0; i < g.length; i++) 
	{
		if (g[i].getName().lastIndexOf(".")==g[i].getName().length()-4)
		{
			System.out.println(g[i].getName());
		}
	}
		
	}
}
