import java.util.*;
class Point{
    public int abscissa;
    public int ordinate;

    public Point(int x, int y){
        abscissa = x;
        ordinate = y;
    }
}
class Q6{

    public static void midpoint(Point p1, Point p2){
        double x, y;
        x = (p1.abscissa + p2.abscissa)/2.0;
        y = (p1.ordinate + p2.ordinate)/2.0;

        System.out.printf("%.2f,%.2f", x, y);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            String str = sc.next();
            String [] strArray = str.split(",");
            Point p1 = new Point(Integer.parseInt(strArray[0]), Integer.parseInt(strArray[1]));

            String str1 = sc.next();
            String[] arr = str1.split(",");
            Point p2 = new Point(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            midpoint(p1, p2);

        }catch(Exception err){
            System.out.println("INVALID");
            return;
        }
    }
}