import java.util.*;

interface OrderStudent {
    void OrderByRollno(ArrayList<Student> students);
    void OrderByName(ArrayList<students> students);
}

class Student implements OrderStudent{
    String name, address;
    int rollno;

    public int compareTo(Student s)
	{
		return this.name.compareTo(s.name);
	}

    void OrderByRollno(ArrayList<Student> students){}
    void OrderByName(ArrayList<Student> students){}
}

class comp implements Comparator<Student>
{
       
    public int compare(Student a, Student b)
    {
            return a.rollno-b.rollno;
    }
        
}

public class Q5
{
    public static void main(String [] args)
	{

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		ArrayList<Student> arr = new ArrayList<Student>(n); 
		for(int i=0;i<n;i++)
		{
			Student temp = new Student();
			String[] in = s.nextLine().split(" ");
			temp.name = in[0];
			temp.rollno = Integer.parseInt(in[1]);
			temp.address = in[2];

			arr.add(temp);
		}

		Collections.sort(arr);
		
		for(Student x : arr)
		{
			System.out.println(x.name+" "+x.rollno+" "+x.address);
		}
		System.out.print("\n");
		Collections.sort(arr, new comp());
		for(Student x : arr)
		{
			System.out.println(x.name+" "+x.rollno+" "+x.address);
		}

	}
  
}
