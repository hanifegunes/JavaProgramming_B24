package day53_inheritance.shapes.rules;

public class C extends A{
    @Override
    public  int getNum(){
        return  6;
    }
    // getNum method cannot change access modifier because it is public and they can only be made more accessible in overriding

    @Override
    String getName() {
        return "str";
    }


}
