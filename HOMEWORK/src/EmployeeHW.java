import java.util.Scanner;



class Employee
{
	int id;
	String name,desg;
	float BS,HRA,TA,DA,PF,GSM,GSA;
	void inputEmployeeDetails()
	{
		Scanner sc =new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Employee id=");
		id = sc.nextInt();
		System.out.println("Enter Employee name=");
		name = sc1.nextLine();
		System.out.println("Enter Employee desg=");
		desg = sc1.nextLine();
		System.out.println("Enter Employee BS=");
		BS = sc.nextFloat();
	}
	void calculateSalary()
	{   HRA = 8;
	    TA=6;
	    DA=4;
	    PF=7;
		for (int i=0;(i<=BS/10000)&&(i<4);i++)
		{
			HRA=HRA+2;
			TA=TA+2;
			DA=DA+2;
			PF=PF+2;
	    }
		HRA=BS*HRA/100;
		TA=BS*TA/100;
		DA=BS*DA/100;
		PF=BS*PF/100;
		
		GSM=BS+HRA+TA+DA-PF;
		GSA=GSM*12;
	}
	void printEmployeeDetails()
	{
		System.out.println("Employee id="+id);
		System.out.println("Employee name="+name);
		System.out.println("Employee desg="+desg);
		System.out.println("Employee BS="+BS);
		System.out.println("Employee HRA="+HRA);
		System.out.println("Employee DA="+DA);
		System.out.println("Employee PF="+PF);
		System.out.println("Employee TA="+TA);
		System.out.println("Employee GSM="+GSM);
		System.out.println("Employee GSA="+GSA);
	}
}
public class EmployeeHW 
{
public static void main(String[] args) {
	Employee e = new Employee();
	e.inputEmployeeDetails();
	e.calculateSalary();
	e.printEmployeeDetails();
}
}
