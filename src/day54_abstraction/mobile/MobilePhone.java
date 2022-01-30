package day54_abstraction.mobile;

public class MobilePhone {
    public static void main(String[] args) {
        MobileApp app1 = new MobileApp();
        app1.setName("Generic");// because name private, we use set method to reach name
        app1.setVersion(0.1);
        app1.useApp(10);
        app1.download();

        System.out.println("------------");
        MobileInstagram instagram = new MobileInstagram();
       // MobileInstagram.name = "instagram";
        instagram.setName("instagram");
        instagram.setVersion(1.1);
        instagram.download();
        instagram.useApp(15);



    }
}
