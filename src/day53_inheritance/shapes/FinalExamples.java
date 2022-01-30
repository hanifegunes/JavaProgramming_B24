package day53_inheritance.shapes;

public class FinalExamples {
    final int a;
    public  static  final String PLANET = "Earth";

    public FinalExamples(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        FinalExamples obj = new FinalExamples(5);
        System.out.println(obj.a);
       //  obj.a = 10; a is the final, so we cannot change the value
      //  PLANET = "Mars"; can not reassign
    }
}
