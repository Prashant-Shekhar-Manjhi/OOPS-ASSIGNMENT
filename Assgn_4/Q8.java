import java.util.*;

class Student{
    String name;
    int rollNo;
    int engScore;
    int hinScore;
    int matScore;
    int sciScore;
    int sstScore;
    int total;

    Student(String n, int r, int e, int h, int m, int s, int ss){
        name = n;
        rollNo = r;
        engScore = e;
        hinScore = h;
        matScore = m;
        sciScore = s;
        sstScore = ss;
        total = e + h + m + s + ss;
    }
}

class Q8{
    ArrayList<Student> list = new ArrayList<>();

    public void sort(){
        int n = list.size();
        Student [] tempList = new Student[list.size()];
        for(int i=0; i<n; i++){
            tempList[i] = list.get(i);
        }

        for(int i=1; i<n-1; i++){
            for(int j=0; j<n-i; j++){
                Student s1 = tempList[j];
                Student s2 = tempList[j+1];
                if(s1.rollNo > s2.rollNo){
                    Student temp = tempList[j];
                    tempList[j] = tempList[j+1];
                    tempList[j+1] = temp;
                }
            }
        }
        list.clear();
        for(int i=0; i<n; i++){
            list.add(tempList[i]);
        }
    }

    public void addStudent(){

        Scanner sc = new Scanner(System.in);
        Scanner strSc = new Scanner(System.in);
        String str = strSc.nextLine();
        String []strArr = str.split(" ");

        Student student = new Student(
            strArr[0],
            Integer.parseInt(strArr[1].trim()),
            Integer.parseInt(strArr[2].trim()),
            Integer.parseInt(strArr[3].trim()),
            Integer.parseInt(strArr[4].trim()),
            Integer.parseInt(strArr[5].trim()),
            Integer.parseInt(strArr[6].trim())
        );

        list.add(student);
    }
 
    public void subjectTopper(int code){
        int n = list.size();
        int maxi = 0;
        if(code == 101){
            //English
            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.engScore > maxi) maxi = st.engScore;
            }

            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.engScore == maxi){
                    System.out.println(st.name+" "+st.rollNo);
                }
            }     
        }
        else if(code == 102){
            //hindi
            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.hinScore > maxi) maxi = st.hinScore;
            }

            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.hinScore == maxi){
                    System.out.println(st.name+" "+st.rollNo);
                }
            } 
        }
        else if(code == 103){
            //Maths
            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.matScore > maxi) maxi = st.matScore;
            }

            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.matScore == maxi){
                    System.out.println(st.name+" "+st.rollNo);
                }
            } 
        }
        else if(code == 104){
            //science
            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.sciScore > maxi) maxi = st.sciScore;
            }

            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.sciScore == maxi){
                    System.out.println(st.name+" "+st.rollNo);
                }
            } 
        }
        else if(code == 105){
            //social studies
            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.sstScore > maxi) maxi = st.sstScore;
            }

            for(int i=0; i<n; i++){
                Student st = list.get(i);
                if(st.sstScore == maxi){
                    System.out.println(st.name+" "+st.rollNo);
                }
            } 
        }      
    }

    public void classTopper(){
        int maxi = 0;
        int n = list.size();
        for(int i=0; i<n; i++){
            Student st = list.get(i);
            if(st.total > maxi) maxi = st.total;
        }

        for(int i=0; i<n; i++){
            Student st = list.get(i);
            if(st.total == maxi){
                System.out.println(st.name+" "+st.rollNo);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Q8 students = new Q8();
        students.sort();
        char ch = sc.next().charAt(0);
        while(ch != 't'){
            if(ch == 'a'){
                students.addStudent();
            }
            else if(ch == 's'){
                int code = sc.nextInt();
                students.subjectTopper(code);
            }
            else if(ch == 'c'){
                students.classTopper();
            }
            ch = sc.next().charAt(0);
        }
    }
}