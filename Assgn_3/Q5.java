import java.util.*;

class Person{
    public String name;
    public Person(String name){
        this.name = name;
    }
}

class Patient extends Person{
    public String id;
    public Patient(String name, String id){
        super(name);
        this.id = id;
    }
}

class Q5{

    public static void displayPatients(Patient[] patients){
        System.out.println("\nList of Patients to be tested are:");
        for(int i=0; i<patients.length; i++){
            System.out.println(patients[i].id+" "+patients[i].name);
        }
    }

    public static boolean compare(Patient x, Patient y){
        String xID = x.id;
        String[] array = xID.split("-");
        int ageX = Integer.parseInt(array[1]);

        String yID = y.id;
        array = yID.split("-");
        int ageY = Integer.parseInt(array[1]);

        return ageX > ageY;
    }

    public static void sortPatients(Patient[] patients){
        int N = patients.length;
        for(int i=1; i<N; i++){
            Patient currentPatient = patients[i];
            int j = i-1;
            while(j>=0 && compare(currentPatient, patients[j])){
                patients[j+1] = patients[j];
                j--;
            }

            patients[j+1] = currentPatient;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.print("Enter the number of patients: ");
        int numberOfPatients = sc.nextInt();

        Patient[] patients = new Patient[numberOfPatients];

        for(int i=0; i<numberOfPatients; i++){
            System.out.println("\nEnter the details of patient "+ (i+1) +":");
           
            System.out.print("Name: ");
            String name = stringScanner.nextLine();
            
            System.out.print("Patient ID: ");
            String patientId = stringScanner.nextLine();

            Patient patient = new Patient(name, patientId);
            patients[i] = patient;
        }

        sortPatients(patients);
        displayPatients(patients);
    }
}