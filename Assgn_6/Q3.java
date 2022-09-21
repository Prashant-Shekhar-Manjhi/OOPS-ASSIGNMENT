import java.util.*;
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int getArea(){
        return (length*breadth);
    }

    public int getPerimeter(){
        return 2*(length+breadth);
    }
}

class Square extends Rectangle{
    public Square(int l){
        super(l, l);
    }
}
class Q3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");

        Rectangle obj;
        if(array.length == 1){
            obj = new Square(Integer.parseInt(array[0]));
            System.out.println("Square Perimeter "+obj.getPerimeter());
            System.out.println("Square Area "+obj.getArea());
            return;
        }

        obj = new Rectangle(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        System.out.println("Rectangle Perimeter "+obj.getPerimeter());
        System.out.println("Rectangle Area "+obj.getArea());
        return;
    }
}