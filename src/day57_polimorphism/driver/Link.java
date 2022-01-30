package day57_polimorphism.driver;

public class Link implements  WebElement{

    public  String getUrl(){
        return  "google.com";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("not valid");

    }

    @Override
    public void click() {
        System.out.println("click");

    }

    @Override
    public String getText() {
        return "Links text";
    }
}
