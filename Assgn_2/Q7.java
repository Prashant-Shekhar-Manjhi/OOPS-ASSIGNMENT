import java.util.*;

class Student{
    public String rollNumber;
    public String fullName;
    public int height;
    public int weight;

    void readStudent(){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] details = text.split(",");
        rollNumber = details[0].trim();
        fullName = details[1].trim();
        String heightStr = details[2].trim();
        height = Integer.parseInt(heightStr.substring(0, heightStr.length()-2));

        String weightStr = details[3].trim();
        weight = Integer.parseInt(weightStr.substring(0, weightStr.length()-2));
    }

    void printStudentDetails(){
        System.out.println(rollNumber+", "+fullName+", "+height+"cm"+", "+weight+"Kg");
    }
}

class Q7{

    static void sortStudent(Student[] students){
        for(int i=1; i<students.length; i++){
            Student curObj = students[i];
            int j = i-1;
            while(j>=0 && students[j].height > curObj.height){
                students[j+1] = students[j];
                j--;
            }
            students[j+1] = curObj;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Student ");
        int numberOfStudents = sc.nextInt();

        System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");
        Student[] students = new Student[5];
        for(int i=0; i<5; i++){
            Student obj = new Student();
            obj.readStudent();
            students[i] = obj;
        }

        sortStudent(students);
        System.out.println();
        for(int i=0; i<5; i++){
            students[i].printStudentDetails();
        }
    }
}