import java.util.*;

abstract class ThreeDObject{
	abstract double wholeSurfaceArea();
	abstract double volume();
}
class Box extends ThreeDObject{
	int l, b, h;
	public Box(int l, int b, int h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	double wholeSurfaceArea(){
		return 2*(l*b + b*h + h*l);
	}
	
	double volume(){
		return (l*b*h);
	}
}

class Cube extends ThreeDObject{
	int a;
	public Cube(int a){
		this.a = a;
	}
	
	double wholeSurfaceArea(){
		return (6*a*a);
	}
	
	double volume(){
		return a*a*a;
	}
}

class Cylinder extends ThreeDObject{
	int r;
	int h;
	public Cylinder(int r, int h){
		this.r = r;
		this.h = h;
	}
	
	double wholeSurfaceArea(){
		return 2 * 3.14159 * r *(r+h);
	}
	
	double volume(){
		return (3.14159 * r * r * h);
	}
}

class Cone extends ThreeDObject{
	int r;
	int h;
	
	public Cone(int r, int h){
		this.r = r;
		this.h = h;
	}
	
	double wholeSurfaceArea(){
		double l = Math.sqrt((r*r)+(h*h));
		return 3.14159 * r * (r + l);
	}
	
	double volume(){
		return (3.14159*r*r*h)/3;
	}
}

class Q2{
	public static void main(String args[]){
	
		Scanner sc  = new Scanner(System.in);
		Scanner strSc  = new Scanner(System.in);
		System.out.print("1. Box\n2. Cube\n3. Cylinder\n4. Cone\n5. Exit\n");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		ThreeDObject obj = null;
		while(true){
			if(choice == 1){
				System.out.print("Enter Length, Breadth and Height: ");	
				String input = strSc.nextLine();
				String[] inputArray = input.split(" ");
				
				int l = Integer.parseInt(inputArray[0]);
				int b = Integer.parseInt(inputArray[1]);
				int h = Integer.parseInt(inputArray[2]);
				
				obj = new Box(l, b, h);
				System.out.printf("volume = %d\n", (int)obj.volume());
				System.out.printf("Surface area = %d\n", (int)obj.wholeSurfaceArea());
					
			}
			else if(choice == 2){
				System.out.print("Enter Side: ");
				int a = sc.nextInt();
				
				obj = new Cube(a);
				System.out.printf("volume = %d\n", (int)obj.volume());
				System.out.printf("Surface area = %d\n", (int)obj.wholeSurfaceArea());	
			}
			else if(choice == 3){
				System.out.print("Enter radius and Height: ");	
				String input = strSc.nextLine();
				String[] inputArray = input.split(" ");
				
				int r = Integer.parseInt(inputArray[0]);
				int h = Integer.parseInt(inputArray[1]);
				
				obj = new Cylinder(r, h);
				System.out.printf("volume = %.2f\n", (float)obj.volume());
				System.out.printf("Surface area = %.2f\n", (float)obj.wholeSurfaceArea());	
				
			}
			else if(choice == 4){
				System.out.print("Enter radius and Height: ");	
				String input = strSc.nextLine();
				String[] inputArray = input.split(" ");
				
				int r = Integer.parseInt(inputArray[0]);
				int h = Integer.parseInt(inputArray[1]);
				
				obj = new Cone(r, h);
				System.out.printf("volume = %.2f\n", (float)obj.volume());
				System.out.printf("Surface area = %.2f\n", (float)obj.wholeSurfaceArea());	
			}
			else if(choice == 5){
				break;
			}
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
		}
	}
}

