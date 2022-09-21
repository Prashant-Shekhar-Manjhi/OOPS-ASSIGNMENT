import java.util.*;
class Person{
    String personName;
    int age;
    public Person(String name, int age){
        this.personName = name;
        this.age = age;
    }
}

class Student extends Person{
    String rollNo;
    int percentageOfMarks;

    public Student(String name, int age, int p){
        super(name, age);
        this.percentageOfMarks = p;
    }
}

class PGStudent extends Student{
    String elective;
    int numberOfSubjects;

    public PGStudent(String name, int age, String elective, int p){
        super(name, age, p);
        this.elective = elective;
    }
}
class Q7{

    static void sorting(Student[] students){
        int n = students.length;
        for(int i=1; i<n; i++){
            Student temp = students[i];
            int j=i-1;
            while(j>=0 && students[j].percentageOfMarks < temp.percentageOfMarks){
                students[j+1] = students[j];
                j--;
            }

            students[j+1] = temp;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            Scanner strSc = new Scanner(System.in);
            String input = strSc.nextLine();
            String[] inputArray = input.split(":");

            students[i] = new PGStudent(inputArray[0], Integer.parseInt(inputArray[1]), inputArray[2], Integer.parseInt(inputArray[3]));
        }

        sorting(students);

        System.out.println();
        for(int i=0; i<n; i++){
            System.out.println(students[i].personName);
        }
    }
}