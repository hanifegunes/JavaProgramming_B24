package day54_abstraction.hiding;

public class Person {
    String name = "James Bond";

}
class Baby extends  Person{
    String name = "Mike Smith"; // by creating another name variable in the sub class, we hide the name from the parent class

}
class Runner {
    public  static  void  main(String [] args){
        Person person = new Person();
        System.out.println(person.name);// james bond
        Baby baby = new Baby();
        System.out.println(baby.name); // james bond  ===inherited the name ,// we gave another name in baby class , then it changed, first name  james bond is hiding now , it became "Mike smith


    }
}
