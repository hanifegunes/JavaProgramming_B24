package office_hours.practice_9_02;

public class GoogleResult {
    public static void main(String[] args) {
        String s = "About 9,740,000,000 results (120.3 seconds)";

        int startOfResult = s.indexOf(' ') + 1;
        int endOfResult = s.indexOf(" results");

        System.out.println(s.substring(startOfResult, endOfResult));

        int startOfTime = s.indexOf('(') + 1;
        int endOfTime = s.indexOf(" seconds");

        System.out.println(s.substring(startOfTime, endOfTime));



    }
}
