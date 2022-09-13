import java.util.Scanner;


class Q1{
    public static int power(int x, int y){
        int ans = 1;
        for(int i=1; i<=y; i++){
            ans *= x;
        }
        return ans;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(num, pow));
    }
}