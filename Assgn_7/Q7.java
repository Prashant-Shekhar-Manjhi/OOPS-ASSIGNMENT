import java.util.*; 
interface TaxCalculatable
{
	void calculateTax();
}
class Vehicle implements TaxCalculatable, Comparable<Vehicle>
{
	int rateBought, numberOfWheels, tax;
	String modelNumber, fuelType;
	public int compareTo(Vehicle a)
	{
		return a.tax - this.tax;
	}
	void display()
	{
		System.out.println(this.modelNumber+" "+this.fuelType+" "+this.rateBought);
	}
}

class Car extends Vehicle 
{
	int numberOfPassengers;
	public void calculateTax()
	{
		double x;
		if(this.fuelType.equals("petrol"))
			x = 0.5;
		else
			x = 0.4;
		double temp = x*this.rateBought*this.numberOfPassengers/10;
		this.tax = (int)temp;
	}
}

class Truck extends Vehicle
{
	int loadLimit;
	
	public void calculateTax()
	{
		double x;
		if(this.fuelType.equals("petrol"))
			x = 0.5;
		else
			x = 0.4;
		double temp = x*this.rateBought*this.loadLimit*2/10000;
		this.tax = (int)temp;
	}
}


public class Q7
{
    public static void main(String [] args)
	{

		Scanner s = new Scanner(System.in);

		ArrayList<Truck> tlist = new ArrayList<Truck>();
		ArrayList<Car> clist = new ArrayList<Car>();
		
		System.out.println("1. Add Vehicle\n2. Display Vehicles\n3. Exit\n");
		int x = 9;
		while(x != 3)
		{
			System.out.print("Enter your choice: ");
			x = Integer.parseInt(s.nextLine());
			if(x == 1)
			{
				System.out.print("a.Car\nb.Truck\nEnter your choice:");
				char y = s.nextLine().charAt(0);
				if(y == 'a')
				{
					Car c = new Car();
					System.out.print("ModelNumber:");
					c.modelNumber = s.nextLine();
					System.out.print("Rate:");
					c.rateBought = Integer.parseInt(s.nextLine());
					System.out.print("FuelType(petrol/diesel):");
					c.fuelType = s.nextLine();
					System.out.print("Passengers:");
					c.numberOfPassengers = Integer.parseInt(s.nextLine());
					c.calculateTax();
					clist.add(c);
				}
			
				if(y == 'b')
				{
					Truck t = new Truck();
					System.out.print("ModelNumber:");
					t.modelNumber = s.nextLine();
					System.out.print("Rate:");
					t.rateBought = Integer.parseInt(s.nextLine());
					System.out.print("FuelType(petrol/diesel):");
					t.fuelType = s.nextLine();
					System.out.print("Loadlimit:");
					t.loadLimit = Integer.parseInt(s.nextLine());
					t.calculateTax();
					tlist.add(t);
					
				}
			}
			if(x == 2)
			{
				ArrayList<Vehicle> v = new ArrayList<Vehicle>();
				for(Car c: clist)
				{
					Vehicle temp = new Vehicle();
					temp.modelNumber = c.modelNumber;
					temp.tax = c.tax;
					temp.rateBought = c.rateBought;
					temp.fuelType = c.fuelType;
					v.add(temp);
				}
				for(Truck c : tlist)
				{
					Vehicle temp = new Vehicle();
					temp.modelNumber = c.modelNumber;
					temp.tax = c.tax;
					temp.rateBought = c.rateBought;
					temp.fuelType = c.fuelType;
					v.add(temp);
				}
				Collections.sort(v);
				for(Vehicle z : v)
					z.display();
			}
            System.out.println("\n1. Add Vehicle\n2. Display Vehicles\n3. Exit\n");
		}


	}
  
}
