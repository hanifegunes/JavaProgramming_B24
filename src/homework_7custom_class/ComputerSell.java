package homework_7custom_class;

public class ComputerSell {
    public static void main(String[] args) {
        Computer computer = new Computer(2000,"Dell","Black");
        System.out.println(computer);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasScreen);
    }
}
