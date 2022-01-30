package homework_7custom_class;

public class CarSell {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes");
        Car car2 = new Car("Ford","Escape");
        Car car3 = new Car("Ford","Escape",2020);
        Car car4 = new Car("Ford","Escape",2020,"Red");
        Car car5 = new Car("Ford","Escape",2020,"Red",30000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
