import java.util.*;
class Q6{

    public static boolean isPalindrom(int num){
        int temp = num;
        int num1 = 0;

        while(num>0){
            int rem = num % 10;
            num1 = num1*10 + rem;
            num = num/10;
        }
        num = temp;
        if(num == num1) return true;
        return false;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(isPalindrom(num));       
    }
}