import java.util.*;
class complex
{
double r,i;
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
complex c=new complex();
complex c1=new complex();
System.out.println("Complex number a:");
c.r=sc.nextDouble();
c.i=sc.nextDouble();
System.out.println("Complex number b:");
c1.r=sc.nextDouble();
c1.i=sc.nextDouble();
double smr=c1.r+c.r;
double smi=c1.i+c.i;
System.out.println("Sum:"+smr+"+"+smi+"i");
}
}

OUTPUT
Complex number a:
3.6
2.8
Complex number b:
3.7
7
Sum:7.300000000000001+9.8i
