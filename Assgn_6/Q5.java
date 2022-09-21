import java.util.*;
abstract class Student{
    String name;
    String roll;
    String degree;
    abstract void getFeeDetails();
    void setFeeDetails(String name, String roll, String degree){
        this.name = name;
        this.roll = roll;
        this.degree = degree;
    }
}

class Undergraduate extends Student{
    int fee;
    public Undergraduate(int fee){
        this.fee = fee;
    }
    void getFeeDetails(){
        System.out.println(fee);
    }
}

class Postgraduate extends Student{
    int fee;
    public Postgraduate(int fee){
        this.fee = fee;
    }
    void getFeeDetails(){
        System.out.println(fee);
    }
}
class Q5{
    Student[] students;
    public Q5(int n){
        students = new Student[n];
    }

    public static void main(String []args){
        Scanner strSc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String fees = strSc.nextLine();
        String[] feesArr = fees.split(" ");

        int n = sc.nextInt();
        Q5 obj = new Q5(n);
        int ug = Integer.parseInt(feesArr[0]);
        int pg = Integer.parseInt(feesArr[1]);

        Student student;
        for(int i=0; i<n; i++){
            String input = strSc.nextLine();
            String[] array = input.split(" ");

            if(array[2].compareTo("UG") == 0){
                student = new Undergraduate(ug);
            }else{
                student = new Postgraduate(pg);
            }

            student.setFeeDetails(array[0], array[1], array[2]);
            obj.students[i] = student;
        }

        String key = strSc.nextLine();
        for(int i=0; i<n; i++){
            if(obj.students[i].roll.compareTo(key) == 0){
                obj.students[i].getFeeDetails();
                return;
            }
        }
    }
}