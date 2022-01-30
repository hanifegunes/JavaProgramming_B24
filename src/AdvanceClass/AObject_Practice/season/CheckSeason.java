package AdvanceClass.AObject_Practice.season;

public class CheckSeason {
    public static void main(String[] args) {
        Season season = new Season("adam",70,50);
        Winter winter = new Winter("edev",45,85);
        Fall fall =new Fall("you",78,65);
        winter.activity();
        fall.activity();
        System.out.println(season.toString());
        System.out.println(winter.toString());


    }
}
