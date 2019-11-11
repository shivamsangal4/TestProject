import java.io.FileInputStream;
import java.util.Scanner;
			class Book
			{
				public void filter(int isbn)
				{

					try {
						int count =1,c=0;
					FileInputStream f = new FileInputStream("C:\\Users\\shiva\\Desktop\\test.txt");
					
					while(isbn>=0)
					{	
					int r=f.read();
						if(isbn!=r-48)
							
							
					
					if(c==0)
					{System.out.print("\nBOOK="+count+"\nISBN=");
					c++;
					}
					
						if(r==-1)
						break;
						
						else if(r==44)
							{
							
							System.out.print(c==0?"BOOK="+count+"\nISBN=":c==1?"\nTopic=":c==2?"\nAuthor=":c==3?"\nPrice=":"\nPublisher=");
							r=f.read();
							
							c++;
							}
						else if(r==13)
						{ 	r=f.read();
							count++;
							c=0;
						}
						System.out.print((char)r);
						}
					
				} 
				catch (Exception e) 
				{
					System.out.println("wrong file");
				}
				}
			}
			
public class JAVAPROJECT 
{
		public static void main(String[] args) 
		{
			int isbn=0,price=0;
				String author,topic,publisher;
				Scanner sc = new Scanner(System.in);
				Book b = new Book();
				System.out.println("select the following filter");
				while(true)
				
				{
					System.out.println("1.ISBN\n2.topic\n3.author\n4.price\n5.publisher\n6.Show all books");
					int choice = sc.nextInt();
					System.out.println("do you want to add more filter?(press 1 if yes)");
					if(choice==1)
					{
						System.out.println("enter ISBN=");
						b.filter(sc.nextInt());
					}
					if(choice==6)
					b.filter(0);
					if(sc.nextInt()==1)
					{}
					else
					break;
				}
}
}