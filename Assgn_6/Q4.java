import java.util.*;
abstract class Addition{
    abstract void add();
}

class IntegerAddition extends Addition{
    int num1;
    int num2;
    public IntegerAddition(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }

    void add(){
        System.out.println(num1+num2);
    }
}

class FractionAddition extends Addition{
    int num1;
    int den1;
    int num2;
    int den2;
    public FractionAddition(int a1, int b1, int a2, int b2){
        this.num1 = a1;
        this.den1 = b1;
        this.num2 = a2;
        this.den2 = b2;
    }

    public static int gcd(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;

        if(a == b) return a;
        if(a>b) return gcd(b, a%b);
        else return gcd(a, b%a);
    }

    public static int lcm(int a, int b){
        int g = gcd(a, b);
        return (a*b)/g;
    }

    void add(){
        int ansNum;
        int ansDen;

        // calculation..
        ansDen = lcm(den1, den2);
        ansNum = ((ansDen/den1)*num1) + ((ansDen/den2)*num2);

        int hcf =  gcd(ansNum, ansDen);
        ansNum = ansNum/hcf;
        ansDen = ansDen/hcf;

        System.out.println(ansNum+"/"+ansDen);
    }
}
class Q4{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       String input1 = sc.nextLine();
       String input2 = sc.nextLine();

       String[] array1 = input1.split(" ");
       String[] array2 = input2.split(" ");

       Addition obj = new IntegerAddition(Integer.parseInt(array1[0]), Integer.parseInt(array1[1]));
       obj.add();

       obj = new FractionAddition(Integer.parseInt(array2[0]), Integer.parseInt(array2[1]), Integer.parseInt(array2[2]), Integer.parseInt(array2[3]));
       obj.add();
    }
}