
public class HW2 {
	public static void main(String[] args) 
	{
	float d =54.23122f,a=1f;
	float c= d%a;
	System.out.println(c);
	int k=(int)d;
	System.out.println("integer part="+k);
	int counter=0;
	while(c!=0)
	{ d=d*10;
	  c= d%a;
	  counter++;}
	System.out.println(counter);
	int l=counter;
	while(counter!=0)
	{ counter--;
	 k=k*10;}
	
	int w= (int)d-k;
	System.out.println("decimal part =."+w);
	}
}
