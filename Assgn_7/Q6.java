import java.util.*;
interface Borrowable
{
	void checkIn();
	void checkOut();
}
class Book implements Borrowable
{
	int bookId;
	String title,author;
	public void checkIn()
	{
		System.out.println("done");
	}
	public void checkOut()
	{
		System.out.println("done");
	}	
	void display()
	{
		System.out.println("Book:"+this.bookId+":"+this.title+":"+this.author+":");
	}
}

class Blist
{
	boolean isRef;
	int id;
}

class ReferenceBooks extends Book 
{
	public void checkIn()
	{
		System.out.println("Invalid");
	}
	public void checkOut()
	{
		System.out.println("Cannot be borrowed");
	}
	void display()
	{
		System.out.println("ReferenceBook : "+this.bookId+" : "+this.title+" : "+this.author);
	}
}

class TextBooks extends Book
{
	String status, borrowedUser;
	TextBooks()
	{
		this.status = "Available";
	}
	public void checkIn()
	{
		this.status = "Available";
	}
	public void checkOut()
	{
		Scanner s = new Scanner(System.in);
		if(this.status.equals("Available"))
		{
			System.out.print("Enter Username: ");
			this.borrowedUser = s.nextLine();
			this.status = "Borrowed";
		}
		else
			System.out.println("Already borrowed by "+this.borrowedUser);
	}
	void display()
	{
		if(this.status.equals("Borrowed"))
			System.out.println("TextBook : "+this.bookId+" : "+this.title+" : "+this.author+" : Borrowed by "+this.borrowedUser);
		else
			System.out.println("TextBook : "+this.bookId+" : "+this.title+" : "+this.author+" : "+this.status);
	}
}


public class Q6
{
    public static void main(String [] args)
	{

		Scanner s = new Scanner(System.in);
		ArrayList<Blist> list = new ArrayList<Blist>();
		ArrayList<TextBooks> tlist = new ArrayList<TextBooks>();
		ArrayList<ReferenceBooks> rlist = new ArrayList<ReferenceBooks>();
		
		System.out.println("1. Add Reference Book\n2. Add Text Book\n3. Check-Out\n4. Check-In\n5. List Books\n6. Exit");
		int x = 9;
		while(x != 6)
		{
			System.out.print("\nEnter your choice: ");
			x = Integer.parseInt(s.nextLine());
			if(x == 1)
			{
				ReferenceBooks temp = new ReferenceBooks();
				Blist foo = new Blist();
				System.out.println("Enter ID,Title and Author (Line by line)");
				temp.bookId = Integer.parseInt(s.nextLine());
				temp.title = s.nextLine();
				temp.author = s.nextLine();
				foo.id = temp.bookId;
				foo.isRef = true;

				list.add(foo);
				rlist.add(temp);
			}
			if(x == 2)
			{
				TextBooks tem = new TextBooks();
				Blist fo = new Blist();
				System.out.println("Enter ID,Title and Author (Line by line)");
				tem.bookId = Integer.parseInt(s.nextLine());
				tem.title = s.nextLine();
				tem.author = s.nextLine();
				fo.id = tem.bookId;
				fo.isRef = false;
				
				tlist.add(tem);
				list.add(fo);
			}
			if(x == 3)
			{
				System.out.print("Enter book ID: ");
				int q = Integer.parseInt(s.nextLine());

				for(Blist h : list)
				{
					if(h.isRef)
					{
						for(ReferenceBooks r : rlist)
                		{
                			if(q == r.bookId)
                		    {
               					r.checkOut();
		     					break;
             				}
              		    	else
              		    	  	continue;
              	  		}
              	  	}
              	  	else
              	  	{
                		for(TextBooks t : tlist)
	            		{
                			if(q == t.bookId)
               	    	 	{
               	    	 		t.checkOut();
               	    	 	    break;
                    		}
                    		else
                    			continue;
                 		}
                 	}
                 }
			}
			if(x == 4)
			{
				System.out.print("Enter Book ID: ");
				int q = Integer.parseInt(s.nextLine());

				for(Blist h : list)
				{
                	if(h.isRef)
                	{
                		for(ReferenceBooks r : rlist)
                		{
                			if(q == r.bookId)
                		    {
                		    	r.checkIn();
                		        break;
                		    }
                		    else
                		    	continue;
                		}
                	}
                	else
               		{
                		for(TextBooks t : tlist)
                		{	
                			if(q == t.bookId)
                	    	{
                	    		t.checkIn();
                	    	    break;
                	    	}
             	   	    	else
             	   	    		continue;
             	  		}
             	  	}
               	}

			}
			if(x == 5)
			{
				for(Blist h : list)
				{
					if(h.isRef)
					{
						for(ReferenceBooks r : rlist)
						{
							if(h.id == r.bookId)
							{
								r.display();
								break;
							}
							else
								continue;
						}
					}
					else
					{
						for(TextBooks t : tlist)
						{
							if(h.id == t.bookId)
							{
								t.display();
								break;
							}
							else
								continue;
						}
					}
				}
			}
		}


	}
  
}
