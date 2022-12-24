import java.util.*;
class IntArray{
	void add(int[] array, int idx, int size, int item){
		if(idx < size-1){
			idx++;
			array[idx] = item;
		}else{
			System.out.println("The Array is full");
		}
	}
}

class SortedIntArray extends IntArray{
	void add(int[] array, int idx, int size, int item){
		if(idx < size-1){
			idx++;
			array[idx] = item;
			//Arrays.sort(array);
		}else{
			System.out.println("The Array is full");
		}
	}
}

class Q1{
	int[] array = new int[100];
	int idx = -1;
	int size = 0;

	void printArray(){
		for(int i=0; i<size; i++){
			System.out.print(" "+array[i]);
		}
		System.out.println();
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Element: ");
		int n = sc.nextInt();
		
		Q1 obj1 = new Q1();
		IntArray obj = new IntArray();
		
		System.out.println("1. Add element to list\n 2. Add to sorted list\n 3. Exit ");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		while(true){
			if(choice == 1){
				System.out.print("Enter a number: ");
				int item = sc.nextInt();
				obj.add(obj1.array, item);
			}
			else if(choice == 2){
				System.out.print("Enter a number: ");
				int item = sc.nextInt();
				obj = new SortedIntArray();
				obj.add(item);
			}
			else if(choice == 3){
				break;
			}
			
			for(int i=0; i<=obj.idx; i++){
				System.out.print(obj.array[i]+" ");
			}
			System.out.println();
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
		}
		
	}
}
