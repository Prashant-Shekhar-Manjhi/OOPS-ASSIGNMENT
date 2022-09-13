import java.util.*;
class IntegerArray{
    int[] arr = new int[5];

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(strArray[i].trim());
            // hash.add(arr[i]);
        }
        
    }

    public void bubSort(){
        Set<Integer> hash = new HashSet<Integer>();
        // hash.addAll(arr);
        for(int i=0; i<5; i++){
            hash.add(arr[i]);
        }

        if(hash.size() != arr.length){
            System.out.println("INVALID INPUT");
            return;
        }

        for(int i=1; i<5; i++){
            for(int j=0; j<5-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class Q3{
    public static void main(String[]arg){
        IntegerArray obj = new IntegerArray();
        obj.inputData();
        obj.bubSort();
    }
}