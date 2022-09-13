package studentdataextended;
import studentdata.StudentData;
import java.util.*;

public class StudentDataExtended extends StudentData{

    private String location;
    public static StudentDataExtended[] students = new StudentDataExtended[190];
    public static int numberOfStudents = 0;
    
    public String getLocation(){
        return location;
    }

    public void setLocation(String loc){
        location = loc;
    }

    public void addDetails(){
        Scanner sc = new Scanner(System.in);
        Scanner strScan = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        numberOfStudents = sc.nextInt();

        for(int i=0; i<numberOfStudents; i++){
            System.out.println("\nEnter the details of Student "+(i+1)+" (id, name, location):");
            String details = strScan.nextLine();
            String[] detailsArray = details.split(" ");
            String id = detailsArray[0].trim();
            String name = detailsArray[1].trim();
            String location = detailsArray[2].trim();

            StudentDataExtended student = new StudentDataExtended();
            student.setId(id);
            student.setName(name);
            student.setLocation(location);
            students[i] = student;
        }
    }

    public void printDetails(){ 
        int size = numberOfStudents;
        sorting(students);
        System.out.println("\nThe Student Details are: ");
        for(int i=0; i<size; i++){
            System.out.println(students[i].getId()+" "+students[i].getName()+" "+students[i].getLocation());
        }
    }


    public static boolean compare(StudentDataExtended x, StudentDataExtended y){
        String xID = x.getId();
        String yID = y.getId();
        return (xID.compareTo(yID) > 0);
    }

    public static void sorting(StudentDataExtended [] students){
        for(int i=0; i<numberOfStudents; i++){
            StudentDataExtended curStudent = students[i];
            int j = i-1;
            while(j>=0 && compare(students[j], curStudent)){
                students[j+1] = students[j];
                j--;
            }
            students[j+1] = curStudent;
        }
    }
}
