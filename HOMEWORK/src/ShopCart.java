import java.util.Scanner;

public class ShopCart 
{
public static void main(String[] args) 
{
	int[] p_id = {101,209,563,874,512,664,723,812};
	String[] name = {"colgate","bonvita","Nice","maggi","kurkure",
			"complain","rasna","cake"};
	String[] weight = {"100gm","500gm","100gm","80gm","75gm",
			"500gm","35gm","100gm"};
    int[] cost = {40,325,15,12,15,340,35,25};
    String[] exp = {"FEB2020","JUL2020","FEB2021","AUG2020",
    		"SEP2020","JUN2020","MAR2020","FEB2021"};
    boolean[] available = {true,true,false,true,true,
    		false,true,false};
    int k=1,n=0,m;
    System.out.println("enter product id");
    Scanner sc = new Scanner(System.in);
    while(k==1)
    {   n= sc.nextInt();
    	for (int i = 0; i < available.length; i++) 
    {   
		if(n==p_id[i])
		{   n=i;
			k=0;
			System.out.println("product you selected is "+name[i]);
		}
	}
    if(k==1)
    	{System.out.println("Invalid input enter again=");}
    }
    if(available[n])
    {System.out.println("And product is available");
     System.out.println("how many "+name[n]+"s you want=");
     m=sc.nextInt();
     System.out.println("gst=5%");
     System.out.println("price ="+cost[n]+"each");
     System.out.println("total="+(cost[n]*m*1.05)+"rs");
    }
    
    else
    	{System.out.println("And product is not available");}
    
}
}