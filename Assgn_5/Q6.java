import java.util.*;
class Employee{
    int employeeId;
    String employeeName;
    int salary;

    public Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void calculateSalary(){}
}

class PermanentEmployee extends Employee{
    int basicPay;
    int PF_amount;

    public PermanentEmployee(int employeeId, String employeeName, int basicPay){
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.calculateSalary();
    }

    public void calculateSalary(){
        PF_amount = (basicPay * 12)/100;
        this.salary = (basicPay - PF_amount);
    }
}

class TemporaryEmployee extends Employee{
    int hoursWorked;
    int hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages){
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
        this.calculateSalary();
    }

    public void calculateSalary(){
        this.salary = (hourlyWages * hoursWorked);
    }
}
class Q6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];
        for(int i=0; i<n; i++){
            Scanner strSc = new Scanner(System.in);
            String input = strSc.nextLine();

            String[] inputArray = input.split(" ");
            int type = Integer.parseInt(inputArray[0]);

            if(type == 1){
                // PermanentEmployee..
                employees[i] = new PermanentEmployee(Integer.parseInt(inputArray[1]), inputArray[2], Integer.parseInt(inputArray[3]));
            }else if(type == 2){
                employees[i] = new TemporaryEmployee(Integer.parseInt(inputArray[1]), inputArray[2], Integer.parseInt(inputArray[3]), Integer.parseInt(inputArray[4]));
            }
        }

        int id = sc.nextInt();
        for(int i=0; i<n; i++){
            if(id == employees[i].employeeId){
                System.out.println(employees[i].employeeId+" "+employees[i].employeeName+" "+employees[i].salary);
                return;
            }
        }

        System.out.println("-1");
    }
}