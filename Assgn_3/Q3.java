import java.util.*;

class Meeting{
    public String meetingTitle;
    public String date, meetingStartTime, meetingEndTime, meetingDescription;

    public Meeting(String meetingTitle, String date, String meetingStartTime, String meetingEndTime, String meetingDescription){
        this.meetingTitle = meetingTitle;
        this.date = date;
        this.meetingStartTime = meetingStartTime;
        this.meetingEndTime = meetingEndTime;
        this.meetingDescription = meetingDescription;
    }

}

class DepartmentMeetingScheduler{
    ArrayList<Meeting> list;

    DepartmentMeetingScheduler(){
        list = new ArrayList<Meeting>();
    }

    int parseTime(String str){
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ':') temp += str.charAt(i);
        }

        return Integer.parseInt(temp);
    }

    boolean slotAvailable(Meeting meeting){
        for(int i=0; i<list.size(); i++){
            Meeting curMeet = list.get(i);
            int meetingStartTime = parseTime(meeting.meetingStartTime);
            int meetingEndTime = parseTime(meeting.meetingEndTime);
            int curMeetStartTime = parseTime(curMeet.meetingStartTime);
            int curMeetEndTime = parseTime(curMeet.meetingEndTime);
            if(curMeet.date.equals(meeting.date) && !(meetingStartTime > curMeetEndTime || curMeetStartTime > meetingEndTime)) return false;
        }
        return true;
    }

    public void scheduleMeeting(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Title - ");
        String title = sc.nextLine();

        System.out.print("Date - ");
        String date = sc.nextLine();

        System.out.print("Start time - ");
        String startTime = sc.nextLine();

        System.out.print("End time - ");
        String endTime = sc.nextLine();

        System.out.print("Description - ");
        String description = sc.nextLine();

        Meeting meeting = new Meeting(title, date, startTime, endTime, description);
        if(slotAvailable(meeting)){
            list.add(meeting);
            System.out.println("Scheduled successfully");
        }else{
            System.out.println("Collision! Already another meeting is scheduled");
        }
    }

    public void displayMeeting(){
        for(int i=0; i<list.size();i++){
            Meeting meeting = list.get(i);
            System.out.println("On "+meeting.date+", from "+meeting.meetingStartTime+" to "
                                +meeting.meetingEndTime+" : "+meeting.meetingTitle+" : "
                                +meeting.meetingDescription);
        }
    }
}

class Q3{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Schedule Meeting\n2. List Meeting");

        DepartmentMeetingScheduler schedular = new DepartmentMeetingScheduler();

        System.out.println("\nEnter you choice:");
        int choice = sc.nextInt();
        while(true){
            if(choice == 1){
                schedular.scheduleMeeting();
            }
            else if(choice == 2){
                if(schedular.list.size()>0){
                    schedular.displayMeeting();
                }
            }
            else{
                break;
            }

            System.out.println("\nEnter you choice:");
            choice = sc.nextInt();

        }
    }
}