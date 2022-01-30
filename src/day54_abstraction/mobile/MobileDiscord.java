package day54_abstraction.mobile;

public class MobileDiscord extends  MobileApp {
    public  void  chat(){
        System.out.println("Chatting on"+ getName());
    }

    @Override
    public  void useApp(int minutes){
        super.useApp(minutes);
        chat();
    }



}
