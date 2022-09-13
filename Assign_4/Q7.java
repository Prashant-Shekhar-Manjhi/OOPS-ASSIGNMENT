import java.util.*;

class Angle{
    public int degrees;
    public int minutes;

    public Angle(int degrees, int minutes){
        this.degrees = degrees;
        this.minutes = minutes;
    }
}

class Q7{

    public static Angle add(Angle a1, Angle a2){
        int d = a1.degrees + a2.degrees;

        int m = a1.minutes + a2.minutes;
        d += (m/60);
        m = m%60;

        Angle res = new Angle(d, m);
        return res;
    }

    public static void main( String[] ar){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String [] arr1 = str1.split(" ");   
        Angle angle1 = new Angle(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]));

        String [] arr2 = str2.split(" ");   
        Angle angle2 = new Angle(Integer.parseInt(arr2[0]), Integer.parseInt(arr2[1]));  

        Angle result = add(angle1, angle2);

        System.out.println(result.degrees+" "+result.minutes);
    }
}