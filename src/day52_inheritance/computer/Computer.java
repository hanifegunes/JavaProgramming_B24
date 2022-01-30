package day52_inheritance.computer;

public class Computer {
    int memory;
    String os;
    public Computer(String os, int memory){
        this.os=os;
        this.memory =memory;

    }
    // override
    public  String toString(){
        return "OS: "+os+" Memory: "+memory ;
    }

}
