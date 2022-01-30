package AdvanceClass.AObject_Practice.season;

public class Season {
    String name;
    int highTemp;
    int lowTemp;

    public Season(String name, int highTemp, int lowTemp) {
        this.name = name;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }
    public  void activity(){
        System.out.println("Season");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highTemp=" + highTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}
