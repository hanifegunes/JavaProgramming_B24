package day36_methods_void;

public class DaysInWeeks {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(2));
        String day = getDayOfWeek(1);
        System.out.println(getDayOfWeek(0));
        String day2 = getDayOfWeek(10);
        System.out.println(day2.equals(("not a valid day")));
        if(getDayOfWeek(6).equals("Saturday") || getDayOfWeek(6).equals("Sunday")){
            System.out.println("it's the weekend");
        }


    }



    public static String getDayOfWeek(int number){
        String day ="";
        switch (number){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4 :
                day = "Thursday";
                break;
            case 5 :
                day = "Friday";
                break;
            case 6 :
                day = "Saturday";
                break;
            case 7 :
                day = "Sunday";
                break;
            default:
                day = "Not a valid day";
        }
        return day;
    }






}
