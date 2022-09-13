import java.util.*;
class Q5{
    public static void main(String args[]){
        String[] arr = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inmate details: ");
        for(int i=0; i<3; i++){
            arr[i] = sc.next();
        }
        
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        int total = 0;
        if(arr[1].equals("student")){
            if(arr[2].equals("veg")){
                total = 100 * days;
            }else total = 120 * days;
        }else if(arr[1].equals("employee")){
            if(arr[2].equals("veg")){
                total = (100*days) + (100*days*5/100);
            }else total = (120*days) + (120*days*5/100);
        }

        System.out.println(total);
    }
}