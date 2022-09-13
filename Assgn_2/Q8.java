import java.util.*;
class Train{
    int busno;
    String from;
    String to;
    int distance;
    char type;
    public Train(String busno, String from, String to, String distance, char type){
        this.busno = Integer.parseInt(busno);
        this.from = from;
        this.to = to;
        this.distance = Integer.parseInt(distance);
        this.type = type;
    }

    int calcFare(){
        if(type == 'O') return 10 * distance;
        else if(type == 'F') return 20 * distance;
        else if(type == 'L') return 24 * distance;
        return -1;
    }

    void show(){
        System.out.println(busno+" "+from+" "+to+" "+distance+" "+type+" "+this.calcFare());
    }
}
class Q8{
    public static void main(String []arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("1-Add details\n2-Show details\n3-Exit");

        System.out.print("\nEnter choice ");
        int choice;
        ArrayList<Train> trains = new ArrayList<Train>();
        do{
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter bus details(Busno, from, to, distance, type)");
                // String str = sc.nextLine();
                Scanner scc = new Scanner(System.in);
                String sen_input = scc.nextLine();
                String array[] = sen_input.split(" ");
                char type = 'O';
                if(array.length == 5) type = array[4].charAt(0);
                Train obj = new Train(array[0], array[1], array[2],array[3], type);
                trains.add(obj);
            }else if(choice == 2){
                for(Train obj : trains){
                    obj.show();
                }
            }
        }while(choice != 3);
    }
}