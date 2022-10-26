import java.util.*;
interface ShapeArea{
    void area(int arg);
}

class Circle implements ShapeArea{
    public void area(int arg){
        float area = 3.14F * arg * arg;
        System.out.println(Math.round(area));
    }
}

class Square implements ShapeArea{
    public void area(int arg){
        int area = arg * arg;
        System.out.println(area);
    }
}
class Q3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();

        int arg = scan.nextInt();
        ShapeArea obj = null;
        if(choice.compareTo("Circle") == 0){
            obj = new Circle();
            obj.area(arg);
        }
        else if(choice.compareTo("Square") == 0){
            obj = new Square();
            obj.area(arg);
        }
    }
}