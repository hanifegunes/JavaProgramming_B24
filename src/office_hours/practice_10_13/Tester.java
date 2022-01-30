package office_hours.practice_10_13;

public class Tester {
   // String name, jobTitle;
 //   int employeeId;
   // double salary;
/*
    public Tester(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Tester(String name, String jobTitle, int employeeId, double salary) {
        this(name, employeeId);
        this.jobTitle = jobTitle;

        this.salary = salary;
    }
    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }

 */
String  name;
    int employeeId;
    String jobTitle;
    double salary;
    public  Tester(String name, int employeeId){
        this.name= name;
        this.employeeId = employeeId;
    }
    public  Tester(String name, int employeeId,String jobTitle, double salary){
        this(name,employeeId);
        this.jobTitle= jobTitle;
        this.salary = salary;
    }
    public  void smokeTesting(){
        System.out.println(name+" Smoke testing");
    }
    public  void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }

}



