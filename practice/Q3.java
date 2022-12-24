import java.util.*;
class Department{
	private String deptName;
	private String deptHead;
	
	public void setDeptName(String name){
		deptName = name;
	}
	
	public void setDeptHead(String name){
		deptHead = name;
	}
	
	public String getDeptName(){
		return deptName;
	}
	
	public String getDeptHead(){
		return deptHead;
	}
}

class Hostel{
	private String hostelName;
	private String hostelLocation;
	private int numberOfRooms;
	
	public void setHostelName(String name){
		hostelName = name;
	}
	
	public void setHostelLocation(String location){
		hostelLocation = location;
	}
	
	public void setNumberOfRooms(int n){
		numberOfRooms = n;
	}
	
	public String getHostelName(){
		return hostelName;
	}
	
	public String getHostelLocation(){
		return hostelLocation;
	}
	
	public int getNumberOfRooms(){
		return numberOfRooms;
	}
}

class Students{
	Hostel hostel;
	Department department;
	
	String studentName;
	String registerNumber;
	String electiveSubject;
	int avgMarks;
	
	public Students(String name, String number, String elective, int marks, Hostel h, Department d){
		studentName = name;
		registerNumber = number;
		electiveSubject = elective;
		avgMarks = marks;
		hostel = h;
		department = d;
	}

	// public getStudent(){

	// }
	public void printStudent(){
		System.out.println(studentName+" "+registerNumber+" "+electiveSubject+" "+avgMarks+" "+department.getDeptName()+" "+hostel.getHostelName());
	}
	
}

class Q3{
	public static void main(String args[]){

		ArrayList<Students> students = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		Scanner strSc = new Scanner(System.in);
		System.out.println("1. Admit new Student\n2. Migrate Hostel\n3. Search a Student\n4. Exit");
		
		System.out.print("Enter your Choice: ");
		int choice = sc.nextInt();
		while(true){
			if(choice == 1){
				System.out.print("Enter the students details : ");
				String[] input = strSc.nextLine().split(" ");
				String name = input[0];
				String number = input[1];
				String elective = input[2];
				int avgMarks = Integer.parseInt(input[3]);

				System.out.print("Enter the department details : ");
				String[] input1 = strSc.nextLine().split(" ");
				String deptName = input1[0];
				String depHead = input[1];

				Department dep = new Department();
				dep.setDeptName(deptName);
				dep.setDeptHead(depHead);

				System.out.print("Enter the Hostel details : ");
				String[] input2 = strSc.nextLine().split(" ");
				String hostelName = input2[0];
				String hostelLocation = input2[1];
				int numberOfRooms = Integer.parseInt(input2[2]);

				Hostel hostel = new Hostel();
				hostel.setHostelName(hostelName);
				hostel.setHostelLocation(hostelLocation);
				hostel.setNumberOfRooms(numberOfRooms);
				
				Students student = new Students(name, number, elective, avgMarks, hostel, dep);
				students.add(student);

			}
			else if(choice == 2){
				System.out.print("Enter the student registration number and new hostel  : ");
				String[] input3 = strSc.nextLine().split(" ");
				for(int i=0; i<students.size(); i++){
					if(students.get(i).registerNumber.compareTo(input3[0]) == 0){
						Hostel h = students.get(i).hostel;
						Hostel h1 = new Hostel();
						h1.setHostelName(input3[1]);
						h1.setHostelLocation(h.getHostelLocation());
						h1.setNumberOfRooms(h.getNumberOfRooms());

						students.get(i).hostel = h1;
						break;
					}
				}
			}
			else if(choice == 3){
				System.out.print("Enter the registration number : ");
				String regNum = strSc.nextLine();
				for(int i=0; i<students.size(); i++){
					if(students.get(i).registerNumber.compareTo(regNum) == 0){
						students.get(i).printStudent();
						break;
					}
				}
			}
			else if(choice == 4){
				break;
			}

			System.out.print("Enter your Choice: ");
			choice = sc.nextInt();
		}
	}
}
