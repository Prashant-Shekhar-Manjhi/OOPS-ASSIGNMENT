import java.util.*;

class Student{
    public String name;
    public int rollNo;
    public int height;

    public Student(String name, int rollNo, int height){
        this.name = name;
        this.rollNo = rollNo;
        this.height = height;
    }
}
class Q3{
    static Student[] students;

    public void helping(){
        TreeMap<Integer, Student> hash = new TreeMap<Integer, Student>();
        int n = students.length;

        for(int i=0; i<n; i++){
            if(!hash.containsKey(students[i].height)){
                hash.put(students[i].height, students[i]);
            }else{
                if(students[i].name.compareTo(hash.get(students[i].height).name) < 0){
                    hash.put(students[i].height, students[i]);
                }
            }
        }

        // iteration over TreeMap.entrySet()
        String[] temp = new String[hash.size()];
        int k =0;
        for (Map.Entry<Integer, Student> entry : hash.entrySet()){
            // System.out.println(entry.getValue().name);
            temp[k] = entry.getValue().name;
            k++;
        }
        int size = temp.length;
        System.out.println();
        System.out.println(size);
        for(int i=0; i<(size-1); i++){
            System.out.print(temp[i]+",");
        }

        System.out.println(temp[size-1]);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Q3 obj = new Q3();
        obj.students = new Student[n];
        for(int i=0; i<n; i++){
            Scanner strSc = new Scanner(System.in);
            String input = strSc.nextLine();
            String filteredInput = "";
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) != '(' && input.charAt(j) != ')'){
                    filteredInput = filteredInput + input.charAt(j);
                }
            }
            String[] filteredArray = filteredInput.split(",");
            Student student = new Student(filteredArray[0], Integer.parseInt(filteredArray[1].trim()), Integer.parseInt(filteredArray[2].trim()));
            students[i] = student;
        }

        obj.helping();
    }
}