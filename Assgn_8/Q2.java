import java.util.*;
import java.io.*;

public class Q2
{
	public static void main(String args[]) throws Exception  
	{
		Scanner s = new Scanner(System.in);

//		try
		
			File file = new File("./magic.txt");
	
/*		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
*/		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			String a = sc.nextLine();
			boolean flag = true;
			int i=0;
			int z;
	//		System.out.println("length o fline is"+a.length());
			while(i<a.length())
			{
				z=0;
				try
				{
					i++;
	//				System.out.print(a.substring(i-1,i)+"has been Tried---");
	//				if(a.charAt(i-1) == ' ')
	//					z = 0;
	//				else
						z = Integer.parseInt(a.substring(i-1,i));
				}
				catch(NumberFormatException e)
				{
					flag = false;
					System.out.println("OtherCharactersFound");
					break;
				}
			}
			if(flag)
			{
				System.out.println(a);
				
			}
		}
	}
}

