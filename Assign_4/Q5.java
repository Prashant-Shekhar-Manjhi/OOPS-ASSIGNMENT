import java.util.*;
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int calculatePension(){
        int pension = 0;
        if(age >65 && age <= 70) pension = 500;
        else if(age > 70) pension = 600;
        return pension;
    }
}
class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        Person person = new Person(name, age);
        System.out.println(person.calculatePension());
    }
}