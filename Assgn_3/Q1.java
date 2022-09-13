import java.util.*;
class Node{
    public char data;
    public Node next;
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class List{
    public Node head;
    public Node tail;
    public List(){
        head = tail = null;
    }

    public void insert(char data){
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

class ReverseMain{
    public List reverseList(List list){
        if(list.head == null) return null;
        Node prev, cur, temp;
        prev = null;
        cur = temp = list.head;
        list.tail = list.head;
        while(cur != null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        list.head = prev;
        return list;
    }
}

class Q1{
    public static void main(String[] args){
        List list = new List();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter the data in Node "+ (i+1) +" : ");
            char ch = sc.next().charAt(0);
            list.insert(ch);
        }

        ReverseMain obj = new ReverseMain();
        list = obj.reverseList(list);
        list.printList();
    }
}