import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class File {

	public static void main(String[] args)
	{

		try {

			FileWriter fw = new FileWriter("file.txt");
			fw.write("Java is a  widely used object oriented programming language and software platforms.\n");
			fw.write(" The java software platform consists of the JVM,the java API,and a complete development environment.\n");
			fw.write("Java was developed by Sun Microsystems.\n");
			fw.write("James Gosling is known as the father of Java.");
			System.out.println("\nFile write done\n");
		        fw.close();
			FileReader fr = new FileReader("file.txt");
			String str = "";
                        int i;
			while ((i = fr.read()) != -1)
	    {
                      str += (char)i;
            }
            System.out.println(str);
			System.out.println("\nFile read done");
            fr.close();

		}

		catch (IOException e) {

			System.out.println
				("There are some IOException");
		}
	}
}