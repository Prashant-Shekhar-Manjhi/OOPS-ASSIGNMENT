import java.util.*;

class Q3{
    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] arg){
       
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(countDigit(num));
    }
}