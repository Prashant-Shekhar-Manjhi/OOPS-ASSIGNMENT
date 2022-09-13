import java.util.*;
class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                ans += ch;
            }
        }

        char[] arr = new char[ans.length()];
        arr = ans.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }
}