package AdvanceClass.AObject_Practice.season;

public class Winter extends Season{
    public Winter(String name, int highTemp, int lowTemp){
        super( name, highTemp, lowTemp);

    }
    @Override

    public void  activity(){
        System.out.println("using fireplace");
    }

    @Override
    public String toString() {
        return "Winter{" +
                "name='" + name + '\'' +
                ", highTemp=" + highTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}
