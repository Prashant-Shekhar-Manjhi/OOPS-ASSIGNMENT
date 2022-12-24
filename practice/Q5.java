import java.util.*;
class Customer{
    String name;
    String mobile;
    Membership memberShip;
    public Customer(String name, String mobile, Membership memberShip){
        this.name = name;
        this.mobile = mobile;
        this.memberShip = memberShip;
    }
}

class Service{
    String name;
    int price;
    public Service(String name, int price){
        this.name = name;
        this.price = price;
    }
}


class Membership{
    int discount;
    String name;
    public Membership(int dis, String name){
        discount = dis;
        this.name = name;
    }
}

class Premium extends Membership{
    public Premium(){
        super(20, "Premium");
    }
}

class Gold extends Membership{
    public Gold(){
        super(15,"Gold");
    }
}

class Silver extends Membership{
    public Silver(){
        super(10, "Silver");
    }
}
class Q6{
    static ArrayList<Service> list = new ArrayList<>();
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Scanner strSc = new Scanner(System.in);
        System.out.println("Enter Customer Details:");

        System.out.print("Name:");
        String name = strSc.nextLine();

        System.out.print("Mobile:");
        String mobile = strSc.nextLine();

        System.out.print("Membership:");
        String memberShip = strSc.nextLine();

        Membership member = null;      
        if(memberShip.compareTo("Premium")==0){
            member = new Premium();
        }
        else if(memberShip.compareTo("Gold")==0){
            member = new Gold();
        }
        else if(memberShip.compareTo("Silver")==0){
            member = new Silver();
        }

        Customer customer = new Customer(name, mobile, member);

        System.out.print("Add Services(Y/N): ");
        String choice = strSc.nextLine();
        while(true){
            if(choice.compareTo("Y") == 0){
                System.out.print("ServiceName:");
                String serviceName = strSc.nextLine();

                System.out.print("Rate:");
                int rate = sc.nextInt();

                Service service = new Service(serviceName, rate);
                list.add(service);

            }
            else if(choice.compareTo("N") == 0){
                break;
            }
            System.out.print("Add Services(Y/N): ");
            choice = strSc.nextLine();
        }

        System.out.println("\n*****BILL*****");
        System.out.println(customer.name+"   "+customer.mobile+"   "+customer.memberShip.name);
        int total = 0;
        for(int i=0; i<list.size(); i++){
            Service s = list.get(i);
            System.out.println((i+1)+". "+s.name+"   "+s.price);
            total += s.price;
        }

        int discount = (total * customer.memberShip.discount)/100;
        System.out.println("Total: "+total+"-"+discount);
        System.out.println("Please Pay: "+(total-discount));
    }
}