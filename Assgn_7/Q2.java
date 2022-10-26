import java.util.*;
interface HDFC{
    int transaction(int balance, int proPrice);
}
interface ICICI{
    int transaction(int balance, int proPrice);
}

class Flipkart implements HDFC, ICICI{
    public int transaction(int balance, int proPrice){
        return (balance-proPrice);
    }
}
class Q2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numberOfTran = scan.nextInt();
        scan.nextLine();
        int amtAdded = 0;
        for(int i=0; i<numberOfTran; i++){
            String[] input = scan.nextLine().split(" ");
            Flipkart obj = new Flipkart();
            int remBalance =  obj.transaction(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            amtAdded += Integer.parseInt(input[2]);
            System.out.println(amtAdded+" "+remBalance);
        }

    }
}