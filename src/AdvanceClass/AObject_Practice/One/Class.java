package AdvanceClass.AObject_Practice.One;

public class Class {
    String name;
    double size;



    public Class(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
    public  void File(){
        System.out.println("opening file "+ name);
    }



}
