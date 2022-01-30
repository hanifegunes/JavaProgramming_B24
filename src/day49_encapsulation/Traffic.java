package day49_encapsulation;

public class Traffic {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red");
      //  System.out.println(light.color);
      //  light.color ="brown"; color is private,  so we can not access color from dif. class

        System.out.println(light.getColor());
       // light.color ="green"; we can not change directly
        light.setColor("green");
        System.out.println(light.getColor());
        light.setColor("brown");
        System.out.println(light.getColor());

    }
}
