package AdvanceClass.AObject_Practice.bigger_task;

public class GetEntertainment {
    public static void main(String[] args) {

        Netflix netflix = new Netflix("Break",4, 5, "Breaking bad",2);
        //Netflix(String showName,int episode,int season,String name,double duration)

        System.out.println(netflix.company);
        System.out.println(netflix.name);
        System.out.println(netflix.showName);

        KevinHart kevin = new KevinHart("Chicago", "special name", "11/4/21");

    }
}
