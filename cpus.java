class CPU {
int price;
CPU(int price)
		  {
			this.price=price;
          }
    class  Processor{
        Processor(String proce,double core,String manufcturer)
        {
			System.out.println("Price:"+price);
			System.out.println("Manufacturer:"+manufcturer);
			System.out.println("Processor:"+proce);
            System.out.println("Cores"+core);
           
        }
    }
    static class RAM{
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"GB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
public class cpus
{
    public static void main(String args[])
    {
		CPU c=new CPU(30000);
        CPU.Processor pr=c.new Processor("i3 2nd gen",4,"Intel");
        new CPU.RAM(4,"Corsair");

    }
}