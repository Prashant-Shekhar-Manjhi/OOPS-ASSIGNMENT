import java.util.*;
class Q1{
    void display(char ch, int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void display(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    void display(int a, int b){
        int ans = 0;
        ans = (a*a) + (b*b);
        System.out.println(ans);
    }
    public static void main(String []args){
        Q1 obj = new Q1();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");

        if(inputArr.length==1){
            obj.display(Integer.parseInt(inputArr[0]));
            return;
        }

        char ch = inputArr[0].charAt(0);
        if(ch>='a' && ch<='z'){
            obj.display(ch, Integer.parseInt(inputArr[1]));
            return;
        }

        obj.display(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
    }
}