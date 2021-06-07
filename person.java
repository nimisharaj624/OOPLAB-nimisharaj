import java.util.Scanner;
class Person
{
	String name,gender,address;
	int age;
	Person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("NAME:");
		name=sc.next();
		System.out.println("Gender:");
		gender=sc.next();
		System.out.println("Address:");
		address=sc.next();
		System.out.println("Age:");
		age=sc.nextInt();
		
	}
	
}
class Employee extends Person
{
	int empid;
	String compname,quali;
	float salary;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ID:");
		empid=sc.nextInt();
		System.out.println("Company name:");
		compname=sc.next();
		System.out.println("Qualification:");
		quali=sc.next();
		System.out.println("Salary:");
		salary=sc.nextFloat();
		
	}
}

class Teacher extends Employee
{  String dept,sub;
	Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("DEPT:");
		dept=sc.next();
		System.out.println("SUB:");
		sub=sc.next();
	}
	void display()
	{System.out.println("\nDetails are\n");
	System.out.print(name);
	System.out.print(" ");
	System.out.print(gender);
	System.out.print(" ");
	System.out.print(age);
	System.out.print(" ");
	System.out.print(address);
	System.out.print(" ");
	System.out.print(empid);
	System.out.print(" ");
	System.out.print(compname);
	System.out.print(" ");
	System.out.print(quali);
	System.out.print(" ");
	System.out.print(salary);
	System.out.print(" ");
	System.out.print(dept);
	System.out.print(" ");
	System.out.print(sub);
	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("enter the number of teachers:");
		int n=sc.nextInt();
		Teacher t[]=new Teacher[n];
		do
		{
		System.out.print("\nMenu\n1.Insert\n2.Display\n");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	for(int i=0;i<n;i++)
				{
				t[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				t[i].display();
				}		
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=3);
	}

}


/*

-------------------------------------------



Output

enter the number of teachers:
2

Menu
1.Insert
2.Display
Enter your choice: 1
NAME: Veena
Gender: Female
Address: Ernakulam
Age: 25
ID: 100
Company name: Google
Qualification: MCA
Salary: 180000
DEPT: Electronics
SUB: Maths
NAME: Alex
Gender: Male
Address: Alappuzha 
Age: 30
ID: 200
Company name: Apple
Qualification: Btech
Salary: 200000
DEPT: Mech
SUB: Physics

Menu
1.Insert
2.Display
Enter your choice: 2


Veena Female Ernakulam 25 100  Google   MCA   180000.0  Developer  Maths


Alex Male Alappuzha 30 200  Apple   Btech   200000.0  Mech  Physics




*/