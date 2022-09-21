import java.util.*;
abstract class Bank{
    abstract float getInterest(int amount);
}

class SBI extends Bank{
    float getInterest(int amount){
        return (amount * 5/100f);
    }
}

class ICICI extends Bank{
    float getInterest(int amount){
        return (amount * 6/100f);
    }
}

class AXIS extends Bank{
    float getInterest(int amount){
        return (amount * 7/100f);
    }
}
class Q2{
    public static void main(String []args){
        Bank bank;
        Scanner strSc = new Scanner(System.in);
        int amount = strSc.nextInt();

        // SBI
        bank = new SBI();
        System.out.println("SBI interest is : "+ Math.round(bank.getInterest(amount)));

        // ICICI
        bank = new ICICI();
        System.out.println("ICICI interest is : "+ Math.round(bank.getInterest(amount)));

        // SBI
        bank = new AXIS();
        System.out.println("AXIS interest is : "+ Math.round(bank.getInterest(amount)));

    }
}