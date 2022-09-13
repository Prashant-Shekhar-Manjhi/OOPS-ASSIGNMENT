import java.util.*;
class Q7{
    public static int fib(int i, int dp[]){
        if(i==0 || i==1) return i;

        if(dp[i] != -1) return dp[i];

        return fib(i-1, dp)+fib(i-2, dp);
    }

    public static void fibonacci(int n){

        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }

        for(int i=0; i<n; i++){
            System.out.print(fib(i, dp)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacci(n);
    }
}