import java.util.*;

class Q2{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        // swapping..
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}