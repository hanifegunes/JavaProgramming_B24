package office_hours.practice_08_26;

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjam";
        int firstBreadEnd = str.indexOf("bread")+5;
        int secondBread = str.indexOf("bread",firstBreadEnd);
        if (firstBreadEnd >= 0 && secondBread >= 0 ){
            System.out.println(str.substring(firstBreadEnd, secondBread));
        }else {
            System.out.println("nothing");
        }



    }
}
