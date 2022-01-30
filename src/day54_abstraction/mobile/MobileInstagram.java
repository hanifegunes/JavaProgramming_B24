package day54_abstraction.mobile;

public class MobileInstagram extends MobileApp {
    public  void postPhoto(){
        System.out.println("Posting photo");
    }
    @Override
    public  void  useApp(int minutes){
        super.useApp(minutes);
        postPhoto();
    }

}
