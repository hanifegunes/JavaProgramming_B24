package day44_custom_classes;

public class AllPeople {
    public static void main(String[] args) {



 // make person object
 Person personOne = new Person();// made a person  object, made an instance of person class
 personOne.name = "James Bond";
    personOne.age = 40;
   // age= 40; there is no local age

   personOne.haiColor ="Black";
   personOne.sex = 'M';
   personOne.isMarried = false;

   // how to print each field?
   // in order to access to each instance variable we need to use the references.



        System.out.println(personOne);// gives memory index
        System.out.println("Name: "+ personOne.name);
        System.out.println("Age: "+ personOne.age);
        System.out.println("Hair color: "+ personOne.haiColor);
        System.out.println("Sex: "+ personOne.sex);
        System.out.println("Married: "+ (personOne.isMarried ? "yes" : "no"));

      //  System.out.println(Person.name); name cannot be accessed because it is not being used with an object




}}
