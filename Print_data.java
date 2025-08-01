package files;
// 4. Print_data
import java.io.File;
import java.util.Scanner;

public class Print_data {
	
	Scanner s = new Scanner(System.in);
	//File f;
	
	
	public void get_open_file()
	{
		try {
	//	f = 	new File("C:\\altek4\\z.txt");
			
		s =	new Scanner ( new File("C:\\altek4\\z.txt") );
			System.out.println("file  opened..");
		}
		catch(Exception e)
		{
			 e.printStackTrace();
			System.out.println("Error: hai..u got an error");
		}
	}
	
	
	public void print_data()
	{
		while(s.hasNext()  ) // checks for Data in row presence
		{
			String a = s.next(); // it cuts one string
			String b = s.next();
			String c = s.next();
			
			System.out.printf(" %s ..%s.. %s \n" , a,b,c);
		}
		
	} 

	
	public void close_file()
	{
		s.close();
		System.out.println(" \n file closed..");
	}

	
	
	
	


}
