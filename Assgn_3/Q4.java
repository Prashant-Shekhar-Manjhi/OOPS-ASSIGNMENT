import java.util.*;
class Employee{
    int id;
    String name;
    String department;
    int salary;
    public Employee(int id, String name, String department, int salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class Manager extends Employee{
    int bonus;
    public Manager(int id, String name, String department, int salary, int bonus){
        super(id, name, department, salary);
        this.bonus = bonus;
    }
}
class Q4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.print("Input: ");
        int n = scanner.nextInt();
        Manager[] managers = new Manager[n];
        Manager maxSalaryManager = null;
        for(int i=0; i<n; i++){
            String details = stringScanner.nextLine();
            String detailsArray[] = details.split(" ");
            int id = Integer.parseInt(detailsArray[0]);
            String name = detailsArray[1];
            String department = detailsArray[2];
            int salary = Integer.parseInt(detailsArray[3]);
            int bonus = Integer.parseInt(detailsArray[4]);

            Manager manager = new Manager(id, name, department, salary, bonus);
            managers[i] = manager;

            if(i == 0){
                maxSalaryManager = manager;
            }else{
                if((manager.salary+manager.bonus)>(maxSalaryManager.salary+maxSalaryManager.bonus)){
                    maxSalaryManager = manager;
                }
            }
        }
        System.out.print("\nOutput: ");
        for(int i=0; i<n; i++){
            Manager manager = managers[i];
            if((manager.salary+manager.bonus) == (maxSalaryManager.salary+maxSalaryManager.bonus)){
                System.out.println(manager.id+" "+manager.name+" "+manager.department+" "+manager.salary+" "+manager.bonus);
            }
        }
    }
}