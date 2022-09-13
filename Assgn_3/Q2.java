import java.util.*;
class Inventory{
    public int id;
    public String name;
    public int price;

    public Inventory(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Node{
    public Inventory data;
    public Node next;
    public Node(Inventory data){
        this.data = data;
        next = null;
    }
}

class List{
    public Node head, tail;
    public List(){
        head = tail = null;
    }

    public void insert(Inventory data){
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
    }

    Node search(int id){
        Node temp = head;
        while(temp != null){
            if(temp.data.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }
}

class InvoiceItem{
    Inventory data;
    int quantity;
    int price;
    InvoiceItem next;
    public InvoiceItem(Inventory data, int q){
        this.data = data;
        quantity = q;
        price = data.price * q;
        next = null;
    }
}

class InvoiceList{
    InvoiceItem head, tail;
    int totalPrice;
    public InvoiceList(){
        head = tail = null;
    }

    public void insertInvoiceList(InvoiceItem invoiceItem){
        if(head == null){
            head = tail = invoiceItem;
            totalPrice = invoiceItem.price;
        }else{
            tail.next = invoiceItem;
            tail = tail.next;
            totalPrice += invoiceItem.price;
        }
    }

    public void printInvoiceList(){
        InvoiceItem temp = head;
        while(temp != null){
            System.out.println(temp.data.id+", "+temp.data.name+", "+temp.data.price+", "+temp.quantity);
            temp = temp.next;
        }
        System.out.println("Total: "+totalPrice);
    }
}

class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
        
        List list = new List();

        // taking list items..
        String input = stringScanner.nextLine();
        while(true){
            String[] arr = input.split(" ");
            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            int price = Integer.parseInt(arr[2]);

            Inventory inventory = new Inventory(id, name, price);
            list.insert(inventory);

            input = stringScanner.nextLine();
            if(input.equals("OKAY")) break;
        }

        // menu...
        System.out.println("\n\n1.Add Invoice\n2.Exit\nChoice:");
        int choice = sc.nextInt();
        while(true){
            if(choice == 1){
                System.out.println("Add Invoice Item(Y/N)");
                char option = sc.next().charAt(0);
                if(option == 'Y'){
                    System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                    String invoiceDetails = stringScanner.nextLine();
                    InvoiceList invoice = new InvoiceList();
                    while(true){
                        // System.out.println(invoiceDetails);
                        String[] arr = invoiceDetails.split(" ");
                        int id = Integer.parseInt(arr[0]);
                        int quantity = Integer.parseInt(arr[1]);
                        
                        Node item = list.search(id);
                        if(item != null){
                            InvoiceItem invoiceItem = new InvoiceItem(item.data, quantity);
                            invoice.insertInvoiceList(invoiceItem);
                        }
                        
                        invoiceDetails = stringScanner.nextLine();
                        if(invoiceDetails.equals("OKAY")){
                            break;
                        }
                    }

                    System.out.println("****INVOICE****");
                    invoice.printInvoiceList();
                    System.out.println("********\n");
                }
            }
            else if(choice == 2){
                break;
            }
            else{System.out.println("Invalid choice! Please select valid choice.");}
            System.out.println("1.Add Invoice\n2.Exit");
            choice = sc.nextInt();
        }
    }
}