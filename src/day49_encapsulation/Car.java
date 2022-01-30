package day49_encapsulation;

public class Car {
      Driver driver; // this is the reference
    public  Car(String name, String licenseNumber, int age){     // this is the car constructor
       driver = new Driver(name,licenseNumber,age);// creates new Driver object
    }


}

      /*
      String driver;// name, licNum, age
    String engine; // cylinder, horsePower

 */
class  Driver{
    String name;
    String licenseNumber;
    int age;



            public Driver(String name, String licenseNumber, int age) {
                  this.name= name;
                  this.licenseNumber = licenseNumber;
                  this.age= age;
            }

            @Override
            public String toString() {
                  return "Driver{" +
                          "name='" + name + '\'' +
                          ", licenseNumber='" + licenseNumber + '\'' +
                          ", age=" + age +
                          '}';
            }
      }
