package AdvanceClass.AObject_Practice.season;

public class Spring extends Season{
  public  Spring ( String name, int highTemp, int lowTemp){
        super( name, highTemp, lowTemp);
}

  @Override
    public  void activity(){
      System.out.println("Go outside");
  }

  @Override
  public String toString() {
    return "Spring{" +
            "name='" + name + '\'' +
            ", highTemp=" + highTemp +
            ", lowTemp=" + lowTemp +
            '}';
  }
}