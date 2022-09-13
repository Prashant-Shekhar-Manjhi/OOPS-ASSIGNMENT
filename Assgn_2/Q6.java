import java.util.*;
class Student{
    private String name;
    private String rollNumber;
    private float cgpa;
    private float percentage;

    public Student(String name, String rollNumber, float cgpa){
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        percentage = 9.5F * cgpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }

    public float getCGPA(){
        return cgpa;
    }

    public void setCGPA(float cgpa){
        this.cgpa = cgpa;
        percentage = 9.5F * cgpa;
    }

    public float getPercentage(){
        return percentage;
    }
}

class Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudent = sc.nextInt();

        Student[] array = new Student[numberOfStudent];
        System.out.println("Enter Student Details");
        for(int i=0; i<numberOfStudent; i++){
            String name = sc.next();
            String roll = sc.next();
            float cgpa = sc.nextFloat();
            
            Student ob = new Student(name, roll, cgpa);
            array[i] = ob;
        }

        System.out.println();
        for(int i=0; i<numberOfStudent; i++){
            System.out.println(array[i].getName()+" "+array[i].getRollNumber()+" "+array[i].getCGPA()+" "+array[i].getPercentage()+"%");
        }
    }
}