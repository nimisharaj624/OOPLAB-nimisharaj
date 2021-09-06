import java.util.*;
interface Student
 {
    Scanner sc = new Scanner(System.in);
    int roll = 1;
    String name="Nimisha",course="MCA";

}
class Sports
{
    Scanner sc = new Scanner(System.in);
    int mark;
    void read()
    {
        System.out.println("Enter mark:");
        mark=sc.nextInt();
    }
}

class Result extends Sports implements Student
{
    void displ()
    {
        System.out.println("Details of student:");
		 System.out.println("Roll number:"+roll);
        System.out.println("Name:"+name);
        System.out.println("Class Name:"+course);
        System.out.println("Academic Mark:"+mark);
    }
}
class studentsports
 {
    public static void main(String args[])
    {
        Result res = new Result();
        res.read();
        res.displ();
    }
}

/*

---------------------------------------------------------



Output

Enter mark: 50

Details of student:

Roll number:1
Name: Nimisha
Class Name: MCA
Academic Mark: 50


*/
