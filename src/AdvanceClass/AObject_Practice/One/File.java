package AdvanceClass.AObject_Practice.One;

public class File {
    String name;
    double size;
    public  File(String name, int size){
        this.name =name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public  void openFile(){
        System.out.println("opening file "+ name);
    }

}
