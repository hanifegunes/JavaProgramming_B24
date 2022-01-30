package office_hours.practice_10_27;

import java.util.ArrayList;

public class Module {
    ArrayList<File>files;

    public  Module(){
        files = new ArrayList<>();
    }
    public  Module(ArrayList<File> files){
        this();
        this.files.addAll(files);
    }





}
