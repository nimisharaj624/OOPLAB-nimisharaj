import java.lang.String;
import java.util.Scanner;
class Employee
{
	int empid;
	String name,address;
	float salary;
	Employee()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid name address salary");
		this.empid=sc.nextInt();
		this.name=sc.next();
		this.address=sc.next();
		this.salary=sc.nextFloat();
	}
}
class Teacher extends Employee
{
	String dept,subject;
	Teacher()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("dept subject");
		this.dept=sc.next();
		this.subject=sc.next();
	}
	void display()
{
		
	System.out.println("\nEmployee details are\n");
	System.out.print(empid);
	System.out.print(" ");
	System.out.print(name);
	System.out.print(" ");
	System.out.print(address);
	System.out.print(" ");
	System.out.print(salary);
	System.out.print(" ");
	System.out.print(dept);
	System.out.print(" ");
	System.out.print(subject);

	}
	public static void main(String ab[])
{
		int x,choice;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no of Employees you want to enter");
		x=sc.nextInt();
		Teacher b[]=new Teacher[x];
		do
		{
		System.out.print("\nMenu\n1.Insert\n2.Display\n");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	for(int i=0;i<x;i++)
				{
				b[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<x;i++)
				{
				b[i].display();
				}		
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=3);
	}
}




/*---------------------------------------



Output


Enter the no of Employees you want to enter: 2

Menu
1.Insert
2.Display
Enter your choice: 1

Enter empid name address salary: 100 Smitha Thrissur 45000

dept subject: MCA Maths

Enter empid name address salary: 101 Diya Calicut 50000

dept subject: Btech Physics

Menu
1.Insert
2.Display
Enter your choice: 2

Employee details are

100 Smitha Thrissur 45000.0 MCA Maths

Employee details are

101 Diya Calicut 50000.0 Btech Physics

*/