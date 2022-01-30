package day57_polimorphism.driver;

public class Input implements  WebElement{
    @Override
    public void sendKeys(String txt) {
        System.out.println("Sending "+ txt);

    }

    @Override
    public void click() {
        System.out.println("Waiting for the txt");

    }

    @Override
    public String getText() {
        return "Inputs name";
    }
}
