package homework_7custom_class.practice2;

public class Developer {
    /*
     Attributes:
                        instance: name, employee id, job title, salary
                        static: can code (boolean)

                    Constructor:
                        - accepts and sets all instance variables
                        - overload to also create an object with only the name and employee id

                    Actions:
                        coding(),  fixingBug(), toString()
     */


    String name;
    String employeeId;
    String job;
    String title;
    double salary;

    static boolean canCode;



 public  Developer(String name,String employeeId,String job,String title,double salary,boolean canCode){
     this.name= name;
     this.employeeId = employeeId;
     this.job = job;
     this.title = title;
     this.salary = salary;
     this.canCode= canCode;



}
    public  Developer (String name,String employeeId){
    // this(name,employeeId);
      this.name= name;
      this.employeeId =employeeId;

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", job='" + job + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}