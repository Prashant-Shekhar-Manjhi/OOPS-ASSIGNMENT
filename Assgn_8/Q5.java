import java.util.*;
import java.io.*;

public class Q5
{
	public static void main(String args[]) throws Exception  
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		String garbage = s.nextLine();
		int n = Integer.parseInt(s.nextLine());
		boolean flag = true;
		for(int z =0;z<n;z++)
		{
			String move = s.next();
			int by = s.nextInt();
			garbage = s.nextLine();
		//	try
		//	{
				if(move.equals("Up"))
				{
					i-=by;
		//			if(i<1)
		//				throw new Exception();
				}
				else if(move.equals("Down"))
				{
					i+=by;
		//			if(i>8)
		//				throw new Exception();
				}
				else if(move.equals("Right"))
				{
					j+=by;
		//			if(j>8)
		//				throw new Exception();
				}
				else if(move.equals("Left"))
				{
					j-=by;
		//			if(j<1)
		//				throw new Exception();
				}
		//	}
			try
			{
				if(i>8 || i<1)
					throw new Exception();
				if(j>8 || j<1)
					throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("\nOverflow");
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("["+i+","+j+"]");
	}
}

