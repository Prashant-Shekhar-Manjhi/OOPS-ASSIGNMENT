import java.util.*;
class Q1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String numberText = text;
        if(text.charAt(0) == '[')
            numberText = text.substring(1, text.length()-1);
       
        String[] numbers = numberText.split(",");
        int[] arr = new int[numbers.length];
        int i=0;
        HashSet<Integer> st = new HashSet<Integer>();
        for(String s : numbers){
            arr[i] = Integer.parseInt(s.trim());
            st.add(arr[i]);
        }
       
        System.out.println("The length of the original array is: "+arr.length);
        System.out.println("After removing duplicates, the new length of the array is: "+st.size());    
    }
} 