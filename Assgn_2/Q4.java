import java.util.*;
class Q4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int MaxPal = 0;
        int n = str.length();
        int[][] dp = new int[n][n];
        for(int g=0; g<str.length(); g++){
            for(int i=0, j=g; j<str.length(); i++, j++){
                if(g==0){
                    dp[i][j] = 1;
                }else if(g==1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = 1;
                    }
                    else dp[i][j] = 0;
                }else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = dp[i+1][j-1];
                    }else dp[i][j] = 0;
                }

                if(dp[i][j] == 1){
                   MaxPal = Math.max(MaxPal, j-i+1);
                }
            }
        }

        System.out.println(MaxPal);
    }
}