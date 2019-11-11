import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) 
	{
	 	try{
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection co = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/mydb", "root", "root");

			Statement st = co.createStatement();
			
			
			st.executeUpdate("insert into wastemanagementsystem values('shivam1','shivam','shivam','shivam')");
			
			System.out.println("hello");
			co.close();
		}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}  
	}
}
