package office_hours.practice_11_17;

public class AllPeople {
    public static void main(String[] args) {

      Person obj = new Person();
      obj.setName("James");

      try{
          obj.setAge(40);
      } catch (Exception e){


      }
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

       // obj.setName(null);

          try{
              obj.setAge(-20);

          }catch(Exception e){
              System.out.println("Invalid age");

          }



    }
}
