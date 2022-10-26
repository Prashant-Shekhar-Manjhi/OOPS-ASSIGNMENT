import java.util.*;

interface SortVotes
{
	void ascendDisplay(ArrayList<String> a,ArrayList<String> b);
	void descendDisplay(ArrayList<String> a,ArrayList<String> b);
}

class Display implements SortVotes
{
	public void display(ArrayList<String> a)
	{
		for(String s : a)
			System.out.println(s);
	}
	public void ascendDisplay(ArrayList<String> a,ArrayList<String> b)
	{
		ArrayList<Data> data = new ArrayList<Data>();
		for(String str : b)
		{
			Data temp = new Data();
			temp.name = str;
			data.add(temp);
		}
		for(String str : a)
		{
			for(Data x : data)
			{
				if(x.name.equals(str))
				{
					x.votes++;
					break;
				}
			}
		}
		Collections.sort(data);
		for(Data x : data)
		{
			System.out.println(x.name+" - "+x.votes);
		}
	}
	public void descendDisplay(ArrayList<String> a,ArrayList<String> b)
	{
		ArrayList<Data> data = new ArrayList<Data>();
		for(String str : b)
		{
			Data temp = new Data();
			temp.name = str;
			data.add(temp);
		}
		for(String str : a)
		{
			for(Data x : data)
			{
				if(x.name.equals(str))
				{
					x.votes++;
					break;
				}
			}
		}
		Collections.sort(data, Collections.reverseOrder());
	
		for(Data x : data)
		{
			System.out.println(x.name+" - "+x.votes);
		}
	}


}

class Data implements Comparable<Data>
{
	String name;
	int votes;
	public int compareTo(Data a)
	{
		return this.votes - a.votes;
	}
}

class ElectionPost
{
	String post;
	ArrayList<String> listOfCandidates = new ArrayList<String>();
	ArrayList<String> votesEntered = new ArrayList<String>();
}

public class Q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		ElectionPost p = new ElectionPost();
		p.post = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			p.listOfCandidates.add(sc.nextLine());
		}
		int tv =Integer.parseInt(sc.nextLine());
		for(int i=0;i<tv;i++)
		{
			p.votesEntered.add(sc.nextLine());
		}


		System.out.println(p.post);
		Display d = new Display();
		d.display(p.listOfCandidates);
		d.ascendDisplay(p.votesEntered, p.listOfCandidates);
		d.descendDisplay(p.votesEntered, p.listOfCandidates);
	}
}

