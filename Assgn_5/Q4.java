import java.util.*;
class Customer{
    public String customerName;
    public String accNo;
    public long balance;

    public Customer(String name, String acc, long balance){
        customerName = name;
        accNo = acc;
        this.balance = balance;
    }

    public void availableBalance(){
        System.out.println(customerName+":"+balance);
    }
}

// Silver..
class Silver extends Customer{
    public int interest = 5;

    public Silver(String name, String acc, long balance){
        super(name, acc, balance);
    }

    public void availableBalance(){
        long predictedAmount = balance + ((balance * 5)/100);
        System.out.println(customerName+":"+balance+":"+"Silver:"+predictedAmount);
    }
}

// Gold...
class Gold extends Customer{
    public int interest = 10;

    public Gold(String name, String acc, long balance){
        super(name, acc, balance);
    }

    public void availableBalance(){
        long predictedAmount = balance + ((balance * 10)/100);
        System.out.println(customerName+":"+balance+":"+"Gold:"+predictedAmount);
    }
}

// Platinum..
class Platinum extends Customer{
    public int interest = 15;

    public Platinum(String name, String acc, long balance){
        super(name, acc, balance);
    }

    public void availableBalance(){
        long predictedAmount = balance + ((balance * 15)/100);
        System.out.println(customerName+":"+balance+":"+"Platinum:"+predictedAmount);
    }
}



class Q4{

    Customer[] customers;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Q4 obj = new Q4();
        obj.customers = new Customer[n];
        for(int i=0; i<n; i++){
            Scanner strSc = new Scanner(System.in);
            String input = strSc.nextLine();
            String[] inputArray = input.split(":");

            long balance = Integer.parseInt(inputArray[2].trim());
            Customer customer;
            if(balance <= 100000){
                customer = new Silver(inputArray[0], inputArray[1], balance);
            }
            else if(balance > 100000 && balance <= 1000000){
                customer = new Gold(inputArray[0], inputArray[1], balance);
            }else{
                customer = new Platinum(inputArray[0], inputArray[1], balance);
            }

            obj.customers[i] = customer;
        }

        System.out.println();
        for(int i=0; i<n; i++){
            obj.customers[i].availableBalance();
        }
    }
}