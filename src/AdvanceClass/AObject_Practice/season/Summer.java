package AdvanceClass.AObject_Practice.season;

public class Summer  extends  Winter{
    public Summer(String name, int highTemp, int lowTemp){
        super( name, highTemp, lowTemp);
}
@Override
public  void activity (){
    System.out.println("Drink Lemonade");
}

    @Override
    public String toString() {
        return "Summer{" +
                "name='" + name + '\'' +
                ", highTemp=" + highTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}