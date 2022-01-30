package day54_abstraction.person;

public class WorkPlace {
    public static void main(String[] args) {
       //  Person person = new Person(); can not make a person object because it is abstract
        //    Employee employee = new Employee(); can not make a employee object because it is in abstract class
         Tester tester = new Tester();
         tester.work();
         tester.sleep(15);
         tester.jobTitle = "Tester";

         Developer developer = new Developer();
         developer.work();
         developer.sleep(20);


         Chef chef = new Chef();
         chef.work();
         chef.sleep(60);






    }
}
