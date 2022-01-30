package day46_constructors;

public class ThisKeyWord {
    int a = 100;// instance variable
    public  ThisKeyWord(int a){ // local variable -- java prioritises local variables
        System.out.println(a);// this is local just in these {}
        a= 400;// reassigned a to be 400

    }
    public  static void  main (String [] args){
        ThisKeyWord obj = new ThisKeyWord(200);
        System.out.println(obj.a);// a = 100 a is changed just in constructor , not in class

        //System.out.println(a); can not

    }

}
