import java.util.*;

class Q4{
    public static int reverseNumber(int num){
        int ans = 0;
        while(num>0){
            int r = num%10;
            ans = ans*10 + r;
            num = num/10;
        }
        return ans;
    }

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverseNumber(num));
    }
}