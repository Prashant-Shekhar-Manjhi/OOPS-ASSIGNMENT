import java.util.*;
class Q2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String sen_input = sc.nextLine();
        String sen = sen_input.trim();
        String Arr[] = sen.split(" ");

        System.out.println("Words count is "+Arr.length);
        for(int i=0; i<sen.length(); i++){
            char ch = sen.charAt(i);
            int ascii = sen.charAt(i);
            System.out.println("\'"+ch+"\'"+" "+ascii);
        }
    }
}