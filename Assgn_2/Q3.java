import java.util.*;
class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
        for(int i=0; i<str.length(); i++){
            hs.add(str.charAt(i));
        }
        String temp = "";
        for(Character ch : hs){
            temp += ch;
        }
        str = temp;
        System.out.println(str);
    }
}