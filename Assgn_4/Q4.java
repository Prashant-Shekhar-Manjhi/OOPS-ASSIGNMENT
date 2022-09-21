import java.util.*;
class TellphoneCall{
    String phNo;
    String custName;
    int callSlots;
    int totalBill;

    public void readCustomer(){
        Scanner sc = new Scanner(System.in);

        this.custName = sc.next();
        this.phNo = sc.next();
        this.callSlots = sc.nextInt();
    }

    public int computeBill(){
        if(callSlots<=100){
            totalBill = 500 + 300;
        }else if(callSlots > 100 && callSlots <= 200){
            totalBill = 300 + (callSlots*8);
        }else if(callSlots > 200 && callSlots <= 300){
            totalBill = 300 + (callSlots*10);
        }else{
            totalBill = 300 + (callSlots*15);
        }

        return totalBill;
    }
}

class Q4{
    public static void main(String [] args){
        TellphoneCall call = new TellphoneCall();
        call.readCustomer();
        System.out.println(call.computeBill());
    }
}