import java.util.*;
class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");

        int[] nums = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            nums[i] = Integer.parseInt(arr[i].trim());
        }

        Set<Integer> hash = new HashSet<Integer>();
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            hash.add(nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(hash.contains(sum)){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }    
}