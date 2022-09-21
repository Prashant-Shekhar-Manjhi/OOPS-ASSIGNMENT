import java.util.*;
import java.lang.Math;
class Q2{ 

    void area(int r){
        double areaOfCircle = (3.14) * r * r;
        System.out.printf("Circle:%.2f\n", areaOfCircle);
    }
    void area(int l, int b){
        double areaOfReactangle = l * b;
        System.out.printf("Rectangle:%.2f\n", areaOfReactangle);
    }
    void area(int a, int b, int c){
        double s = (a + b + c)/2.0;
        double temp = s * (s-a) * (s-b) * (s-c);
        double areaOfTriangle = Math.sqrt(temp);
        System.out.printf("Triangle:%.2f\n", areaOfTriangle);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");

        int n = array.length;
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(array[i].trim());
        }

        Q2 obj = new Q2();

        if(n == 1){
            obj.area(nums[0]);
        }
        else if(n == 2){
            obj.area(nums[0], nums[1]);
        }
        else if(n == 3){
            obj.area(nums[0], nums[1], nums[2]);
        }
    }
}