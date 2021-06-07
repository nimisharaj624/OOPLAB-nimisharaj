import java.util.Scanner;
class OverloadDemo
{
	float l,b,a;
	double r;
	Scanner sc=new Scanner(System.in);
	
	 void readrect()
	{
		OverloadDemo od=new OverloadDemo();
		System.out.println("Enter the length and breadth of rectangle");
		l=sc.nextFloat();
		b=sc.nextFloat();	
		od.area(l,b);
	}
	
	void readsquare()
	{
		OverloadDemo od=new OverloadDemo();
		System.out.println("Enter the side of square");
		a=sc.nextFloat();
		od.area(a);
	}
	
	void readcircle()
	{
		OverloadDemo od=new OverloadDemo();
		System.out.println("Enter the radius of circle");
		r=sc.nextLong();
		od.area(r);
	}
	
    void area(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units\n");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units\n");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units\n");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
	    OverloadDemo ob = new OverloadDemo();

		ob.readrect();
		ob.readsquare();
		ob.readcircle();

	}
}







----------------------------------------


Output



Enter the length and breadth of rectangle
4 5
The area of the rectangle is 20.0 sq units

Enter the side of square
4
The area of the square is 16.0 sq units

Enter the radius of circle
2
the area of the circle is 12.56 sq units