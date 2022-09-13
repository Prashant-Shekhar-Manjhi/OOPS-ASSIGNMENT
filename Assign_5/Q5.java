import java.util.*;

class Car{
    String modelName;
    String engineNumber;
    int basePrice;
    int extraCharges;

    public Car(String modelName, String engineNumber, int basePrice, int extraCharges){
        this.modelName = modelName;
        this.engineNumber = engineNumber;
        this.basePrice = basePrice;
        this.extraCharges = extraCharges;
    }

    public int totalPrice(){
        return basePrice + extraCharges;
    }
}

class Dealer{
    String dealerName;
    int discountPercentage;
    Car car;

    public Dealer(Car car, String dealerName, int discountPercentage){
        this.car = car;
        this.dealerName = dealerName;
        this.discountPercentage = discountPercentage;
    }

    public int onRoadPrice(){
        int discount = (car.totalPrice() * discountPercentage)/100;
        return car.totalPrice() - discount;
    }
}

class Q5{
    public static void main(String [] args){
        Dealer[] dealers;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dealers = new Dealer[n];
        for(int i=0; i<n; i++){
            Scanner strSc = new Scanner(System.in);
            String input = strSc.nextLine();
            String[] inputArray = input.split(" ");

            Car car = new Car(inputArray[0], inputArray[1], Integer.parseInt(inputArray[2]), Integer.parseInt(inputArray[3]));
            Dealer dealer = new Dealer(car, inputArray[4], Integer.parseInt(inputArray[5]));

            dealers[i] = dealer;
        }

        for(int i=0; i<n; i++){
            System.out.println(dealers[i].car.modelName+" "+dealers[i].car.totalPrice()+" "+dealers[i].onRoadPrice());
        }
    }
}