package AdvanceClass.AObject_Practice.season;

public class Fall extends Season{

    public Fall(String name, int highTemp, int lowTemp){
        super( name, highTemp, lowTemp);
}

@Override
    public void activity(){
    System.out.println("Read a book");
}

    @Override
    public String toString() {
        return "Fall{" +
                "name='" + name + '\'' +
                ", highTemp=" + highTemp +
                ", lowTemp=" + lowTemp +
                '}';
    }
}