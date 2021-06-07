import java.util.*;
abstract class Publisher
{
static int pid;
static String name;

void Publisher()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Publisher id");
pid=sc.nextInt();
System.out.println("Enter the Publisher name");
name=sc.next();
}
}

class Book extends Publisher
{
String bname;
int bid;

void Book()
{
super.Publisher();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Book id");
bid=sc.nextInt();
System.out.println("Enter the Book name");
bname=sc.next();
}
}

class Literature extends Book
{
String chapter;
int chapnumber;

void Literature()
{
super.Book();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Chapter number");
chapnumber=sc.nextInt();
System.out.println("Enter the Chapter name");
chapter=sc.next();

}
}

class Fiction extends Literature
{
String topic;
Fiction()
{
super.Literature();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Topic");
topic=sc.next();
}
void display()
{

System.out.println("\nBook details are\n");
	System.out.print(pid);
	System.out.print("\t");
	System.out.print(name);
	System.out.print("\t");
	System.out.print(bid);
	System.out.print("\t");
	System.out.print(bname);
	System.out.print("\t");
	System.out.print(chapnumber);
	System.out.print("\t");
	System.out.print(chapter);
	System.out.print("\t");
	System.out.print(topic);
}
}

public class BookDetails
{

public static void main(String args[])
{
int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Fiction fn[]=new Fiction[n];
	  
	   	do
	{
		System.out.println("\nBook Details\n");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				fn[i]=new Fiction();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				fn[i].display();
				}		
		break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=4);
	}
		
}
	
	
/*
-----------------------------------------------------



Output


Enter the number of details to be entered: 3

Book Details

Menu
1.Insert
2.Display
3.Exit
Enter your choice:1

Enter the Publisher id: 100
Enter the Publisher name: Helen
Enter the Book id: 10
Enter the Book name: Python Programming
Enter the Chapter number: 12
Enter the Chapter name: Constructor
Enter the Topic: Constructor Overloading

Enter the Publisher id: 200
Enter the Publisher name: Adam
Enter the Book id: 20
Enter the Book name: C Programming
Enter the Chapter number: 26
Enter the Chapter name: Data Structure
Enter the Topic: Linked List

Enter the Publisher id: 300
Enter the Publisher name: Thomas
Enter the Book id: 30
Enter the Book name :Android Programming
Enter the Chapter number: 15
Enter the Chapter name: Installing Android Studio
Enter the Topic: Download Android Studio

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Book details are

300     Thomas  10      Python  12      Constructor     Constructor Overloading

Book details are

300     Thomas  20      C       26      Data Structure    Linked List

Book details are

300     Thomas  30      Android Programming 15      Installing Android Studio      Download Android Studio

*/


