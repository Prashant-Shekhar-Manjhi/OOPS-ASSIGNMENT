import java.util.*;
class Q1{
    int bitwiseAnd(int a, int b){
        return (a&b);
    }

    int bitwiseAnd(int a, int b, int c){
        int temp = (a&b);
        return (temp&c);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");

        int n = inputArray.length;
        int[] nums = new int[n];
        for(int i=0; i<n; i++){ 
            nums[i] = Integer.parseInt(inputArray[i].trim());
        }

        Q1 object = new Q1();
        if(n == 2){
            System.out.println(object.bitwiseAnd(nums[0], nums[1]));
        }else if(n == 3){
            System.out.println(object.bitwiseAnd(nums[0], nums[1], nums[2]));
        }
    }
}