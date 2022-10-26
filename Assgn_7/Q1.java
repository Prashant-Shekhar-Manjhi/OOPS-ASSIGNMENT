import java.util.*;
interface BankInterface{
    int convertRupees(int rupees);
    int convertDollars(int dollars);
    int convertPounds(int pounds);
}

class Bank implements BankInterface{
    public int convertRupees(int rupees){
        return rupees;
    }

    public int convertDollars(int dollars){
        return (dollars*70);
    }

    public int convertPounds(int pounds){
        return (pounds*100);
    }
}
class Q1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        scan.nextLine();

        String[] input = scan.nextLine().split(" ");

        BankInterface obj = new Bank();
        int spent = obj.convertRupees(Integer.parseInt(input[0]))+obj.convertDollars(Integer.parseInt(input[1]))+obj.convertPounds(Integer.parseInt(input[2]));
        if(spent > balance){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println(balance-spent);
        }
    }
}