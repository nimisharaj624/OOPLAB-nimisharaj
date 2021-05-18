import java.util.Scanner;

public class search 
{
public static void main(String[] args) 
{
int[] a=new int[100];
int i,n,s;
Scanner sc=new Scanner (System.in);
System.out.println("Enter number of elements:");
n=sc.nextInt();
System.out.println("Enter all the elements:");
for(i=1;i<=n;i++)
{
a[i]=sc.nextInt();			
}
System.out.println("Enter element to search:");
s=sc.nextInt();
for(i=1;i<=n;i++)
{
if(s==a[i])
{
System.out.println("Element found at "+i+" position");
break;
}
if(i==n)
System.out.println("Elemnt not found");
}
}
}

OUTPUT
Enter number of elements:
7
Enter all the elements:
2
4
1
6
7
8
9
Enter element to search:
6
Element found at 4 position


