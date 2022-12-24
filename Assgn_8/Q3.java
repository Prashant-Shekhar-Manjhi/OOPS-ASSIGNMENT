import java.util.*;
import java.io.*;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
public class Q3
{
	public static void main(String args[]) throws Exception  
	{
		Scanner s = new Scanner(System.in);
	
		int n = Integer.parseInt(s.nextLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		s.nextLine();
		String[] in = s.nextLine().split(" ");
		ArrayList<Integer> w = new ArrayList<Integer>();
		for(String str:in)
			w.add(Integer.parseInt(str));
		int sum=0;
		boolean flag = true;
		for(int x: w)
		{
			try
			{
				if(x>=n)
					throw new Exception();
				sum += arr[x];
			}
			catch(Exception e)
			{
				System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(sum);
	}
}

