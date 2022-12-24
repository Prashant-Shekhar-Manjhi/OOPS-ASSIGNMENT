import java.util.*;
import java.io.*;

class Queue
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	void enqueue(int a)
	{
		this.list.add(a);
		System.out.println("Success");
	}
	void dequeue()
	{
		System.out.println(this.list.get(0));
		this.list.remove(0);
	}
}

public class Q6
{
	public static void main(String args[]) throws Exception  
	{
		Scanner s = new Scanner(System.in);
		Queue q = new Queue();
		boolean flag = true;
		while(flag)
		{
			char x = s.next().charAt(0);
			if(x == 'E')
			{
				q.enqueue(s.nextInt());
			}
			if(x == 'D')
			{
				try
				{
					q.dequeue();
				}
				catch(Exception e)
				{
					System.out.println("EmptyQueue");
					flag = false;
				}
			}
			String garbage = s.nextLine();
		}

	}
}

