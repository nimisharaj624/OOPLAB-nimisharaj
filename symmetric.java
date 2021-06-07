import java.util.Scanner;
class Symmetric
{
int r,c;
int a[][]=new int[5][5];
void read(int r,int c)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=sc.nextInt();
}
void compare(int r,int c)
{
boolean flag = false;

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(a[i][j]==a[j][i])
{
	flag=true;
	break;
}
}
}
if(flag)
{
System.out.println("The given matrix is symmetric");
}
else
{
System.out.println("The given matrix is not symmetric");
	
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows and columns of matrix");
int r=sc.nextInt();
int c=sc.nextInt();
Symmetric s=new Symmetric();
s.read(r,c);
s.compare(r,c);	
}
}




--------------------------------


Output


Enter rows and columns of matrix
2 2
Enter the elements
1 2
2 1
The given matrix is symmetric
