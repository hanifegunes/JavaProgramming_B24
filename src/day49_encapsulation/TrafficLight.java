package day49_encapsulation;

public class TrafficLight {

    private String color;

    public TrafficLight(String color) {
        this.color = color;

    }

    public  String getColor(){
        return  color;
    }
    public  void  setColor (String color){
      switch (color){
          case "red":
          case  "green":
          case "yellow":
              this.color= color;
              break;
          default:
              System.out.println(color + " is valid for traffic light");
      }

    }


}