package day52_inheritance.computer;

public class Mac extends Computer {
    public Mac(String os, int memory){
      //  super("java",50); you can give string and int but it will not call your constuctor, hardcoded
       // super(os,memory); for not to call Mac everytime,we give os: mac for lab class
        super("Mac",memory);

    }



        }
